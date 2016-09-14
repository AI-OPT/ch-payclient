
package com.ylink.upp.oxm.entity.upp_100_001_01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payOrderDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="payOrderDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MerSeqId" type="{100.001.01}ExactMax50Text"/>
 *         &lt;element name="SonMerNo" type="{100.001.01}ExactMax50Text"/>
 *         &lt;element name="ProductName" type="{100.001.01}Max64Text"/>
 *         &lt;element name="ProductAmt" type="{100.001.01}ExactMax18NumberText"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payOrderDetail", namespace = "100.001.01", propOrder = {
    "merSeqId",
    "sonMerNo",
    "productName",
    "productAmt"
})
public class PayOrderDetail {

    @XmlElement(name = "MerSeqId", namespace = "100.001.01", required = true)
    protected String merSeqId;
    @XmlElement(name = "SonMerNo", namespace = "100.001.01", required = true)
    protected String sonMerNo;
    @XmlElement(name = "ProductName", namespace = "100.001.01", required = true)
    protected String productName;
    @XmlElement(name = "ProductAmt", namespace = "100.001.01", required = true)
    protected String productAmt;

    /**
     * Gets the value of the merSeqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerSeqId() {
        return merSeqId;
    }

    /**
     * Sets the value of the merSeqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerSeqId(String value) {
        this.merSeqId = value;
    }

    /**
     * Gets the value of the sonMerNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSonMerNo() {
        return sonMerNo;
    }

    /**
     * Sets the value of the sonMerNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonMerNo(String value) {
        this.sonMerNo = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the productAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductAmt() {
        return productAmt;
    }

    /**
     * Sets the value of the productAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductAmt(String value) {
        this.productAmt = value;
    }

}
