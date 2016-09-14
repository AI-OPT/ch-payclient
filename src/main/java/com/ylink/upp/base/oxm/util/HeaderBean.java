/**
 * 版权所有(C) 2015 深圳雁联计算系统有限公司
 * 创建：YangHan  16/5/6.
 */
package com.ylink.upp.base.oxm.util;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * author YangHan
 * data 16/5/6
 */
public class HeaderBean {
    public HeaderBean(){
        init();
    }

    /**
     * @param mesgType 报文类型(报文类型代码（报文编号+版本号）)
     */
    public HeaderBean(String mesgType,String version,String origSender){
        init();
        this.mesgType = mesgType + version;
        this.origSender = origSender;
    }
    /**
     * @param mesgType 报文类型(报文类型代码（报文编号+版本号）)
     */
    public HeaderBean(String mesgType,String origSender){
        init();
        this.mesgType = mesgType;
        this.origSender = origSender;
    }
    private void init(){
        this.origReceiver = "1000000000000000";
        this.origSendDate = new SimpleDateFormat("yyyyMMdd").format(new Date());
        this.origSendTime = new SimpleDateFormat("HHmmss").format(new Date());
    }
    @ProcessorField(serial=1,type= FieldProcessorType.REGTH, length = 3)
    private String beginFlag = "{H:";		// 起始标识符(标识报头块开始，固定使用：{H:)
    @ProcessorField(serial=2,type=FieldProcessorType.REGTH, length = 2)
    private String verNum = Context.INF_VERSION;	// 版本号(固定填写01)
    @ProcessorField(serial=3,type=FieldProcessorType.REGTH, length = 16)
    private String origSender;				// 报文发起人(标识报文原始业务发起方)
    @ProcessorField(serial=4,type=FieldProcessorType.REGTH, length = 16)
    private String origReceiver;			// 报文接收人(标识报文最终业务接收方)
    @ProcessorField(serial=5,type=FieldProcessorType.REGTH, length = 8)
    private String origSendDate;			// 报文发起日期(标识OrigSender发出本报文的机器日期)
    @ProcessorField(serial=6,type=FieldProcessorType.REGTH, length = 6)
    private String origSendTime;			// 报文发起时间(标识OrigSender发出本报文的机器时间)
    @ProcessorField(serial=7,type=FieldProcessorType.REGTH, length = 10)
    private String mesgType;				// 报文类型(报文类型代码（报文编号+版本号）)
    @ProcessorField(serial=8,type=FieldProcessorType.REGTH, length = 1)
    private String endFlag = "}";			// 结束标识()

    public String getBeginFlag() {
        return beginFlag;
    }
    public void setBeginFlag(String beginFlag) {
        this.beginFlag = beginFlag;
    }
    public String getVerNum() {
        return verNum;
    }
    public void setVerNum(String verNum) {
        this.verNum = verNum;
    }
    public String getOrigSender() {
        return origSender;
    }
    public void setOrigSender(String origSender) {
        this.origSender = origSender;
    }
    public String getOrigReceiver() {
        return origReceiver;
    }
    public void setOrigReceiver(String origReceiver) {
        this.origReceiver = origReceiver;
    }
    public String getOrigSendDate() {
        return origSendDate;
    }
    public void setOrigSendDate(String origSendDate) {
        this.origSendDate = origSendDate;
    }
    public String getOrigSendTime() {
        return origSendTime;
    }
    public void setOrigSendTime(String origSendTime) {
        this.origSendTime = origSendTime;
    }
    public String getMesgType() {
        return mesgType;
    }
    public void setMesgType(String mesgType) {
        this.mesgType = mesgType;
    }
    public String getEndFlag() {
        return endFlag;
    }
    public void setEndFlag(String endFlag) {
        this.endFlag = endFlag;
    }
}
