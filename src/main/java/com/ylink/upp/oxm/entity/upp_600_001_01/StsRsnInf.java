
package com.ylink.upp.oxm.entity.upp_600_001_01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for stsRsnInf complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stsRsnInf">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrgMsgId" type="{600.001.01}XmlType"/>
 *         &lt;element name="BusiSn" type="{600.001.01}Max1000Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stsRsnInf", namespace = "600.001.01", propOrder = {
    "orgMsgId",
    "busiSn"
})
public class StsRsnInf {

    @XmlElement(name = "OrgMsgId", namespace = "600.001.01", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String orgMsgId;
    @XmlElement(name = "BusiSn", namespace = "600.001.01")
    protected String busiSn;

    /**
     * Gets the value of the orgMsgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgMsgId() {
        return orgMsgId;
    }

    /**
     * Sets the value of the orgMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgMsgId(String value) {
        this.orgMsgId = value;
    }

    /**
     * Gets the value of the busiSn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusiSn() {
        return busiSn;
    }

    /**
     * Sets the value of the busiSn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusiSn(String value) {
        this.busiSn = value;
    }

}
