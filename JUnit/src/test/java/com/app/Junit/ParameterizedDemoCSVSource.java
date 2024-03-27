package com.app.Junit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ParameterizedDemoCSVSource {

	// CSV => storing data in form of row and columns-> like an excel
	
	@ParameterizedTest(name = "CSV source {arguments}")
	@CsvSource({
		"Audi , 25",      // row and column
		"BMW  , 24",
		"Volvo, 45",
		"Benz , 50"
	})
	
	
	public void dataFromCSVSource(String car, String quantity) {
		System.out.println(car +"  "+quantity);
	}
}
