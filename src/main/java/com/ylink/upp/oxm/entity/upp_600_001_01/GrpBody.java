
package com.ylink.upp.oxm.entity.upp_600_001_01;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "grpBody", namespace = "600.001.01", propOrder = {
    "corporationCode",
    "invoiceClass",
    "invoiceKind",
    "buyerTaxpayerNumber",
    "buyerCode",
    "buyerBankName",
    "buyerName",
    "buyerAddress",
    "buyerProvince",
    "buyerTelephone",
    "buyerMobiile",
    "buyerEmail",
    "buyerCompanyClass",
    "buyerBankCode",
    "buyerBankAccount",
    "salesOrderNo",
    "orderItem",
    "orderCreateTime",
    "deliveryOrderNo",
    "materialName",
    "materialCode",
    "amount",
    "quantity",
    "projectUnit",
    "discountAmount",
    "rate",
    "tax",
    "taxAmount",
    "settledAmount",
    "settledQuantity",
    "unSettledQuantity",
    "unSettledAmount",
    "voucherNumber",
    "voucherData",
    "producteGroup"
})
public class  GrpBody {
    @XmlElement(name = "CorporationCode", namespace = "600.001.01", required = true)
    protected String corporationCode;
    @XmlElement(name = "InvoiceClass", namespace = "600.001.01", required = true)
    protected String invoiceClass;
    @XmlElement(name = "InvoiceKind", namespace = "600.001.01", required = true)
    protected String invoiceKind;
    @XmlElement(name = "BuyerTaxpayerNumber", namespace = "600.001.01")
    protected String buyerTaxpayerNumber ;
    @XmlElement(name = "BuyerCode", namespace = "600.001.01", required = true)
    protected String buyerCode ;
    @XmlElement(name = "BuyerBankName", namespace = "600.001.01", required = true)
    protected String buyerBankName ;
    @XmlElement(name = "BuyerName", namespace = "600.001.01", required = true)
    protected String buyerName;
    @XmlElement(name = "BuyerAddress", namespace = "600.001.01", required = true)
    protected String  buyerAddress;
    @XmlElement(name = "BuyerProvince", namespace = "600.001.01")
    protected String buyerProvince;
    @XmlElement(name = "BuyerTelephone", namespace = "600.001.01")
    protected String buyerTelephone  ;
    @XmlElement(name = "BuyerMobiile", namespace = "600.001.01", required = true)
    protected String buyerMobiile  ;
    @XmlElement(name = "BuyerEmail", namespace = "600.001.01", required = true)
    protected String buyerEmail  ;
    @XmlElement(name = "BuyerCompanyClass", namespace = "600.001.01", required = true)
    protected String buyerCompanyClass ;
    @XmlElement(name = "BuyerBankCode", namespace = "600.001.01")
    protected String buyerBankCode ;
    @XmlElement(name = "BuyerBankAccount", namespace = "600.001.01")
    protected String buyerBankAccount  ;
    @XmlElement(name = "SalesOrderNo", namespace = "600.001.01")
    protected String salesOrderNo  ;
    @XmlElement(name = "OrderItem", namespace = "600.001.01")
    protected String orderItem;
    @XmlElement(name = "OrderCreateTime", namespace = "600.001.01", required = true)
    protected String orderCreateTime ;
    @XmlElement(name = "DeliveryOrderNo", namespace = "600.001.01")
    protected String deliveryOrderNo   ;
    @XmlElement(name = "MaterialCode", namespace = "600.001.01", required = true)
    protected String materialCode   ;
    @XmlElement(name = "MaterialName", namespace = "600.001.01", required = true)
    protected String materialName   ;
    @XmlElement(name = "Amount", namespace = "600.001.01", required = true)
    protected String amount   ;
    @XmlElement(name = "Quantity", namespace = "600.001.01", required = true)
    protected String quantity   ;
    @XmlElement(name = "ProjectUnit", namespace = "600.001.01")
    protected String projectUnit  ;
    @XmlElement(name = "DiscountAmount", namespace = "600.001.01", required = true)
    protected String discountAmount;
    @XmlElement(name = "Rate", namespace = "600.001.01", required = true)
    protected String rate;
    @XmlElement(name = "Tax", namespace = "600.001.01", required = true)
    protected String tax;
    @XmlElement(name = "TaxAmount", namespace = "600.001.01", required = true)
    protected String taxAmount;
    @XmlElement(name = "SettledAmount", namespace = "600.001.01")
    protected String settledAmount;
    @XmlElement(name = "SettledQuantity", namespace = "600.001.01")
    protected String settledQuantity;
    @XmlElement(name = "UnSettledQuantity", namespace = "600.001.01")
    protected String unSettledQuantity    ;
    @XmlElement(name = "UnSettledAmount", namespace = "600.001.01")
    protected String unSettledAmount    ;
    @XmlElement(name = "VoucherNumber", namespace = "600.001.01")
    protected String voucherNumber    ;
    @XmlElement(name = "VoucherData", namespace = "600.001.01")
    protected String voucherData   ;
    @XmlElement(name = "ProducteGroup", namespace = "600.001.01", required = true)
    protected String producteGroup   ;
	public String getCorporationCode() {
		return corporationCode;
	}
	public void setCorporationCode(String corporationCode) {
		this.corporationCode = corporationCode;
	}
	public String getInvoiceClass() {
		return invoiceClass;
	}
	public void setInvoiceClass(String invoiceClass) {
		this.invoiceClass = invoiceClass;
	}
	public String getInvoiceKind() {
		return invoiceKind;
	}
	public void setInvoiceKind(String invoiceKind) {
		this.invoiceKind = invoiceKind;
	}
	public String getBuyerTaxpayerNumber() {
		return buyerTaxpayerNumber;
	}
	public void setBuyerTaxpayerNumber(String buyerTaxpayerNumber) {
		this.buyerTaxpayerNumber = buyerTaxpayerNumber;
	}
	public String getBuyerCode() {
		return buyerCode;
	}
	public void setBuyerCode(String buyerCode) {
		this.buyerCode = buyerCode;
	}
	public String getBuyerBankName() {
		return buyerBankName;
	}
	public void setBuyerBankName(String buyerBankName) {
		this.buyerBankName = buyerBankName;
	}
	public String getBuyerName() {
		return buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	public String getBuyerAddress() {
		return buyerAddress;
	}
	public void setBuyerAddress(String buyerAddress) {
		this.buyerAddress = buyerAddress;
	}
	public String getBuyerProvince() {
		return buyerProvince;
	}
	public void setBuyerProvince(String buyerProvince) {
		this.buyerProvince = buyerProvince;
	}
	public String getBuyerTelephone() {
		return buyerTelephone;
	}
	public void setBuyerTelephone(String buyerTelephone) {
		this.buyerTelephone = buyerTelephone;
	}
	public String getBuyerMobiile() {
		return buyerMobiile;
	}
	public void setBuyerMobiile(String buyerMobiile) {
		this.buyerMobiile = buyerMobiile;
	}
	public String getBuyerEmail() {
		return buyerEmail;
	}
	public void setBuyerEmail(String buyerEmail) {
		this.buyerEmail = buyerEmail;
	}
	public String getBuyerCompanyClass() {
		return buyerCompanyClass;
	}
	public void setBuyerCompanyClass(String buyerCompanyClass) {
		this.buyerCompanyClass = buyerCompanyClass;
	}
	public String getBuyerBankCode() {
		return buyerBankCode;
	}
	public void setBuyerBankCode(String buyerBankCode) {
		this.buyerBankCode = buyerBankCode;
	}
	public String getBuyerBankAccount() {
		return buyerBankAccount;
	}
	public void setBuyerBankAccount(String buyerBankAccount) {
		this.buyerBankAccount = buyerBankAccount;
	}
	public String getSalesOrderNo() {
		return salesOrderNo;
	}
	public void setSalesOrderNo(String salesOrderNo) {
		this.salesOrderNo = salesOrderNo;
	}
	public String getOrderItem() {
		return orderItem;
	}
	public void setOrderItem(String orderItem) {
		this.orderItem = orderItem;
	}
	public String getOrderCreateTime() {
		return orderCreateTime;
	}
	public void setOrderCreateTime(String orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}
	public String getDeliveryOrderNo() {
		return deliveryOrderNo;
	}
	public void setDeliveryOrderNo(String deliveryOrderNo) {
		this.deliveryOrderNo = deliveryOrderNo;
	}
	public String getMaterialCode() {
		return materialCode;
	}
	public void setMaterialCode(String materialCode) {
		this.materialCode = materialCode;
	}
	public String getMaterialName() {
		return materialName;
	}
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getProjectUnit() {
		return projectUnit;
	}
	public void setProjectUnit(String projectUnit) {
		this.projectUnit = projectUnit;
	}
	public String getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getTax() {
		return tax;
	}
	public void setTax(String tax) {
		this.tax = tax;
	}
	public String getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}
	public String getSettledAmount() {
		return settledAmount;
	}
	public void setSettledAmount(String settledAmount) {
		this.settledAmount = settledAmount;
	}
	public String getSettledQuantity() {
		return settledQuantity;
	}
	public void setSettledQuantity(String settledQuantity) {
		this.settledQuantity = settledQuantity;
	}
	public String getUnSettledQuantity() {
		return unSettledQuantity;
	}
	public void setUnSettledQuantity(String unSettledQuantity) {
		this.unSettledQuantity = unSettledQuantity;
	}
	public String getUnSettledAmount() {
		return unSettledAmount;
	}
	public void setUnSettledAmount(String unSettledAmount) {
		this.unSettledAmount = unSettledAmount;
	}
	public String getVoucherNumber() {
		return voucherNumber;
	}
	public void setVoucherNumber(String voucherNumber) {
		this.voucherNumber = voucherNumber;
	}
	public String getVoucherData() {
		return voucherData;
	}
	public void setVoucherData(String voucherData) {
		this.voucherData = voucherData;
	}
	public String getProducteGroup() {
		return producteGroup;
	}
	public void setProducteGroup(String producteGroup) {
		this.producteGroup = producteGroup;
	}

    

}
