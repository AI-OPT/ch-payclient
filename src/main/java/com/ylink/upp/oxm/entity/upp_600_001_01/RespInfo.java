
package com.ylink.upp.oxm.entity.upp_600_001_01;

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
 *         &lt;element name="GrpHdr" type="{600.001.01}grpHdr"/>
 *         &lt;element name="GrpBody" type="{600.001.01}grpBody"/>
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
    "invoiceBody"
})
@XmlRootElement(name = "RespInfo", namespace = "600.001.01")
public class RespInfo implements XmlBodyEntity{

    @XmlElement(name = "InvoiceBody", namespace = "600.001.01", required = true)
    protected InvoiceBody invoiceBody;

	public InvoiceBody getInvoiceBody() {
		return invoiceBody;
	}

	public void setInvoiceBody(InvoiceBody invoiceBody) {
		this.invoiceBody = invoiceBody;
	}

    
}
