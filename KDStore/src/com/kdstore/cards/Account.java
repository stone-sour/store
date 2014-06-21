package com.kdstore.cards;

import java.util.Date;

public class Account {
	
	private int accountId;
	private int storeId;
	private Date applyDate;
	private int statementStartDay;
	private int balanceDueDay;
	private double accountBalance;
	private double accountLimit;
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public Date getApplyDate() {
		return applyDate;
	}
	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}
	public int getStatementStartDay() {
		return statementStartDay;
	}
	public void setStatementStartDay(int statementStartDay) {
		this.statementStartDay = statementStartDay;
	}
	public int getBalanceDueDay() {
		return balanceDueDay;
	}
	public void setBalanceDueDay(int balanceDueDay) {
		this.balanceDueDay = balanceDueDay;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public double getAccountLimit() {
		return accountLimit;
	}
	public void setAccountLimit(Double accountLimit) {
		this.accountLimit = accountLimit;
	}

}
