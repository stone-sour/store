package com.kdstore.empservices;

import java.util.Date;

public class Paycheck {
	
	private int checkId;
	private int checkEmpId;
	private Date checkStartDate;
	private Date checkEndDate;
	private double checkGrossTotal;
	private double checkNetTotal;
	private double checkFedW;
	private double checkFedWTD;
	private double checkMedW;
	private double checkMedWTD;
	private double checkSSW;
	private double checkSSWTD;
	private double checkHours;
	
	public int getCheckId() {
		return checkId;
	}
	public void setCheckId(int checkId) {
		this.checkId = checkId;
	}
	public int getCheckEmpId() {
		return checkEmpId;
	}
	public void setCheckEmpId(int checkEmpId) {
		this.checkEmpId = checkEmpId;
	}
	public Date getCheckStartDate() {
		return checkStartDate;
	}
	public void setCheckStartDate(Date checkStartDate) {
		this.checkStartDate = checkStartDate;
	}
	public Date getCheckEndDate() {
		return checkEndDate;
	}
	public void setCheckEndDate(Date checkEndDate) {
		this.checkEndDate = checkEndDate;
	}
	public double getCheckGrossTotal() {
		return checkGrossTotal;
	}
	public void setCheckGrossTotal(double checkGrossTotal) {
		this.checkGrossTotal = checkGrossTotal;
	}
	public double getCheckNetTotal() {
		return checkNetTotal;
	}
	public void setCheckNetTotal(double checkNetTotal) {
		this.checkNetTotal = checkNetTotal;
	}
	public double getCheckFedW() {
		return checkFedW;
	}
	public void setCheckFedW(double checkFedW) {
		this.checkFedW = checkFedW;
	}
	public double getCheckFedWTD() {
		return checkFedWTD;
	}
	public void setCheckFedWTD(double checkFedWTD) {
		this.checkFedWTD = checkFedWTD;
	}
	public double getCheckMedW() {
		return checkMedW;
	}
	public void setCheckMedW(double checkMedW) {
		this.checkMedW = checkMedW;
	}
	public double getCheckMedWTD() {
		return checkMedWTD;
	}
	public void setCheckMedWTD(double checkMedWTD) {
		this.checkMedWTD = checkMedWTD;
	}
	public double getCheckSSW() {
		return checkSSW;
	}
	public void setCheckSSW(double checkSSW) {
		this.checkSSW = checkSSW;
	}
	public double getCheckSSWTD() {
		return checkSSWTD;
	}
	public void setCheckSSWTD(double checkSSWTD) {
		this.checkSSWTD = checkSSWTD;
	}
	public double getCheckHours() {
		return checkHours;
	}
	public void setCheckHours(double checkHours) {
		this.checkHours = checkHours;
	}
	
	
}
