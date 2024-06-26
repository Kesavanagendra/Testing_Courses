package com.app.Junit;
/*
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicContainer;
import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.TestFactory;

public class DynamicContainerDemo {

	// create a method of type List which will return a List of String Inputs
	
	private List<String> createInputList(){
		
		return Arrays.asList("race","mom","dad","test");
	}
	
	
	// write code and annotations to create Dynamic Container which will have Dynamic Tests
	
	@TestFactory
	public Stream<DynamicNode> dynamicTestWithDynamicContainer(){
		
		return createInputList.stream().map(input ->
		
			DynamicContainer.dynamicContainer("Container for "+ input ,stream.of(	
					dynamicTest("not null", () -> Assertions.assertNotNull(input)),
					
					DynamicConatiner.dynamicContainer("properties test", Stream.of(
							dynamicTest("length > 0", () -> Assertions.assertTrue(input.length() > 0)),	
							dynamicTest("not empty", () -> Assertions.assertFalse(input.isEmpty()))
							
					))
					
			))
				
				
				
		);
	}
}
*/



/*
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.DynamicContainer;
import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.TestFactory;

public class DynamicContainerDemo {
	
	// create a method of type List which will return a List of String Inputs
	
	private List<String> createInputList()
	{
		return Arrays.asList("race","mom","dad","test");
	}
	
	// write code and annotations to create Dynamic Container which will have Dynamic Tests
	
	@TestFactory
	public  Stream<DynamicNode> dynamictestwithDynamicContainer()
	{
		return createInputList().stream()
				.map(input ->
				    DynamicContainer.dynamicContainer("Container For " + input, Stream.of(
				    		
				    		dynamicTest("not Null", () -> Assertions.assertNotNull(input)),
				    		DynamicContainer.dynamicContainer("properties test", Stream.of(		
									dynamicTest("length > 0", () -> Assertions.assertTrue(input.length() > 0)),	
									dynamicTest("not empty", () -> Assertions.assertFalse(input.isEmpty()))
									
									))
					
							)));
				    	
			
				
	}
	

}

*/

