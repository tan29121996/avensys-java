package com.demo.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Component;

@Component
public class AuthenticationService {
	public boolean authenticate(String name, String password) {
		boolean isValidName = name.equalsIgnoreCase("sy");
		boolean isValidPassword = password.equalsIgnoreCase("admin");
		return isValidName && isValidPassword;
	}
}
