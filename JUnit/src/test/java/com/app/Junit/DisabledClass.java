package com.app.Junit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

//@Disabled("Function is not working , ignoring the tests")   // we can use any one among both.
@Disabled         // It will disable the class to execute. it means its skips all test cases present in class.
public class DisabledClass {

	@Test
	public void method1() {

		System.out.println("Execute the method 1 of code class");	
	}
	
	@Test
	public void method2() {
			
		System.out.println("Execute the method 2 of code class");	
	}
	
	@Test
	public void method3() {

		System.out.println("Execute the method 3 of code class");	
	}
	
	@Test
	public void method4() {
			
		System.out.println("Execute the method 4 of code class");	
	}
}
