package com.app.Junit;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ParameterizedTestMethodSource {

	@ParameterizedTest(name = "Method Value {arguments}")     // argument = each value stored in method or enum class or value source
	@MethodSource("stringParameters")
	public void getDataFromMethod(String input) {
		System.out.println("The value from method is: "+input);
	}
	
	
	public static Stream<String> stringParameters(){
		
		return Stream.of("Moday", "Tuesday", "Wednesday");
	}
}
