package com.kdstore.transaction;

import java.util.ArrayList;

import com.kdstore.product.Product;

public class Sale extends Transaction{
	
	private ArrayList<Product> soldItems;

	public ArrayList<Product> getSoldItems() {
		return soldItems;
	}

	public void setSoldItems(ArrayList<Product> soldItems) {
		this.soldItems = soldItems;
	}
	

}
