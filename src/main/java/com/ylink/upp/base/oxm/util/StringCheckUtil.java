/**
 * 版权所有(C) 2015 深圳雁联计算系统有限公司
 * 创建：YangHan  15/11/21.
 */
package com.ylink.upp.base.oxm.util;

import org.apache.commons.lang.StringUtils;

/**
 * author YangHan
 * data 15/11/21
 */
public class StringCheckUtil {

    public static String checkEmpty(String value){
        return StringUtils.isEmpty(value) ? null : value;
    }

}
