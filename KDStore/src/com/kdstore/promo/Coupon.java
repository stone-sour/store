package com.kdstore.promo;

import java.util.Date;

public abstract class Coupon {
	private int couponId = 0;
	private String couponName = "";
	private Date dateUsed;
	private Date startDate;
	private Date expireDate;
	
	public Date getDateUsed() {
		return dateUsed;
	}

	public void setDateUsed(Date dateUsed) {
		this.dateUsed = dateUsed;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public void setCouponId(int couponId) {
		couponId = this.couponId;
	}

	public int getCouponId(){
		return couponId;
	}
	
	public void setCouponName(String couponName){
		couponName = this.couponName;
	}
	
	public String getCouponName(){
		return couponName;
	}

}
