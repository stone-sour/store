package com.kdstore.transaction;

import java.util.ArrayList;

import com.kdstore.product.Product;

public class Void extends Transaction {
	
	private ArrayList<Product> voidItems;

	public ArrayList<Product> getVoidItems() {
		return voidItems;
	}

	public void setVoidItems(ArrayList<Product> voidItems) {
		this.voidItems = voidItems;
	}

}
