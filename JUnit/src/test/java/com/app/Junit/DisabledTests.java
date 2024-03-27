package com.app.Junit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisabledTests {

	@Test
	public void method1() {

		System.out.println("Execute the method 1 of code class");	
	}
	
	@Test
	@Disabled        // This @Disabled annotation will ignore the test case
	public void method2() {
			
		System.out.println("Execute the method 2 of code class");	
	}
	
	@Test
	@Disabled
	public void method3() {

		System.out.println("Execute the method 3 of code class");	
	}
	
	@Test
	public void method4() {
			
		System.out.println("Execute the method 4 of code class");	
	}
	
}
