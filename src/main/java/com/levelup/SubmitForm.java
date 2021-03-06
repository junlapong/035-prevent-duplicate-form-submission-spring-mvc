package com.levelup;

public class SubmitForm {

	private String name;
	private String emailAddress;
	private int confirmationNumber;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public int getConfirmationNumber() {
		return confirmationNumber;
	}
	public void setConfirmationNumber(int confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}
	
	@Override
	public String toString() {
		return "SubmitForm [name=" + name + ", emailAddress=" + emailAddress
				+ ", confirmationNumber=" + confirmationNumber + "]";
	}
}
