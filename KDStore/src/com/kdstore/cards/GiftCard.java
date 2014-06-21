package com.kdstore.cards;

import java.util.Date;

public class GiftCard {

	private int giftCardId;
	private Date giftCardIssueDate;
	private double giftCardBalance;
	
	public int getGiftCardId() {
		return giftCardId;
	}
	public void setGiftCardId(int giftCardId) {
		this.giftCardId = giftCardId;
	}
	public Date getGiftCardIssueDate() {
		return giftCardIssueDate;
	}
	public void setGiftCardIssueDate(Date giftCardIssueDate) {
		this.giftCardIssueDate = giftCardIssueDate;
	}
	public double getGiftCardBalance() {
		return giftCardBalance;
	}
	public void setGiftCardBalance(Double giftCardBalance) {
		this.giftCardBalance = giftCardBalance;
	}
}
