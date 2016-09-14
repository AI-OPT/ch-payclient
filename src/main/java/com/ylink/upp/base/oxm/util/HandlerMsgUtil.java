package com.ylink.upp.base.oxm.util;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.code.lightssh.common.util.ReflectionUtil;

public class HandlerMsgUtil
{

  private static final String ENCODE = "UTF-8";
  private static final Logger log = LoggerFactory.getLogger(HandlerMsgUtil.class);

  private static void check(Object object) throws Exception {
  }

  public static void conversion(String msg,Object object) throws Exception{
	  Map<Integer,Conversion> paramMap = findFieldParam(object);
	  int index = 0;
	  for (int i = 1; i <= paramMap.size();i++) {
		Conversion conversion = paramMap.get(i);
		if(conversion == null) continue;
		String value = parseValueByGBK(index, conversion.getProcessorField().length(), msg);
		index += conversion.getProcessorField().length();
		ReflectionUtil.reflectSetValue(object, conversion.getFieldName(), value.trim());
	}
	check(object);
  }
  private static Map<Integer,Conversion> findFieldParam(Object object){
	  Class<?> clazz = object.getClass();
	  Field[] fields = clazz.getDeclaredFields();
	  Map<Integer,Conversion> map = new HashMap<Integer, Conversion>();
	  for (Field field : fields) {
		  if(field.isAnnotationPresent(ProcessorField.class)){
			 ProcessorField processorField = field.getAnnotation(ProcessorField.class);
			 if(processorField == null) continue;
			 map.put(processorField.serial(), new Conversion(processorField, field.getName()));
		  }
	}
	return map;
  }
  private static String parseValueByGBK(int paramInt1, int paramInt2, String paramString)
  {
    String str = "";
    try
    {
      byte[] arrayOfByte1 = paramString.getBytes(ENCODE);
      if (paramInt1 + paramInt2 > arrayOfByte1.length)
        return "";
      byte[] arrayOfByte2 = new byte[paramInt2];
      for (int i = 0; i < paramInt2; ++i)
        arrayOfByte2[i] = arrayOfByte1[(paramInt1 + i)];
      str = new String(arrayOfByte2, "GBK");
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      log.error("解析文件中一行记录，取包含中文内容时出错!", localUnsupportedEncodingException);
    }
    catch (Exception localException)
    {
      log.error("解析文件中一行记录，取包含中文内容时出错!", localException);
    }
    return str;
  }
}