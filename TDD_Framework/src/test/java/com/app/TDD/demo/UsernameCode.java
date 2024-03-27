package com.app.TDD.demo;

public class UsernameCode {

	public boolean isValidUsername(String username) {
		
		if(username.contains("/") || username.contains("#") ) {
			return true;
		}
		else if(username.contains("123")) {
			return true;
		}
		else
			return true;
	}

}
