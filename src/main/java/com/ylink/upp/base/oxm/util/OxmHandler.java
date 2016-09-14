/**
 * 版权所有(C) 2015 深圳市雁联计算系统有限公司
 * 创建:YangHan 2015-3-12
 */
package com.ylink.upp.base.oxm.util;

import org.apache.commons.lang.StringUtils;
import org.dom4j.DocumentException;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;
import org.springframework.oxm.XmlMappingException;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;


/**
 * Oxm处理类
 * @author YangHan
 * @date 2015-3-12
 */
public class OxmHandler {

	private Marshaller marshaller;
	private Unmarshaller unmarshaller;

	private final String SEND_ENCODE = "UTF-8";

	public Object unmarshaller(String xmlString) throws IOException {
		if(StringUtils.isEmpty(xmlString)) return null;
		try {
			return unmarshaller.unmarshal(new StreamSource(new StringReader(xmlString)));
		} catch (IOException localIOException) {
		      throw new IOException(localIOException);
		}catch (XmlMappingException localXmlMappingException){
		     throw new IOException(localXmlMappingException);
		}
	}

	public String marshal(Object paramObject) throws IOException {
		return marshal(paramObject, SEND_ENCODE);
	}

	public String marshal(Object paramObject, String paramString) throws IOException {
		StringWriter localStringWriter = new StringWriter();
		StreamResult localStreamResult = new StreamResult(localStringWriter);
		try {
			this.marshaller.marshal(paramObject, localStreamResult);
			String str2 = localStringWriter.toString();
			return Dom4jHelper.rebuildXml(str2, paramString);
		} catch (IOException localIOException) {
			throw new IOException(localIOException);
		} catch (XmlMappingException localXmlMappingException) {
			throw new IOException(localXmlMappingException);
		} catch (DocumentException localDocumentException) {
			throw new IOException("对象编组为报文时进行xml格式调整异常");
		}
	}
	public void setUnmarshaller(Unmarshaller unmarshaller) {
		this.unmarshaller = unmarshaller;
	}

	public void setMarshaller(Marshaller marshaller) {
		this.marshaller = marshaller;
	}
}
