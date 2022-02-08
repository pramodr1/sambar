package com.ezbooks.entity;

import javax.persistence.Entity;

@Entity
public class ProductLine {
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getProductName() {
		return productName;
	}
	public void setProductName(Integer productName) {
		this.productName = productName;
	}
	Integer productId;
	Integer productName;
	

}
