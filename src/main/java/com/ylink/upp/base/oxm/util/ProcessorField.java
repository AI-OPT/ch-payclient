/**
 * 版权所有(C) 2015 深圳市雁联计算系统有限公司
 * 创建:YangHan 2015-3-15
 */
package com.ylink.upp.base.oxm.util;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author YangHan
 * @date 2015-3-15
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ProcessorField{
	//填充值
	String fillValue() default " ";
	//填充类型
	FieldProcessorType type();
	//长度
	int length();
	//序号
	int serial();
}
