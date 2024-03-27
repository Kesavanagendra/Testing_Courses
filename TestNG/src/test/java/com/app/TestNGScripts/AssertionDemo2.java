package com.app.TestNGScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo2 {

	@Test
	public void method1() {
		String expectedresult = "selenium";
		String actualresult = "seleniumTest";
		
		Assert.assertNotEquals(expectedresult, actualresult);
	}
	
	@Test
	public void method2() {
		
		String actualresult = "selenium";
		
		Assert.assertNotNull(actualresult);
	}
	
	@Test
	public void method3() {
		
		String actualresult = null;
		
		Assert.assertNull(actualresult);
	}
	
}
