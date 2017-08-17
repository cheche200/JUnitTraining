package com.test.thing.JUnitTraining.entity;

import java.util.List;

public class OrderEntity {
	
	private String orderNumber;
	private List<OrderItemEntity> orderItemList; 
	

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public List<OrderItemEntity> getOrderItemList() {
		return orderItemList;
	}

	public void setOrderItemList(List<OrderItemEntity> orderItemList) {
		this.orderItemList = orderItemList;
	}
	
	

}
