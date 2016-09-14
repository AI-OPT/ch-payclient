package com.ylink.upp.base.oxm.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;

public class TwsJaxb2Marshaller extends Jaxb2Marshaller
{
  private static Log log = LogFactory.getLog(TwsJaxb2Marshaller.class);
  private String[] schemasToScan;
  private Schema cusSchema;

  public void setSchemasToScan(String[] paramArrayOfString)
  {
    this.schemasToScan = paramArrayOfString;
  }

  protected void initJaxbMarshaller(Marshaller paramMarshaller)
    throws JAXBException
  {
    super.initJaxbMarshaller(paramMarshaller);
    try
    {
      if (getCusSchema() != null)
      {
        log.debug("为marshaller设置schema资源");
        paramMarshaller.setSchema(getCusSchema());
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      new RuntimeException( "加载schema文件发生异常" + localException.getMessage());
    }
  }
  protected void initJaxbUnmarshaller(Unmarshaller paramUnmarshaller)
    throws JAXBException
  {
    super.initJaxbUnmarshaller(paramUnmarshaller);
    try
    {
      if (getCusSchema() != null)
      {
        log.debug("为marshaller设置schema资源");
        paramUnmarshaller.setSchema(getCusSchema());
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      new RuntimeException( "加载schema文件发生异常" + localException.getMessage());
    }
  }

  public Schema getCusSchema()
    throws Exception
  {
    if (this.cusSchema == null)
      loadSchemasFromScan();
    log.debug("扫描后cusSchema: " + this.cusSchema);
    return this.cusSchema;
  }

  private void loadSchemasFromScan()
    throws Exception
  {
    if ((this.schemasToScan == null) || (this.schemasToScan.length <= 0))
      return;
    log.debug("系统配置了schema扫描路径，进行扫描加载所有schema资源文件");
    Jaxb2SchemaResourceScanner localJaxb2SchemaResourceScanner = new Jaxb2SchemaResourceScanner(this.schemasToScan);
    localJaxb2SchemaResourceScanner.scanPackages();
    this.cusSchema = localJaxb2SchemaResourceScanner.getSchema();
  }
}
