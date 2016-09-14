/**
 * 版权所有(C) 2015 深圳市雁联计算系统有限公司
 * 创建:YangHan 2015-3-12
 */
package com.ylink.upp.base.oxm.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.oxm.support.SaxResourceUtils;
import org.springframework.util.Assert;
import org.springframework.util.ClassUtils;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.sax.SAXSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Jaxb Schema扫描加载器
 * @author YangHan
 * @date 2015-3-12
 */
public class Jaxb2SchemaResourceScanner {

	private static Logger log = LoggerFactory.getLogger(Jaxb2SchemaResourceScanner.class);

	private static final String RESOURCE_PATTERN = "/*.xsd";

	private String[] schemasToScan;

	private ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();

	private Schema schema;

	Jaxb2SchemaResourceScanner(String[] schemasToScan) {
		this.schemasToScan = schemasToScan;
	}

	public void scanPackages() throws Exception {
		List<Resource> enableList = new ArrayList<Resource>();
		for (String spath : schemasToScan) {
			log.debug("schema资源路径: "
					+ ClassUtils.convertClassNameToResourcePath(spath));
			String pattern = ClassUtils.convertClassNameToResourcePath(spath) + RESOURCE_PATTERN;
			Resource[] resources = resourcePatternResolver
					.getResources(pattern);
			log.debug("schema资源" + resources);
			for (Resource resource : resources) {
				if (resource.exists()) {
					enableList.add(resource);
				}
			}
		}
		Resource[] rs = new Resource[enableList.size()];
		enableList.toArray(rs);
		schema = loadSchema(rs);
	}

	private Schema loadSchema(Resource[] resources) throws IOException,
			SAXException {
		Assert.notEmpty(resources, "schema扫描资源文件不能全为空");
		Source[] schemaSources = new Source[resources.length];
		XMLReader xmlReader = XMLReaderFactory.createXMLReader();
		xmlReader.setFeature("http://xml.org/sax/features/namespace-prefixes",
				true);
		for (int i = 0; i < resources.length; i++) {
			Assert.notNull(resources[i], "schema扫描路径不能为空");
			Assert.isTrue(resources[i].exists(), "schema资源文件 " + resources[i]
					+ " 不存在");
			InputSource inputSource = SaxResourceUtils
					.createInputSource(resources[i]);
			schemaSources[i] = new SAXSource(xmlReader, inputSource);
		}
		SchemaFactory schemaFactory = SchemaFactory
				.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		return schemaFactory.newSchema(schemaSources);
	}

	public Schema getSchema() {
		return schema;
	}
}
