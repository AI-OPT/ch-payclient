package com.ylink.upp.base.oxm.util;

/**
 * author YangHan data 16/4/18
 */
public class Context {
	public static final String INF_VERSION = "01";
	public static final String HEADER_BEGIN = "{H:"; // 报文头开始标志
	public static final String SIGNATURE_BEGIN = "{S:"; // 签名开始标志
	public static final String XML_BEGIN = "<?xml"; // 报文体开始标志
	public static final String XML_END = "</RespInfo>"; // 报文体结束标志
	public static final String PKG_BEGIN = "{PKGLST:"; // 明细体开始标志
	public static final String ITEM_BEGIN = ":LST:"; // 明细开始标志
	public static final String END_FLAG = "}"; // 公用的结束标志
	public static final String NEW_LINE = "\r\n";

}
