package com.app.Junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTests {

	@TestFactory()
	public Collection<DynamicTest> dynamicTests(){
		
		return Arrays.asList(
				
			DynamicTest.dynamicTest("Simple Test1", () -> Assertions.assertTrue(true)),
			DynamicTest.dynamicTest("SimpleTest2", () -> Assertions.assertTrue(true)),
			DynamicTest.dynamicTest("EXception handling", () -> {throw new Exception("EXception dynamic tests");}),
			DynamicTest.dynamicTest("Simple Test3", () -> Assertions.assertTrue(true))
	
		);
	}
}
