package com.kdstore.transaction;

public class Read extends Transaction{
	
	private double cashSales;
	private double creditSales;
	private double debitSales;
	private double checkSales;
	private double accountSales;
	
	public double getCashSales() {
		return cashSales;
	}
	public void setCashSales(double cashSales) {
		this.cashSales = cashSales;
	}
	public double getCreditSales() {
		return creditSales;
	}
	public void setCreditSales(double creditSales) {
		this.creditSales = creditSales;
	}
	public double getDebitSales() {
		return debitSales;
	}
	public void setDebitSales(double debitSales) {
		this.debitSales = debitSales;
	}
	public double getCheckSales() {
		return checkSales;
	}
	public void setCheckSales(double checkSales) {
		this.checkSales = checkSales;
	}
	public double getAccountSales() {
		return accountSales;
	}
	public void setAccountSales(double accountSales) {
		this.accountSales = accountSales;
	}

}
