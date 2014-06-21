package com.kdstore.transaction;

import java.util.ArrayList;
import java.util.Date;
import java.math.BigDecimal;

public class Transaction {

		private int transactionId;
		private int storeId;
		private int empId;
		private int registerNum;
		private Date transactionDate;
		private int customerId;
		private int accountId;
		private int orderId;
		private BigDecimal preTotal;
		private BigDecimal discount;
		private BigDecimal transBalance;
		private BigDecimal transTax;
		private BigDecimal cashAmount;
		private BigDecimal debitAmount;
		private BigDecimal creditAmount;
		private BigDecimal AccountAmount;
		private BigDecimal checkAmount;
		private BigDecimal giftCardAmount;
		private BigDecimal merchCardAmount;
		private BigDecimal kCashAmount;
		private BigDecimal couponAmount;
		private boolean transComplete;
		private ArrayList<TransactionModification> mods;
		
		public int getTransactionId() {
			return transactionId;
		}
		public void setTransactionId(int transactionId) {
			this.transactionId = transactionId;
		}
		public int getStoreId() {
			return storeId;
		}
		public void setStoreId(int storeId) {
			this.storeId = storeId;
		}
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public int getRegisterNum() {
			return registerNum;
		}
		public void setRegisterNum(int registerNum) {
			this.registerNum = registerNum;
		}
		public Date getTransactionDate() {
			return transactionDate;
		}
		public void setTransactionDate(Date transactionDate) {
			this.transactionDate = transactionDate;
		}
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public int getAccountId() {
			return accountId;
		}
		public void setAccountId(int accountId) {
			this.accountId = accountId;
		}
		public ArrayList<TransactionModification> getMods() {
			return mods;
		}
		public void setMods(ArrayList<TransactionModification> mods) {
			this.mods = mods;
		}
		public int getOrderId() {
			return orderId;
		}
		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}
		public BigDecimal getPreTotal() {
			return preTotal;
		}
		public void setPreTotal(BigDecimal preTotal) {
			this.preTotal = preTotal;
		}
		public BigDecimal getDiscount() {
			return discount;
		}
		public void setDiscount(BigDecimal discount) {
			this.discount = discount;
		}
		public BigDecimal getTransBalance() {
			return transBalance;
		}
		public void setTransBalance(BigDecimal transBalance) {
			this.transBalance = transBalance;
		}
		public BigDecimal getTransTax() {
			return transTax;
		}
		public void setTransTax(BigDecimal transTax) {
			this.transTax = transTax;
		}
		public BigDecimal getCashAmount() {
			return cashAmount;
		}
		public void setCashAmount(BigDecimal cashAmount) {
			this.cashAmount = cashAmount;
		}
		public BigDecimal getDebitAmount() {
			return debitAmount;
		}
		public void setDebitAmount(BigDecimal debitAmount) {
			this.debitAmount = debitAmount;
		}
		public BigDecimal getCreditAmount() {
			return creditAmount;
		}
		public void setCreditAmount(BigDecimal creditAmount) {
			this.creditAmount = creditAmount;
		}
		public BigDecimal getAccountAmount() {
			return AccountAmount;
		}
		public void setAccountAmount(BigDecimal accountAmount) {
			AccountAmount = accountAmount;
		}
		public BigDecimal getCheckAmount() {
			return checkAmount;
		}
		public void setCheckAmount(BigDecimal checkAmount) {
			this.checkAmount = checkAmount;
		}
		public BigDecimal getGiftCardAmount() {
			return giftCardAmount;
		}
		public void setGiftCardAmount(BigDecimal giftCardAmount) {
			this.giftCardAmount = giftCardAmount;
		}
		public BigDecimal getMerchCardAmount() {
			return merchCardAmount;
		}
		public void setMerchCardAmount(BigDecimal merchCardAmount) {
			this.merchCardAmount = merchCardAmount;
		}
		public BigDecimal getkCashAmount() {
			return kCashAmount;
		}
		public void setkCashAmount(BigDecimal kCashAmount) {
			this.kCashAmount = kCashAmount;
		}
		public BigDecimal getCouponAmount() {
			return couponAmount;
		}
		public void setCouponAmount(BigDecimal couponAmount) {
			this.couponAmount = couponAmount;
		}
		public boolean isTransComplete() {
			return transComplete;
		}
		public void setTransComplete(boolean transComplete) {
			this.transComplete = transComplete;
		}
		
}
