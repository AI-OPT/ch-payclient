
package com.ylink.upp.oxm.entity.upp_100_001_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for grpBody complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="grpBody">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserName" type="{100.001.01}Max32Text" minOccurs="0"/>
 *         &lt;element name="CustType" type="{100.001.01}Max50Text"/>
 *         &lt;element name="BizType" type="{100.001.01}Max2Text" minOccurs="0"/>
 *         &lt;element name="OpenId" type="{100.001.01}ExactMax50Text" minOccurs="0"/>
 *         &lt;element name="Token" type="{100.001.01}Max256Text" minOccurs="0"/>
 *         &lt;element name="MerOrderId" type="{100.001.01}ExactMax50Text"/>
 *         &lt;element name="PayCustNo" type="{100.001.01}ExactMax50Text" minOccurs="0"/>
 *         &lt;element name="OrderAmt" type="{100.001.01}ExactMax18NumberText"/>
 *         &lt;element name="OrderNum" type="{100.001.01}Exact3NumericText"/>
 *         &lt;element name="OrderDate" type="{100.001.01}Exact8NumericText"/>
 *         &lt;element name="NotifyUrl" type="{100.001.01}Max256Text"/>
 *         &lt;element name="ReturnUrl" type="{100.001.01}Max256Text"/>
 *         &lt;element name="ProductTypeName" type="{100.001.01}ExactMax50Text"/>
 *         &lt;element name="PayOrderDetail" type="{100.001.01}payOrderDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Remark" type="{100.001.01}Max256Text" minOccurs="0"/>
 *         &lt;element name="Resv" type="{100.001.01}Max128Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "grpBody", namespace = "100.001.01", propOrder = {
    "userName",
    "custType",
    "bizType",
    "openId",
    "token",
    "merOrderId",
    "payCustNo",
    "orderAmt",
    "orderNum",
    "orderDate",
    "notifyUrl",
    "returnUrl",
    "productTypeName",
    "payOrderDetail",
    "remark",
    "resv"
})
public class GrpBody {

    @XmlElement(name = "UserName", namespace = "100.001.01")
    protected String userName;
    @XmlElement(name = "CustType", namespace = "100.001.01", required = true)
    protected String custType;
    @XmlElement(name = "BizType", namespace = "100.001.01")
    protected String bizType;
    @XmlElement(name = "OpenId", namespace = "100.001.01")
    protected String openId;
    @XmlElement(name = "Token", namespace = "100.001.01")
    protected String token;
    @XmlElement(name = "MerOrderId", namespace = "100.001.01", required = true)
    protected String merOrderId;
    @XmlElement(name = "PayCustNo", namespace = "100.001.01")
    protected String payCustNo;
    @XmlElement(name = "OrderAmt", namespace = "100.001.01", required = true)
    protected String orderAmt;
    @XmlElement(name = "OrderNum", namespace = "100.001.01", required = true)
    protected String orderNum;
    @XmlElement(name = "OrderDate", namespace = "100.001.01", required = true)
    protected String orderDate;
    @XmlElement(name = "NotifyUrl", namespace = "100.001.01", required = true)
    protected String notifyUrl;
    @XmlElement(name = "ReturnUrl", namespace = "100.001.01", required = true)
    protected String returnUrl;
    @XmlElement(name = "ProductTypeName", namespace = "100.001.01", required = true)
    protected String productTypeName;
    @XmlElement(name = "PayOrderDetail", namespace = "100.001.01")
    protected List<PayOrderDetail> payOrderDetail;
    @XmlElement(name = "Remark", namespace = "100.001.01")
    protected String remark;
    @XmlElement(name = "Resv", namespace = "100.001.01")
    protected String resv;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the custType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustType() {
        return custType;
    }

    /**
     * Sets the value of the custType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustType(String value) {
        this.custType = value;
    }

    /**
     * Gets the value of the bizType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizType() {
        return bizType;
    }

    /**
     * Sets the value of the bizType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizType(String value) {
        this.bizType = value;
    }

    /**
     * Gets the value of the openId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * Sets the value of the openId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenId(String value) {
        this.openId = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the merOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerOrderId() {
        return merOrderId;
    }

    /**
     * Sets the value of the merOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerOrderId(String value) {
        this.merOrderId = value;
    }

    /**
     * Gets the value of the payCustNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayCustNo() {
        return payCustNo;
    }

    /**
     * Sets the value of the payCustNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayCustNo(String value) {
        this.payCustNo = value;
    }

    /**
     * Gets the value of the orderAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderAmt() {
        return orderAmt;
    }

    /**
     * Sets the value of the orderAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderAmt(String value) {
        this.orderAmt = value;
    }

    /**
     * Gets the value of the orderNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNum() {
        return orderNum;
    }

    /**
     * Sets the value of the orderNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNum(String value) {
        this.orderNum = value;
    }

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderDate(String value) {
        this.orderDate = value;
    }

    /**
     * Gets the value of the notifyUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     * Sets the value of the notifyUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifyUrl(String value) {
        this.notifyUrl = value;
    }

    /**
     * Gets the value of the returnUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnUrl() {
        return returnUrl;
    }

    /**
     * Sets the value of the returnUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnUrl(String value) {
        this.returnUrl = value;
    }

    /**
     * Gets the value of the productTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTypeName() {
        return productTypeName;
    }

    /**
     * Sets the value of the productTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTypeName(String value) {
        this.productTypeName = value;
    }

    /**
     * Gets the value of the payOrderDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payOrderDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayOrderDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PayOrderDetail }
     * 
     * 
     */
    public List<PayOrderDetail> getPayOrderDetail() {
        if (payOrderDetail == null) {
            payOrderDetail = new ArrayList<PayOrderDetail>();
        }
        return this.payOrderDetail;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Gets the value of the resv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResv() {
        return resv;
    }

    /**
     * Sets the value of the resv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResv(String value) {
        this.resv = value;
    }

    
    public void setPayOrderDetail(List<PayOrderDetail> payOrderDetail) {
        this.payOrderDetail = payOrderDetail;
    }    
}
