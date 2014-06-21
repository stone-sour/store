package com.kdstore.order;

import java.math.BigDecimal;

public class OrderLine {
	private int orderLineId;
	private int orderId;
	private int orderProductUPC;
	private int orderLineQTY;
	private BigDecimal productSalePrice;
	public int getOrderLineId() {
		return orderLineId;
	}
	public void setOrderLineId(int orderLineId) {
		this.orderLineId = orderLineId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getOrderProductUPC() {
		return orderProductUPC;
	}
	public void setOrderProductUPC(int orderProductUPC) {
		this.orderProductUPC = orderProductUPC;
	}
	public int getOrderLineQTY() {
		return orderLineQTY;
	}
	public void setOrderLineQTY(int orderLineQTY) {
		this.orderLineQTY = orderLineQTY;
	}
	public BigDecimal getProductSalePrice() {
		return productSalePrice;
	}
	public void setProductSalePrice(BigDecimal productSalePrice) {
		this.productSalePrice = productSalePrice;
	}
	
	
	
}
