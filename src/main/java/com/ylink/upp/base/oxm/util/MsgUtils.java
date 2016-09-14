/**
 * 版权所有(C) 2015 深圳雁联计算系统有限公司
 * 创建：YangHan  16/5/10.
 */
package com.ylink.upp.base.oxm.util;

import com.google.code.lightssh.common.ApplicationException;
import com.upp.docking.covn.MsgString;
import org.apache.commons.lang.StringUtils;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/**
 * author YangHan
 * data 16/5/10
 */
public class MsgUtils {

    public static MsgString patch(String msg){
        MsgString msgStr = new MsgString();

        // 返回位置
        int retPos = -1;
        // 开始位置
        int startIndex = -1;
        // 结束位置
        int endIndex = -1;
        // 偏移位置
        int offset = -1;

        String header = "";
        String digitalSign = "";
        String xmlBody = "";
        String details = "";
        List<String> list = new ArrayList<String>();

        try {
            // 解析报文头信息
            retPos = msg.indexOf(Context.HEADER_BEGIN);
            //log.debug("header pos =" + retPos);
            endIndex = msg.indexOf(Context.END_FLAG);
            if (retPos == 0) {
                startIndex = msg.indexOf(Context.HEADER_BEGIN);
                header = msg.substring(startIndex, endIndex + 1);
            } else {
                throw new ApplicationException("非法的报头块");
            }
            // 获取签名域
            retPos = msg.indexOf(Context.SIGNATURE_BEGIN);
            // 计算签名域结束符号的偏移量
            offset = msg.indexOf(Context.END_FLAG, endIndex + 1);
            if (retPos > 0) {
                startIndex = msg.indexOf(Context.SIGNATURE_BEGIN)
                        + Context.SIGNATURE_BEGIN.length();// 是为了不截取数字签名域的头标识
                endIndex = offset;
                digitalSign = msg.substring(startIndex, endIndex);
//				log.debug("digitalSign =" + digitalSign);
            }
            // 报体XML
            int docBegin = msg.indexOf(Context.XML_BEGIN);
            int docEnd = msg.indexOf(Context.XML_END)
                    + Context.XML_END.length();

            xmlBody = msg.substring(docBegin, docEnd);
            // 明细数据域--该域有可能为空
            retPos = msg.indexOf(Context.PKG_BEGIN);
            // 计算签名域结束符号的偏移量
            offset = msg.indexOf(Context.END_FLAG, docEnd + 1);
            if (retPos > 0) {
                endIndex = offset;
                startIndex = msg.indexOf(Context.PKG_BEGIN)
                        + Context.PKG_BEGIN.length();
                details = msg.substring(startIndex, endIndex - 1);
//				log.debug("details =|" + details + "|");
                BufferedReader in = new BufferedReader(new StringReader(details));
                String line; // 用来保存每行读取的内容
                while ((line = in.readLine()) != null) {
                    if (line.indexOf(Context.ITEM_BEGIN) >= 0) {
                        String str = line.substring(Context.ITEM_BEGIN.length());
                        list.add(str);
                    }
                }
            }
            msgStr.setHeaderMsg(header);
            msgStr.setXmlBody(xmlBody);
            msgStr.setDigitalSign(StringUtils.isEmpty(digitalSign)?null:digitalSign.trim());
            msgStr.setDetail(list);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ApplicationException(e);

        }
        return msgStr;
    }
}
