package com.java.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {


	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("ansar") && password.equals("ansar123");
	}

}
