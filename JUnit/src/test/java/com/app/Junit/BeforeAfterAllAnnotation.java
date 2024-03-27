package com.app.Junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BeforeAfterAllAnnotation {

	// @BeforeAll & @AfterAll are similar related to TestNG @BeforeClass & @AfterClass.
	
	@BeforeAll 
	public static void init() {
		
		System.out.println("Start the DB connection");
	}
	
	@Test
	public void method1() {

		System.out.println("Execute the method 1 of code class");	
	}
	
	@Test
	public void method2() {
			
		System.out.println("Execute the method 2 of code class");	
	}
	
	@AfterAll
	public static void tearDown() {
		
		System.out.println("close DB connection");
	}
}
