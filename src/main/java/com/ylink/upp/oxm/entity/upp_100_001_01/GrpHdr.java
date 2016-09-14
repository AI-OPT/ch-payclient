
package com.ylink.upp.oxm.entity.upp_100_001_01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for grpHdr complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="grpHdr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MerNo" type="{100.001.01}ExactMax50Text"/>
 *         &lt;element name="CreDtTm" type="{100.001.01}Exact14Text"/>
 *         &lt;element name="TranType" type="{100.001.01}XmlType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "grpHdr", namespace = "100.001.01", propOrder = {
    "merNo",
    "creDtTm",
    "tranType"
})
public class GrpHdr {

    @XmlElement(name = "MerNo", namespace = "100.001.01", required = true)
    protected String merNo;
    @XmlElement(name = "CreDtTm", namespace = "100.001.01", required = true)
    protected String creDtTm;
    @XmlElement(name = "TranType", namespace = "100.001.01", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tranType;

    /**
     * Gets the value of the merNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerNo() {
        return merNo;
    }

    /**
     * Sets the value of the merNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerNo(String value) {
        this.merNo = value;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreDtTm(String value) {
        this.creDtTm = value;
    }

    /**
     * Gets the value of the tranType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranType() {
        return tranType;
    }

    /**
     * Sets the value of the tranType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranType(String value) {
        this.tranType = value;
    }

}
