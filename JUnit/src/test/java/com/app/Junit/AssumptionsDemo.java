package com.app.Junit;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsDemo {

	@Test
	public void Assumption()
	{
		// i want to run the test case sonly and only if my DB server is Up and running
		
		boolean isDBServerUp = true;
		
		Assumptions.assumeTrue(isDBServerUp,"server is not Up");
		
		System.out.println("Create tables and insert data");
		
	}
}
