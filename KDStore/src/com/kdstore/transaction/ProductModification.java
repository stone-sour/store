package com.kdstore.transaction;

public class ProductModification extends TransactionModification {
	
	private double modificationAmount;
	private int productUPC;
	
	public double getModificationAmount() {
		return modificationAmount;
	}
	public void setModificationAmount(double modificationAmount) {
		this.modificationAmount = modificationAmount;
	}
	public int getProductUPC() {
		return productUPC;
	}
	public void setProductUPC(int productUPC) {
		this.productUPC = productUPC;
	}
	

}
