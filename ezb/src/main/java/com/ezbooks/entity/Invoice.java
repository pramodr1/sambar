package com.ezbooks.entity;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Invoice {
	
	public Integer getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(Integer invoiceId) {
		this.invoiceId = invoiceId;
	}
	public Date getInvDate() {
		return invDate;
	}
	public void setInvDate(Date invDate) {
		this.invDate = invDate;
	}
	public Address getInvAddress() {
		return invAddress;
	}
	public void setInvAddress(Address invAddress) {
		this.invAddress = invAddress;
	}
	private Integer invoiceId;
	private Date invDate;
	private Address invAddress;
	
	
}
