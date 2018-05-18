package com.rest.eskaysoftAPI.dto;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.rest.eskaysoftAPI.entity.Product;

public class PurchaseEntryDTO {

	private Long PurchaseId;
	private Long PurchaseNumber;
	private Long InvoiceNumber;
	private String Supplier;
	private String GSTIN;
	private Long WayBillNumber;
	private String Transport;
	private String CS;
	private String Date;
	private String InvoiceDate;
	private String Mode;
	private Long LRNumber;
	private String LRDate;
	private String DeliveredForm;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "productId")
	private Product product;
	private String Batch;
	private String Expiry;
	private String Quantity;
	private float OtherCharges;
	private float GrsValue;
	private float Discount;
	private float PTD;
	private float SaleRate;
	private String HSN;
	private float MRP;
	private String MfgName;
	private float GrossValue;
	private float DiscountValue;
	private float TaxValue;
	private float NetValue;
	private float GSTPercent;
	private String Taxable;
	private float CGSTAmount;
	private float SGSTAmount;
	private Long DebitAdjustmentLedger;
	private Long CreditAdjustmentLedger;
	private String Remarks;
	private float DebitAdjustmentValue;
	private float CreditAdjustmentValue;
	private float InvoiceValue;

	public PurchaseEntryDTO() {
		super();
	}

	public PurchaseEntryDTO(Long purchaseId, Long purchaseNumber, Long invoiceNumber, String supplier, String gSTIN,
			Long wayBillNumber, String transport, String cS, String date, String invoiceDate, String mode,
			Long lRNumber, String lRDate, String deliveredForm, Product product, String batch, String expiry,
			String quantity, float otherCharges, float grsValue, float discount, float pTD, float saleRate, String hSN,
			float mRP, String mfgName, float grossValue, float discountValue, float taxValue, float netValue,
			float gSTPercent, String taxable, float cGSTAmount, float sGSTAmount, Long debitAdjustmentLedger,
			Long creditAdjustmentLedger, String remarks, float debitAdjustmentValue, float creditAdjustmentValue,
			float invoiceValue) {
		super();
		PurchaseId = purchaseId;
		PurchaseNumber = purchaseNumber;
		InvoiceNumber = invoiceNumber;
		Supplier = supplier;
		GSTIN = gSTIN;
		WayBillNumber = wayBillNumber;
		Transport = transport;
		CS = cS;
		Date = date;
		InvoiceDate = invoiceDate;
		Mode = mode;
		LRNumber = lRNumber;
		LRDate = lRDate;
		DeliveredForm = deliveredForm;
		this.product = product;
		Batch = batch;
		Expiry = expiry;
		Quantity = quantity;
		OtherCharges = otherCharges;
		GrsValue = grsValue;
		Discount = discount;
		PTD = pTD;
		SaleRate = saleRate;
		HSN = hSN;
		MRP = mRP;
		MfgName = mfgName;
		GrossValue = grossValue;
		DiscountValue = discountValue;
		TaxValue = taxValue;
		NetValue = netValue;
		GSTPercent = gSTPercent;
		Taxable = taxable;
		CGSTAmount = cGSTAmount;
		SGSTAmount = sGSTAmount;
		DebitAdjustmentLedger = debitAdjustmentLedger;
		CreditAdjustmentLedger = creditAdjustmentLedger;
		Remarks = remarks;
		DebitAdjustmentValue = debitAdjustmentValue;
		CreditAdjustmentValue = creditAdjustmentValue;
		InvoiceValue = invoiceValue;
	}

	public PurchaseEntryDTO(Long purchaseNumber, Long invoiceNumber, String supplier, String gSTIN, Long wayBillNumber,
			String transport, String cS, String date, String invoiceDate, String mode, Long lRNumber, String lRDate,
			String deliveredForm, Product product, String batch, String expiry, String quantity, float otherCharges,
			float grsValue, float discount, float pTD, float saleRate, String hSN, float mRP, String mfgName,
			float grossValue, float discountValue, float taxValue, float netValue, float gSTPercent, String taxable,
			float cGSTAmount, float sGSTAmount, Long debitAdjustmentLedger, Long creditAdjustmentLedger, String remarks,
			float debitAdjustmentValue, float creditAdjustmentValue, float invoiceValue) {
		super();
		PurchaseNumber = purchaseNumber;
		InvoiceNumber = invoiceNumber;
		Supplier = supplier;
		GSTIN = gSTIN;
		WayBillNumber = wayBillNumber;
		Transport = transport;
		CS = cS;
		Date = date;
		InvoiceDate = invoiceDate;
		Mode = mode;
		LRNumber = lRNumber;
		LRDate = lRDate;
		DeliveredForm = deliveredForm;
		this.product = product;
		Batch = batch;
		Expiry = expiry;
		Quantity = quantity;
		OtherCharges = otherCharges;
		GrsValue = grsValue;
		Discount = discount;
		PTD = pTD;
		SaleRate = saleRate;
		HSN = hSN;
		MRP = mRP;
		MfgName = mfgName;
		GrossValue = grossValue;
		DiscountValue = discountValue;
		TaxValue = taxValue;
		NetValue = netValue;
		GSTPercent = gSTPercent;
		Taxable = taxable;
		CGSTAmount = cGSTAmount;
		SGSTAmount = sGSTAmount;
		DebitAdjustmentLedger = debitAdjustmentLedger;
		CreditAdjustmentLedger = creditAdjustmentLedger;
		Remarks = remarks;
		DebitAdjustmentValue = debitAdjustmentValue;
		CreditAdjustmentValue = creditAdjustmentValue;
		InvoiceValue = invoiceValue;
	}

	/**
	 * @return the purchaseId
	 */
	public Long getPurchaseId() {
		return PurchaseId;
	}

	/**
	 * @param purchaseId
	 *            the purchaseId to set
	 */
	public void setPurchaseId(Long purchaseId) {
		PurchaseId = purchaseId;
	}

	/**
	 * @return the purchaseNumber
	 */
	public Long getPurchaseNumber() {
		return PurchaseNumber;
	}

	/**
	 * @param purchaseNumber
	 *            the purchaseNumber to set
	 */
	public void setPurchaseNumber(Long purchaseNumber) {
		PurchaseNumber = purchaseNumber;
	}

	/**
	 * @return the invoiceNumber
	 */
	public Long getInvoiceNumber() {
		return InvoiceNumber;
	}

	/**
	 * @param invoiceNumber
	 *            the invoiceNumber to set
	 */
	public void setInvoiceNumber(Long invoiceNumber) {
		InvoiceNumber = invoiceNumber;
	}

	/**
	 * @return the supplier
	 */
	public String getSupplier() {
		return Supplier;
	}

	/**
	 * @param supplier
	 *            the supplier to set
	 */
	public void setSupplier(String supplier) {
		Supplier = supplier;
	}

	/**
	 * @return the gSTIN
	 */
	public String getGSTIN() {
		return GSTIN;
	}

	/**
	 * @param gSTIN
	 *            the gSTIN to set
	 */
	public void setGSTIN(String gSTIN) {
		GSTIN = gSTIN;
	}

	/**
	 * @return the wayBillNumber
	 */
	public Long getWayBillNumber() {
		return WayBillNumber;
	}

	/**
	 * @param wayBillNumber
	 *            the wayBillNumber to set
	 */
	public void setWayBillNumber(Long wayBillNumber) {
		WayBillNumber = wayBillNumber;
	}

	/**
	 * @return the transport
	 */
	public String getTransport() {
		return Transport;
	}

	/**
	 * @param transport
	 *            the transport to set
	 */
	public void setTransport(String transport) {
		Transport = transport;
	}

	/**
	 * @return the cS
	 */
	public String getCS() {
		return CS;
	}

	/**
	 * @param cS
	 *            the cS to set
	 */
	public void setCS(String cS) {
		CS = cS;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return Date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(String date) {
		Date = date;
	}

	/**
	 * @return the invoiceDate
	 */
	public String getInvoiceDate() {
		return InvoiceDate;
	}

	/**
	 * @param invoiceDate
	 *            the invoiceDate to set
	 */
	public void setInvoiceDate(String invoiceDate) {
		InvoiceDate = invoiceDate;
	}

	/**
	 * @return the mode
	 */
	public String getMode() {
		return Mode;
	}

	/**
	 * @param mode
	 *            the mode to set
	 */
	public void setMode(String mode) {
		Mode = mode;
	}

	/**
	 * @return the lRNumber
	 */
	public Long getLRNumber() {
		return LRNumber;
	}

	/**
	 * @param lRNumber
	 *            the lRNumber to set
	 */
	public void setLRNumber(Long lRNumber) {
		LRNumber = lRNumber;
	}

	/**
	 * @return the lRDate
	 */
	public String getLRDate() {
		return LRDate;
	}

	/**
	 * @param lRDate
	 *            the lRDate to set
	 */
	public void setLRDate(String lRDate) {
		LRDate = lRDate;
	}

	/**
	 * @return the deliveredForm
	 */
	public String getDeliveredForm() {
		return DeliveredForm;
	}

	/**
	 * @param deliveredForm
	 *            the deliveredForm to set
	 */
	public void setDeliveredForm(String deliveredForm) {
		DeliveredForm = deliveredForm;
	}

	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product
	 *            the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 * @return the batch
	 */
	public String getBatch() {
		return Batch;
	}

	/**
	 * @param batch
	 *            the batch to set
	 */
	public void setBatch(String batch) {
		Batch = batch;
	}

	/**
	 * @return the expiry
	 */
	public String getExpiry() {
		return Expiry;
	}

	/**
	 * @param expiry
	 *            the expiry to set
	 */
	public void setExpiry(String expiry) {
		Expiry = expiry;
	}

	/**
	 * @return the quantity
	 */
	public String getQuantity() {
		return Quantity;
	}

	/**
	 * @param quantity
	 *            the quantity to set
	 */
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}

	/**
	 * @return the otherCharges
	 */
	public float getOtherCharges() {
		return OtherCharges;
	}

	/**
	 * @param otherCharges
	 *            the otherCharges to set
	 */
	public void setOtherCharges(float otherCharges) {
		OtherCharges = otherCharges;
	}

	/**
	 * @return the grsValue
	 */
	public float getGrsValue() {
		return GrsValue;
	}

	/**
	 * @param grsValue
	 *            the grsValue to set
	 */
	public void setGrsValue(float grsValue) {
		GrsValue = grsValue;
	}

	/**
	 * @return the discount
	 */
	public float getDiscount() {
		return Discount;
	}

	/**
	 * @param discount
	 *            the discount to set
	 */
	public void setDiscount(float discount) {
		Discount = discount;
	}

	/**
	 * @return the pTD
	 */
	public float getPTD() {
		return PTD;
	}

	/**
	 * @param pTD
	 *            the pTD to set
	 */
	public void setPTD(float pTD) {
		PTD = pTD;
	}

	/**
	 * @return the saleRate
	 */
	public float getSaleRate() {
		return SaleRate;
	}

	/**
	 * @param saleRate
	 *            the saleRate to set
	 */
	public void setSaleRate(float saleRate) {
		SaleRate = saleRate;
	}

	/**
	 * @return the hSN
	 */
	public String getHSN() {
		return HSN;
	}

	/**
	 * @param hSN
	 *            the hSN to set
	 */
	public void setHSN(String hSN) {
		HSN = hSN;
	}

	/**
	 * @return the mRP
	 */
	public float getMRP() {
		return MRP;
	}

	/**
	 * @param mRP
	 *            the mRP to set
	 */
	public void setMRP(float mRP) {
		MRP = mRP;
	}

	/**
	 * @return the mfgName
	 */
	public String getMfgName() {
		return MfgName;
	}

	/**
	 * @param mfgName
	 *            the mfgName to set
	 */
	public void setMfgName(String mfgName) {
		MfgName = mfgName;
	}

	/**
	 * @return the grossValue
	 */
	public float getGrossValue() {
		return GrossValue;
	}

	/**
	 * @param grossValue
	 *            the grossValue to set
	 */
	public void setGrossValue(float grossValue) {
		GrossValue = grossValue;
	}

	/**
	 * @return the discountValue
	 */
	public float getDiscountValue() {
		return DiscountValue;
	}

	/**
	 * @param discountValue
	 *            the discountValue to set
	 */
	public void setDiscountValue(float discountValue) {
		DiscountValue = discountValue;
	}

	/**
	 * @return the taxValue
	 */
	public float getTaxValue() {
		return TaxValue;
	}

	/**
	 * @param taxValue
	 *            the taxValue to set
	 */
	public void setTaxValue(float taxValue) {
		TaxValue = taxValue;
	}

	/**
	 * @return the netValue
	 */
	public float getNetValue() {
		return NetValue;
	}

	/**
	 * @param netValue
	 *            the netValue to set
	 */
	public void setNetValue(float netValue) {
		NetValue = netValue;
	}

	/**
	 * @return the gSTPercent
	 */
	public float getGSTPercent() {
		return GSTPercent;
	}

	/**
	 * @param gSTPercent
	 *            the gSTPercent to set
	 */
	public void setGSTPercent(float gSTPercent) {
		GSTPercent = gSTPercent;
	}

	/**
	 * @return the taxable
	 */
	public String getTaxable() {
		return Taxable;
	}

	/**
	 * @param taxable
	 *            the taxable to set
	 */
	public void setTaxable(String taxable) {
		Taxable = taxable;
	}

	/**
	 * @return the cGSTAmount
	 */
	public float getCGSTAmount() {
		return CGSTAmount;
	}

	/**
	 * @param cGSTAmount
	 *            the cGSTAmount to set
	 */
	public void setCGSTAmount(float cGSTAmount) {
		CGSTAmount = cGSTAmount;
	}

	/**
	 * @return the sGSTAmount
	 */
	public float getSGSTAmount() {
		return SGSTAmount;
	}

	/**
	 * @param sGSTAmount
	 *            the sGSTAmount to set
	 */
	public void setSGSTAmount(float sGSTAmount) {
		SGSTAmount = sGSTAmount;
	}

	/**
	 * @return the debitAdjustmentLedger
	 */
	public Long getDebitAdjustmentLedger() {
		return DebitAdjustmentLedger;
	}

	/**
	 * @param debitAdjustmentLedger
	 *            the debitAdjustmentLedger to set
	 */
	public void setDebitAdjustmentLedger(Long debitAdjustmentLedger) {
		DebitAdjustmentLedger = debitAdjustmentLedger;
	}

	/**
	 * @return the creditAdjustmentLedger
	 */
	public Long getCreditAdjustmentLedger() {
		return CreditAdjustmentLedger;
	}

	/**
	 * @param creditAdjustmentLedger
	 *            the creditAdjustmentLedger to set
	 */
	public void setCreditAdjustmentLedger(Long creditAdjustmentLedger) {
		CreditAdjustmentLedger = creditAdjustmentLedger;
	}

	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return Remarks;
	}

	/**
	 * @param remarks
	 *            the remarks to set
	 */
	public void setRemarks(String remarks) {
		Remarks = remarks;
	}

	/**
	 * @return the debitAdjustmentValue
	 */
	public float getDebitAdjustmentValue() {
		return DebitAdjustmentValue;
	}

	/**
	 * @param debitAdjustmentValue
	 *            the debitAdjustmentValue to set
	 */
	public void setDebitAdjustmentValue(float debitAdjustmentValue) {
		DebitAdjustmentValue = debitAdjustmentValue;
	}

	/**
	 * @return the creditAdjustmentValue
	 */
	public float getCreditAdjustmentValue() {
		return CreditAdjustmentValue;
	}

	/**
	 * @param creditAdjustmentValue
	 *            the creditAdjustmentValue to set
	 */
	public void setCreditAdjustmentValue(float creditAdjustmentValue) {
		CreditAdjustmentValue = creditAdjustmentValue;
	}

	/**
	 * @return the invoiceValue
	 */
	public float getInvoiceValue() {
		return InvoiceValue;
	}

	/**
	 * @param invoiceValue
	 *            the invoiceValue to set
	 */
	public void setInvoiceValue(float invoiceValue) {
		InvoiceValue = invoiceValue;
	}

}
