package com.kdstore.transaction;

import java.util.ArrayList;

import com.kdstore.product.Product;

public class Exchange extends Transaction {
	
	private ArrayList<Product> exchangeBackItems;
	private ArrayList<Product> exchangedForItems;
	
	public ArrayList<Product> getExchangeBackItems() {
		return exchangeBackItems;
	}
	public void setExchangeBackItems(ArrayList<Product> exchangeBackItems) {
		this.exchangeBackItems = exchangeBackItems;
	}
	public ArrayList<Product> getExchangedForItems() {
		return exchangedForItems;
	}
	public void setExchangedForItems(ArrayList<Product> exchangedForItems) {
		this.exchangedForItems = exchangedForItems;
	}

}
