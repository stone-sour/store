package com.kdstore.promo;

public class PromoDollar extends Coupon{
	private double promoDollarOff = 0d;

	public double getDollarAmount() {
		return promoDollarOff;
	}

	public void setDollarAmount(double dollarAmount) {
		this.promoDollarOff = dollarAmount;
	}

	
}
