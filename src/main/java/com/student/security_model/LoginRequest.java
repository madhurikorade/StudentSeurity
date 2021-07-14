package com.student.security_model;

import java.io.Serializable;

public class LoginRequest implements Serializable
{
	private static final long serialVersionUID = 75167888212227041L;
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//default constructor for JSON Parsing
	public LoginRequest()
	{
		
	}
	public LoginRequest(String username, String password)
	{
		this.username = username;
		this.password = password;
	}
	
}
