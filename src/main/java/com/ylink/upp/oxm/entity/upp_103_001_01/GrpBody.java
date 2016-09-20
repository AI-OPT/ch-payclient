//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.06 at 10:40:53 PM CST 
//

package com.ylink.upp.oxm.entity.upp_103_001_01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for grpBody complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="grpBody">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MerOrderId" type="{103.001.01}Max50Text"/>
 *         &lt;element name="CustNo" type="{103.001.01}Max50Text" minOccurs="0"/>
 *         &lt;element name="PayTranSn" type="{103.001.01}Max50Text"/>
 *         &lt;element name="OrderAmt" type="{103.001.01}ExactMax18NumberText"/>
 *         &lt;element name="OrderDate" type="{103.001.01}Exact8NumericText"/>
 *         &lt;element name="PayStatus" type="{103.001.01}Max2Text"/>
 *         &lt;element name="PaymentChannel" type="{103.001.01}Max2Text"/>
 *         &lt;element name="PaymentMethod" type="{103.001.01}Max2Text"/>
 *         &lt;element name="Remark" type="{103.001.01}Max256Text" minOccurs="0"/>
 *         &lt;element name="Resv" type="{103.001.01}Max128Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "grpBody", propOrder = { "merOrderId", "payTranSn", "orderAmt", "orderDate", "payStatus", "remark",
		"resv" })
public class GrpBody {

	@XmlElement(name = "MerOrderId", required = true)
	protected String merOrderId;
	@XmlElement(name = "PayTranSn", required = true)
	protected String payTranSn;
	@XmlElement(name = "OrderAmt", required = true)
	protected long orderAmt;
	@XmlElement(name = "OrderDate", required = true)
	protected long orderDate;
	@XmlElement(name = "PayStatus", required = true)
	protected String payStatus;
	@XmlElement(name = "Remark")
	protected String remark;
	@XmlElement(name = "Resv")
	protected String resv;

	public String getMerOrderId() {
		return merOrderId;
	}

	public void setMerOrderId(String merOrderId) {
		this.merOrderId = merOrderId;
	}

	public String getPayTranSn() {
		return payTranSn;
	}

	public void setPayTranSn(String payTranSn) {
		this.payTranSn = payTranSn;
	}

	public long getOrderAmt() {
		return orderAmt;
	}

	public void setOrderAmt(long orderAmt) {
		this.orderAmt = orderAmt;
	}

	public long getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(long orderDate) {
		this.orderDate = orderDate;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getResv() {
		return resv;
	}

	public void setResv(String resv) {
		this.resv = resv;
	}

}
