
package com.ylink.upp.oxm.entity.upp_599_001_01;

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
 *         &lt;element name="StsRsn" type="{599.001.01}stsRsn"/>
 *         &lt;element name="StsRsnInf" type="{599.001.01}stsRsnInf"/>
 *         &lt;element name="Resv" type="{599.001.01}Max120Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "grpBody", namespace = "599.001.01", propOrder = {
    "stsRsn",
    "stsRsnInf",
    "resv"
})
public class GrpBody {

    @XmlElement(name = "StsRsn", namespace = "599.001.01", required = true)
    protected StsRsn stsRsn;
    @XmlElement(name = "StsRsnInf", namespace = "599.001.01", required = true)
    protected StsRsnInf stsRsnInf;
    @XmlElement(name = "Resv", namespace = "599.001.01")
    protected String resv;

    /**
     * Gets the value of the stsRsn property.
     * 
     * @return
     *     possible object is
     *     {@link StsRsn }
     *     
     */
    public StsRsn getStsRsn() {
        return stsRsn;
    }

    /**
     * Sets the value of the stsRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link StsRsn }
     *     
     */
    public void setStsRsn(StsRsn value) {
        this.stsRsn = value;
    }

    /**
     * Gets the value of the stsRsnInf property.
     * 
     * @return
     *     possible object is
     *     {@link StsRsnInf }
     *     
     */
    public StsRsnInf getStsRsnInf() {
        return stsRsnInf;
    }

    /**
     * Sets the value of the stsRsnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link StsRsnInf }
     *     
     */
    public void setStsRsnInf(StsRsnInf value) {
        this.stsRsnInf = value;
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
