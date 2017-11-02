package com.logins.Model;

public class Registration {

	private String firstname;
	private String lastname;
	private String emailaddress;
	private String password;
	public Registration(String firstname, String lastname, String emailaddress, String password) {
	
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailaddress = emailaddress;
		this.password = password;
	}
	public Registration() {
		
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Registration [firstname=" + firstname + ", lastname=" + lastname + ", emailaddress=" + emailaddress
				+ ", password=" + password + "]";
	}
	
}
