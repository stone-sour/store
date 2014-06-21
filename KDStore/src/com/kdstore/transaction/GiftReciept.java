package com.kdstore.transaction;

import com.kdstore.product.Product;

public class GiftReciept extends Transaction{

	private Product giftItem;

	public Product getGiftItem() {
		return giftItem;
	}

	public void setGiftItem(Product giftItem) {
		this.giftItem = giftItem;
	}
}
