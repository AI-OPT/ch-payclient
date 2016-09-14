
package com.ylink.upp.oxm.entity.upp_711_001_01;

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
 *         &lt;element name="SonMerNo" type="{711.001.01}Max50Text"/>
 *         &lt;element name="Resv" type="{711.001.01}Max120Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "grpBody", namespace = "711.001.01", propOrder = {
    "sonMerNo",
    "resv"
})
public class GrpBody {

    @XmlElement(name = "SonMerNo", namespace = "711.001.01", required = true)
    protected String sonMerNo;
    @XmlElement(name = "Resv", namespace = "711.001.01")
    protected String resv;

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

}
