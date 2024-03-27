package com.app.Junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

// @TestInstance is an annotation that will configure Lifecycle of tests.
// It has 2 methods. Lifecycle.PER_CLASS and Lifecycle.PER_METHOD.

@TestInstance(TestInstance.Lifecycle.PER_CLASS)   
public class TestInstanceAnnotation {

	@BeforeAll 
	public void init() {
		
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
	public void tearDown() {
		
		System.out.println("close DB connection");
	}
}
