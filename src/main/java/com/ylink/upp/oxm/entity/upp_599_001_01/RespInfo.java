
package com.ylink.upp.oxm.entity.upp_599_001_01;

import com.ylink.upp.base.oxm.XmlBodyEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpHdr" type="{599.001.01}grpHdr"/>
 *         &lt;element name="GrpBody" type="{599.001.01}grpBody"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "grpHdr",
    "grpBody"
})
@XmlRootElement(name = "RespInfo", namespace = "599.001.01")
public class RespInfo implements XmlBodyEntity{

    @XmlElement(name = "GrpHdr", namespace = "599.001.01", required = true)
    protected GrpHdr grpHdr;
    @XmlElement(name = "GrpBody", namespace = "599.001.01", required = true)
    protected GrpBody grpBody;

    /**
     * Gets the value of the grpHdr property.
     *
     * @return
     *     possible object is
     *     {@link GrpHdr }
     *
     */
    public GrpHdr getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     *
     * @param value
     *     allowed object is
     *     {@link GrpHdr }
     *
     */
    public void setGrpHdr(GrpHdr value) {
        this.grpHdr = value;
    }

    /**
     * Gets the value of the grpBody property.
     *
     * @return
     *     possible object is
     *     {@link GrpBody }
     *
     */
    public GrpBody getGrpBody() {
        return grpBody;
    }

    /**
     * Sets the value of the grpBody property.
     *
     * @param value
     *     allowed object is
     *     {@link GrpBody }
     *
     */
    public void setGrpBody(GrpBody value) {
        this.grpBody = value;
    }

}
