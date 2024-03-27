package com.app.Junit;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTest2 {

	@TestFactory
	public Stream<DynamicTest> dynamicTestsForPalindrome(){
		
		return Stream.of("mom","dad","madam","pop").map(inputText ->
		
		// here DynamicTest is the class and dynamicTest is the method of DynamicTest.
		DynamicTest.dynamicTest(inputText, ()->Assertions.assertTrue(Myutils.isPalindrome(inputText)))
				
		);
	}
}
