package com.kdstore.transaction;

import java.util.ArrayList;

import com.kdstore.product.Product;

public class Return extends Transaction{
	
	private int saleRecieptId;
	private double cashReturn;
	private double storeCreditReturn;
	private ArrayList<Product> returnedItems;
	
	public int getSaleRecieptId() {
		return saleRecieptId;
	}
	public void setSaleRecieptId(int saleRecieptId) {
		this.saleRecieptId = saleRecieptId;
	}
	public double getCashReturn() {
		return cashReturn;
	}
	public void setCashReturn(double cashReturn) {
		this.cashReturn = cashReturn;
	}
	public double getStoreCreditReturn() {
		return storeCreditReturn;
	}
	public void setStoreCreditReturn(double storeCreditReturn) {
		this.storeCreditReturn = storeCreditReturn;
	}
	public ArrayList<Product> getReturnedItems() {
		return returnedItems;
	}
	public void setReturnedItems(ArrayList<Product> returnedItems) {
		this.returnedItems = returnedItems;
	}
	


}
