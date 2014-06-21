package com.kdstore.empservices;

import java.util.Date;

public class Schedule {

	private int scheduleId;
	private int empId;
	private Date schStartDate;
	private Date schEndDate;
	private double schHours;
	private String schSun;
	private String schMon;
	private String schTue;
	private String schWed;
	private String schThur;
	private String schFri;
	private String schSat;
	
	public int getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Date getSchStartDate() {
		return schStartDate;
	}
	public void setSchStartDate(Date schStartDate) {
		this.schStartDate = schStartDate;
	}
	public Date getSchEndDate() {
		return schEndDate;
	}
	public void setSchEndDate(Date schEndDate) {
		this.schEndDate = schEndDate;
	}
	public double getSchHours() {
		return schHours;
	}
	public void setSchHours(double schHours) {
		this.schHours = schHours;
	}
	public String getSchSun() {
		return schSun;
	}
	public void setSchSun(String schSun) {
		this.schSun = schSun;
	}
	public String getSchMon() {
		return schMon;
	}
	public void setSchMon(String schMon) {
		this.schMon = schMon;
	}
	public String getSchTue() {
		return schTue;
	}
	public void setSchTue(String schTue) {
		this.schTue = schTue;
	}
	public String getSchWed() {
		return schWed;
	}
	public void setSchWed(String schWed) {
		this.schWed = schWed;
	}
	public String getSchThur() {
		return schThur;
	}
	public void setSchThur(String schThur) {
		this.schThur = schThur;
	}
	public String getSchFri() {
		return schFri;
	}
	public void setSchFri(String schFri) {
		this.schFri = schFri;
	}
	public String getSchSat() {
		return schSat;
	}
	public void setSchSat(String schSat) {
		this.schSat = schSat;
	}
	
}
