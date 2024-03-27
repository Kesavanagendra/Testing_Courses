package com.app.Junit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class ParameterizedDemoEnumSource {

	// If the code is returning a value which is stored in Enum class then we use Enum source
	// It is a class, that represents group of constants
	// final variable : values don't change
	// access the item in an iteratable way
	
	enum Values{
		
		selenium,Jmeter,Junit  // values of type Enum object
	}
	
	@ParameterizedTest(name = "Enum value {arguments}")
	@EnumSource(Values.class)
	public void passValuesEnumSource(Object value) {
		
		System.out.println(value.toString());
	}
}
