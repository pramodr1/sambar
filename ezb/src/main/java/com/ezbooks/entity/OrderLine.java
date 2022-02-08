package com.ezbooks.entity;

import javax.persistence.Entity;

@Entity
public class OrderLine {
	
	private Integer orderId;
	
	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	private Product[] products;

}
