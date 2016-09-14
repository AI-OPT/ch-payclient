/**
 * 版权所有(C) 2015 深圳市雁联计算系统有限公司
 * 创建:YangHan 2015-3-12
 */
package com.ylink.upp.base.oxm.util;

import org.dom4j.*;
import org.dom4j.io.SAXReader;
import org.dom4j.tree.DefaultElement;

import javax.xml.XMLConstants;
import java.io.StringReader;

/**
 * Note: dom4j帮助类
 * Desc: OXMService.marshal编组对象为xml时，会生成过多的其它命名空间
 *       该类负责把xml内容还原为最简单的满足需求的格式
 * @author YangHan
 * @date 2015-3-12
 */
public class Dom4jHelper {

	private static final String TWS_XMLNS_PREFIX = "twsdefault2013";
	/**
	 * 重建xml
	 * @param xml
	 * @return
	 * @throws DocumentException
	 * @throws Exception
	 */
	public static String rebuildXml(String xml, String encoding) throws DocumentException {
		SAXReader reader = new SAXReader();
		reader.setEncoding(encoding);
		reader.getDocumentFactory().setXPathNamespaceURIs(null);
		StringReader sr = new StringReader(xml);
		Document doc = reader.read(sr);
		Namespace ns = doc.getRootElement().getNamespace();
		doc.accept(new NameSpaceCleaner());

		doc.getRootElement().add(new Namespace("xsi", XMLConstants.W3C_XML_SCHEMA_INSTANCE_NS_URI));
		doc.getRootElement().addAttribute("xmlns", ns.getURI() + ".xsd");
		String result = doc.asXML();

		//暴力处理办法，为默认命名空间添加一个特殊的前缀，再用字符串把这个前缀擦掉
		String sep_fx = "xmlns:" + TWS_XMLNS_PREFIX;
		if(result.contains(sep_fx)){
			result = result.replaceFirst(sep_fx, "xmlns");
		}
		String document = "<Document ";
		if(result.contains(document)){
			result = result.replaceFirst(document,document + "xmlns=\"" + ns.getURI() + "\" ");
		}
		result = result.replaceAll("&gt;", ">");
		return result;
	}

	/**
	 * 命名空间清除器
	 * @author Administrator
	 *
	 */
	private static final class NameSpaceCleaner extends VisitorSupport {
		public void visit(Document document) {
			((DefaultElement) document.getRootElement())
					.setNamespace(Namespace.NO_NAMESPACE);
			document.getRootElement().additionalNamespaces().clear();
		}

		public void visit(Namespace namespace) {
			namespace.detach();
		}

		public void visit(Attribute node) {
			if (node.toString().contains("xmlns")
					|| node.toString().contains("xsi:")) {
				node.detach();
			}
		}

		public void visit(Element node) {
			if (node instanceof DefaultElement) {
				((DefaultElement) node).setNamespace(Namespace.NO_NAMESPACE);
			}
		}
	}

	/**
	 * 添加命名空间
	 * @param xmlMsg
	 * @param xmlType
	 * @param enconding
	 * @return
     * @throws Exception
     */
	public static String addNamespace(String xmlMsg,String xmlType,String enconding) throws Exception {
		SAXReader reader = new SAXReader();
		reader.setEncoding(enconding);
		StringReader sr = new StringReader(xmlMsg);
		Document doc = reader.read(sr);
		Element root = doc.getRootElement();
		root.addNamespace("xmlns",xmlType);
		String xml = doc.asXML();
		//暴力转换
		String namespace = "xmlns:xmlns";
		if(xml.contains(namespace)){
			xml = xml.replaceFirst(namespace, "xmlns");
		}
		return xml.replaceAll("\r|\n", "");
	}
}
