package com.kdstore.product;

public abstract class Product {

	private int productUPC;
	private double productPrice;
	private double productSalePrice;
	private boolean onSale;
	private boolean clearance;
	private int depId;
	private int classId;
	
	public int getProductUPC() {
		return productUPC;
	}
	public void setProductUPC(int productUPC) {
		this.productUPC = productUPC;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public double getProductSalePrice() {
		return productSalePrice;
	}
	public void setProductSalePrice(double productSalePrice) {
		this.productSalePrice = productSalePrice;
	}
	public boolean isOnSale() {
		return onSale;
	}
	public void setOnSale(boolean onSale) {
		this.onSale = onSale;
	}
	public boolean isClearance() {
		return clearance;
	}
	public void setClearance(boolean clearance) {
		this.clearance = clearance;
	}
	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
}
