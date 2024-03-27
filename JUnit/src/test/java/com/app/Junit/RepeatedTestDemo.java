package com.app.Junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class RepeatedTestDemo {

	@DisplayName("Repeated Test")    // This annotation will display the own method name created by user.
	@RepeatedTest(3)                 // This annotation will repeat the test for 3 times.
	public void repeatMessage() {
		
		System.out.println("We are Learning JUnit");
	}
	
}
