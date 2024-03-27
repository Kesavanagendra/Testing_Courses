package steps;


import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;


public class TestHooksBeforeAfter {

	@Before
	public void beforeScenario() {
		
		System.out.println("This will run before the Scenario");
	}
	
	@After
	public void afterScenario(){
        System.out.println("This will run after the Scenario");
        System.out.println("==================================================================================================");
    }
	
/*	@BeforeStep
	public void startstop() {
		System.out.println("The step has started execution");
	}
	
	@AfterStep
	public void startstep() {
		System.out.println("The step has completed execution");
//		System.out.println("==================================================================================================");
	}*/
	
	
	
/*	@BeforeAll
	public static void begin() {
		
		System.out.println("BeforeAll method run once at begining of feature file");
	}
	
	@AfterAll
	public static void end() {
		
		System.out.println("AfterAll method run once at end of feature file");
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//====================TaggedHooks========================================================
	
/*	@Before(value ="@Testing1")
	public void dbsetup() {
		System.out.println("oracle Database connection open");
	}
	
	@After(value  = "@Testing1")
	public void dbendup() {
		
		System.out.println("oracle Database connection close");
	}
	
	
	@Before(value ="@Testing2")
	public void sqlsetup() {
		System.out.println("sql connection open");
	}
	
	@After(value  = "@Testing2")
	public void sqlendup() {
		
		System.out.println("sql Database connection close");
	}*/
	
}
