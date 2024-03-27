package com.app.Junit;

import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

public class DependencyInjection {

	@org.junit.jupiter.api.RepeatedTest(5)
	public void repeatTestDemo(TestInfo testInfo , RepetitionInfo repInfo) {
		
		System.out.println(testInfo.getDisplayName()+"  "+repInfo.getCurrentRepetition());
	}
}
