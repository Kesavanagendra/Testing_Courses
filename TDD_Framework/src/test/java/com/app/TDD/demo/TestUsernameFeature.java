package com.app.TDD.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestUsernameFeature {

	@Test
	public void usernameTest() {
		
		UsernameCode obj = new UsernameCode();
		
		String username = "adminuser";
		String username1 = "admin/user"; // username should not have /
		String username2 = "admin#user"; // a username should not have #
		String username3 = "admin123";
		
		
		Assert.assertTrue(obj.isValidUsername(username));   	
		Assert.assertFalse(obj.isValidUsername(username1) ,"This is not valid user");  
		Assert.assertFalse(obj.isValidUsername(username2) , "This is not valid user");	
		Assert.assertTrue(obj.isValidUsername(username3));
		
		
//		Assert.assertEquals(true,obj.isValidUsername(username));   	
//		Assert.assertEquals(false,obj.isValidUsername(username1));  
//		Assert.assertEquals(false,obj.isValidUsername(username2));	
//		Assert.assertEquals(true,obj.isValidUsername(username3));
		
	}
}
