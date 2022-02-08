package com.ezbooks.entity;

import javax.persistence.Entity;

@Entity
public class InvoiceLine {
	
	private Integer invoiceId;
	
	public Integer getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(Integer invoiceId) {
		this.invoiceId = invoiceId;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	private Product[] products;
	

}
