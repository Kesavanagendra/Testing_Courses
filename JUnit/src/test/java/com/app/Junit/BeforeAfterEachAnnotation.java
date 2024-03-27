package com.app.Junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeforeAfterEachAnnotation {

	// @BeforeEach & @AfterEach are similar to TestNG @BeforeMethod @AfterMethod
	
	JavaOperations obj;
	
	@BeforeEach           // execute the init() method before each test method
	public void init() {
		
		System.out.println("start DB connection");
		 obj =  new JavaOperations();
		 System.out.println("Initalization done..");
	}
	
	@AfterEach 			// execute teardown() method after each test method
	public void tearDown() {  // post condition method
		
		System.out.println("close DB connection");
	}
	
	@Test
	public void test1() {
		
		System.out.println("Execute the test case 1 using method of ....JavaOperations");	
	}
	
	@Test
	public void test2() {

		System.out.println("Execute the test case 2 using method of ....JavaOperations");	
	}
}
