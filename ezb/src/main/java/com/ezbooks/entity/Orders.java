package com.ezbooks.entity;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Orders {
	
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Address getOrderAddress() {
		return orderAddress;
	}
	public void setOrderAddress(Address orderAddress) {
		this.orderAddress = orderAddress;
	}
	private Integer orderId;
	private Date orderDate;
	private Address orderAddress;

}
