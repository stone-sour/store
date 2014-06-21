package com.kdstore.transaction;

import java.util.Date;

public abstract class TransactionModification {

	private int transModId;
	private int transactionId;
	private Date transModDate;
	private int transModReason;
	
	public int getTransModId() {
		return transModId;
	}
	public void setTransModId(int transModId) {
		this.transModId = transModId;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public Date getTransModDate() {
		return transModDate;
	}
	public void setTransModDate(Date transModDate) {
		this.transModDate = transModDate;
	}
	public int getTransModReason() {
		return transModReason;
	}
	public void setTransModReason(int transModReason) {
		this.transModReason = transModReason;
	}
	
	
}
