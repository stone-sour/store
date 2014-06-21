package com.kdstore.promo;

import java.util.Date;

public class RewardCoupon extends Coupon {
	
	private int rewardCardId;
	private double rewardBalance;
	private Date rewardCouoponIssueDate;
	public int getRewardCardId() {
		return rewardCardId;
	}
	public void setRewardCardId(int rewardCardId) {
		this.rewardCardId = rewardCardId;
	}
	public double getRewardBalance() {
		return rewardBalance;
	}
	public void setRewardBalance(double rewardBalance) {
		this.rewardBalance = rewardBalance;
	}
	public Date getRewardCouoponIssueDate() {
		return rewardCouoponIssueDate;
	}
	public void setRewardCouoponIssueDate(Date rewardCouoponIssueDate) {
		this.rewardCouoponIssueDate = rewardCouoponIssueDate;
	}

}
