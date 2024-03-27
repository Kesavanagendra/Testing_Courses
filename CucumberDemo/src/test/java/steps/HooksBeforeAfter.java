package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksBeforeAfter {

	// Suppose you have a feature file which has some scenarios, and before executeing those scenarios if
			// you want to run this setup() method then give @Before annotation
	
	//-------Hooks------------------------
	
/*			@Before(order = 0)  // we can give the order for hooks.Before hooks it follows the increasing order. it means 0 -1 like wise.
			public void setup()
			{
				
				System.out.println("The feature sceanrio has started");				
			}
			
			@Before(order = 1)
			public void Dbsetup()
			{
				System.out.println("Connect to DB");
			}
			
			// Suppose you have a feature file which has some scenarios, and after executing those scenarios if
				// you want to run this teardown() method then give @After annotation
				
			@After(order = 1)     // Before hooks it follows the decreasing order. it means 1-0 like wise.
			public void DbClose()
			{
				System.out.println("Close the DB connection");
			}

			@After(order = 0)
			public void teardown()
			{
				
				System.out.println("The feature sceanrio has completed");
				System.out.println("=============================================");
				
			}*/
	
	
	
// ==============================================================================================================================================================================
	
	//--------Tagged Hooks-----------------------------------------------------------
		
/*	
	@Before 					// we can give the order for hooks.Before hooks it follows the increasing order. it means 0 -1 like wise.
		public void setup()
		{
			
			System.out.println("The feature sceanrio has started");				
		}
		
		@Before(value = "@db",order = 0)
		public void Dbsetup()
		{
			System.out.println("Connect to DB");
		}
		
		// Suppose you have a feature file which has some scenarios, and after executing those scenarios if
			// you want to run this teardown() method then give @After annotation
			
		@After(value = "@db" ,order = 0)     // Before hooks it follows the decreasing order. it means 1-0 like wise.
		public void DbClose()
		{
			System.out.println("Close the DB connection");
		}
	
		@After
		public void teardown()
		{
			
			System.out.println("The feature sceanrio has completed");
			System.out.println("=============================================");
			
		}
		
*/
}
