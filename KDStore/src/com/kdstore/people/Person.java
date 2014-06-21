package com.kdstore.people;

import java.util.Date;

public abstract class Person {
	
	private int personId;
	private String personFName;
	private String personLName;
	private String personMName;
	private String personAddress;
	private String personCity;
	private String personState;
	private int personZip;
	private String personPhone;
	private String personEmail;
	private Date personDOB;
	private String personSS;
	
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonFName() {
		return personFName;
	}
	public void setPersonFName(String personFName) {
		this.personFName = personFName;
	}
	public String getPersonLName() {
		return personLName;
	}
	public void setPersonLName(String personLName) {
		this.personLName = personLName;
	}
	public String getPersonMName() {
		return personMName;
	}
	public void setPersonMName(String personMName) {
		this.personMName = personMName;
	}
	public String getPersonAddress() {
		return personAddress;
	}
	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}
	public String getPersonCity() {
		return personCity;
	}
	public void setPersonCity(String personCity) {
		this.personCity = personCity;
	}
	public String getPersonState() {
		return personState;
	}
	public void setPersonState(String personState) {
		this.personState = personState;
	}
	public int getPersonZip() {
		return personZip;
	}
	public void setPersonZip(int personZip) {
		this.personZip = personZip;
	}
	public String getPersonPhone() {
		return personPhone;
	}
	public void setPersonPhone(String personPhone) {
		this.personPhone = personPhone;
	}
	public String getPersonEmail() {
		return personEmail;
	}
	public void setPersonEmail(String personEmail) {
		this.personEmail = personEmail;
	}
	public String getPersonSS() {
		return personSS;
	}
	public void setPersonSS(String personSS) {
		this.personSS = personSS;
	}
	public Date getPersonDOB() {
		return personDOB;
	}
	public void setPersonDOB(Date personDOB) {
		this.personDOB = personDOB;
	}
	
	

}
