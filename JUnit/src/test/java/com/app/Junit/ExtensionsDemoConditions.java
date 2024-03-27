package com.app.Junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class ExtensionsDemoConditions {

	@EnabledOnOs(OS.MAC)     // Condition to check if my laptop OS is Mac , if conditions true then execute the test.
	@Test
	public void conditionOS() {
		
		System.out.println("Executed Test cases on Mac");
	}
	
	@EnabledOnJre(JRE.JAVA_17)  // condition to check the Java JRE version. if its conditions true then it will execute.
	@Test
	public void conditionJRE() {
		
		System.out.println("Executed Test cases for my Java Version");
	}
	
	@EnabledForJreRange(min = JRE.JAVA_11 , max = JRE.JAVA_20)     //  condition to check the Java JRE version in between min and max range. if its conditions true then it will execute.
	@Test
	public void conditionJRERange() {
		
		System.out.println("Executed Test cases on machine with Java Version 11 to 20");
	}
	
	
	
}
