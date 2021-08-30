package com.java.servlet;

public class LoginService {
	
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("ansar") && password.equals("ansar123");
	}


}
