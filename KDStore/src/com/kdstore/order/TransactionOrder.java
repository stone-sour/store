package com.kdstore.order;

import java.util.Date;

public class TransactionOrder {
	private int transOrderId;
	private Date transOrderDate;
	
	public int getTransOrderId() {
		return transOrderId;
	}
	public void setTransOrderId(int transOrderId) {
		this.transOrderId = transOrderId;
	}
	public Date getTransOrderDate() {
		return transOrderDate;
	}
	public void setTransOrderDate(Date transOrderDate) {
		this.transOrderDate = transOrderDate;
	}
}
