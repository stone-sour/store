package com.kdstore.communication;

import java.util.ArrayList;
import java.util.Date;

import com.kdstore.people.Employee;

public class Message {

	private int messageId;
	private int messageSendingEmpId;
	private ArrayList<Employee> messageReciepEmpId;
	private Date messageSentDate;
	private String messageSubject;
	private String messageContent;
	
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public int getMessageSendingEmpId() {
		return messageSendingEmpId;
	}
	public void setMessageSendingEmpId(int messageSendingEmpId) {
		this.messageSendingEmpId = messageSendingEmpId;
	}
	public ArrayList<Employee> getMessageReciepEmpId() {
		return messageReciepEmpId;
	}
	public void setMessageReciepEmpId(ArrayList<Employee> messageReciepEmpId) {
		this.messageReciepEmpId = messageReciepEmpId;
	}
	public Date getMessageSentDate() {
		return messageSentDate;
	}
	public void setMessageSentDate(Date messageSentDate) {
		this.messageSentDate = messageSentDate;
	}
	public String getMessageSubject() {
		return messageSubject;
	}
	public void setMessageSubject(String messageSubject) {
		this.messageSubject = messageSubject;
	}
	public String getMessageContent() {
		return messageContent;
	}
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
}
