package com.virtusa.trainingmanagement.models;

public class Login 
{
	private String emailId;
	private String password;
	private String role;
	
	
	public Login(String emailId,String password,String role)
	{
		this.emailId = emailId;
		this.password = password;
		this.role=role;
	}
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
