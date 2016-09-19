
package com.ylink.upp.oxm.entity.upp_600_001_01;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "invoiceBody", namespace = "600.001.01", propOrder = {
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
    "buyerBankAccount",
    "salesOrderNo",
    "orderItem",
    "orderCreateTime",
    "deliveryOrderNo",
    "materialName",
    "materialCode",
    "amount",
    "discountAmount",
    "quantity",
    "projectUnit",
    "rate",
    "tax",
    "taxAmount",
    "settledQuantity",
    "unSettledQuantity",
    "unSettledAmount",
    "voucherNumber",
    "voucherData",
    "producteGroup"
})
public class  InvoiceBody {
    @XmlElement(name = "CorporationCode", namespace = "600.001.01", required = true)
    protected String corporationCode;
    @XmlElement(name = "InvoiceClass", namespace = "600.001.01", required = true)
    protected int invoiceClass;
    @XmlElement(name = "InvoiceKind", namespace = "600.001.01", required = true)
    protected String invoiceKind;
    @XmlElement(name = "BuyerTaxpayerNumber", namespace = "600.001.01", required = true)
    protected String buyerTaxpayerNumber ;
    @XmlElement(name = "BuyerCode", namespace = "600.001.01", required = true)
    protected String buyerCode ;
    @XmlElement(name = "BuyerBankName", namespace = "600.001.01", required = true)
    protected String buyerBankName ;
    @XmlElement(name = "BuyerName", namespace = "600.001.01", required = true)
    protected String buyerName;
    @XmlElement(name = "BuyerAddress", namespace = "600.001.01", required = true)
    protected String  buyerAddress;
    @XmlElement(name = "BuyerProvince", namespace = "600.001.01", required = true)
    protected String buyerProvince;
    @XmlElement(name = "BuyerTelephone", namespace = "600.001.01", required = true)
    protected String buyerTelephone  ;
    @XmlElement(name = "BuyerMobiile", namespace = "600.001.01", required = true)
    protected String buyerMobiile  ;
    @XmlElement(name = "BuyerEmail", namespace = "600.001.01", required = true)
    protected String buyerEmail  ;
    @XmlElement(name = "BuyerCompanyClass", namespace = "600.001.01", required = true)
    protected String buyerCompanyClass ;
    @XmlElement(name = "BuyerBankAccount", namespace = "600.001.01", required = true)
    protected String buyerBankAccount  ;
    @XmlElement(name = "SalesOrderNo", namespace = "600.001.01", required = true)
    protected String salesOrderNo  ;
    @XmlElement(name = "OrderItem", namespace = "600.001.01", required = true)
    protected String orderItem;
    @XmlElement(name = "OrderCreateTime", namespace = "600.001.01", required = true)
    protected String orderCreateTime ;
    @XmlElement(name = "DeliveryOrderNo", namespace = "600.001.01", required = true)
    protected String deliveryOrderNo   ;
    @XmlElement(name = "MaterialName", namespace = "600.001.01", required = true)
    protected String materialName   ;
    @XmlElement(name = "MaterialCode", namespace = "600.001.01", required = true)
    protected String materialCode   ;
    @XmlElement(name = "Amount", namespace = "600.001.01", required = true)
    protected double amount   ;
    @XmlElement(name = "DiscountAmount", namespace = "600.001.01", required = true)
    protected double discountAmount   ;
    @XmlElement(name = "Quantity", namespace = "600.001.01", required = true)
    protected int quantity   ;
    @XmlElement(name = "ProjectUnit", namespace = "600.001.01", required = true)
    protected String projectUnit  ;
    @XmlElement(name = "Rate", namespace = "600.001.01", required = true)
    protected double rate   ;
    @XmlElement(name = "Tax", namespace = "600.001.01", required = true)
    protected double tax   ;
    @XmlElement(name = "TaxAmount", namespace = "600.001.01", required = true)
    protected double taxAmount    ;
    @XmlElement(name = "SettledQuantity", namespace = "600.001.01", required = true)
    protected int settledQuantity    ;
    @XmlElement(name = "UnSettledQuantity", namespace = "600.001.01", required = true)
    protected int unSettledQuantity    ;
    @XmlElement(name = "UnSettledAmount", namespace = "600.001.01", required = true)
    protected double unSettledAmount    ;
    @XmlElement(name = "VoucherNumber", namespace = "600.001.01", required = true)
    protected String voucherNumber    ;
    @XmlElement(name = "VoucherData", namespace = "600.001.01", required = true)
    protected String voucherData   ;
    @XmlElement(name = "ProducteGroup", namespace = "600.001.01", required = true)
    protected String producteGroup   ;
	public String getCorporationCode() {
		return corporationCode;
	}
	public void setCorporationCode(String corporationCode) {
		this.corporationCode = corporationCode;
	}
	public int getInvoiceClass() {
		return invoiceClass;
	}
	public void setInvoiceClass(int invoiceClass) {
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
	public String getMaterialName() {
		return materialName;
	}
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}
	public String getMaterialCode() {
		return materialCode;
	}
	public void setMaterialCode(String materialCode) {
		this.materialCode = materialCode;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getProjectUnit() {
		return projectUnit;
	}
	public void setProjectUnit(String projectUnit) {
		this.projectUnit = projectUnit;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}
	public int getSettledQuantity() {
		return settledQuantity;
	}
	public void setSettledQuantity(int settledQuantity) {
		this.settledQuantity = settledQuantity;
	}
	public int getUnSettledQuantity() {
		return unSettledQuantity;
	}
	public void setUnSettledQuantity(int unSettledQuantity) {
		this.unSettledQuantity = unSettledQuantity;
	}
	public double getUnSettledAmount() {
		return unSettledAmount;
	}
	public void setUnSettledAmount(double unSettledAmount) {
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
