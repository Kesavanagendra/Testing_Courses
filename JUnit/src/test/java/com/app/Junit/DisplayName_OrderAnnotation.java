// for @Order annotation /sequnece to be implemented by Junit , we have to also use @TestMethodOrder

/* MethodOrderer that sorts methods based on the @Orderannotation. 
 * 
 * 
Any methods that are assigned the same order value will be sorted arbitrarily adjacent to each other. 

Any methods not annotated with @Order will be assigned the default order value which will 
effectively cause them to appear at the end of the sorted list, 
unless certain methods are assignedan explicit order value greater than the default order value.
 Any methodsassigned an explicit order value greater than the default order value willappear 
 after non-annotated methods in the sorted list */


package com.app.Junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


// @TestMethodOrder(MethodOrderer.Random.class)       // run test randomly and not in any order 

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)   // to run the tests in order. this also has to add.
public class DisplayName_OrderAnnotation {

	@Order(4)                          // This annotation is simmilar to TestNG priority. based on order it will run.
	@DisplayName("4. Signin button")    // This annotation will used to display the own method name of method.
	@Test
	public void method1() {
		
		System.out.println("Testing sign in button");
	}
	
	
	@Order(1)
	@DisplayName("1. Username field")
	@Test
	public void method2() {
		
		System.out.println("Testing username ");
	}
	
	
	@Order(2)
	@DisplayName("2. Password field")
	@Test
	public void method3() {
		
		System.out.println("Testing password field");
	}

	
	@Order(3)
	@DisplayName("3. forget button")
	@Test
	public void method4() {
	
		System.out.println("Testing forget password button");
	}
}
