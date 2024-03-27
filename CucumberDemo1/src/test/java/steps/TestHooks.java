package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestHooks {


	@Given("This is the first step of first scenario")
	public void this_is_the_first_step_of_first_scenario() {
	   
		System.out.println("Display first step of 1st scenario");
	}
	
	@When("This is the second step of first scenario")
	public void this_is_the_second_step_of_first_scenario() {
	    
		System.out.println("Display Second step of 1st scenario");
	}
	
	@Then("This is the third step of first scenario")
	public void this_is_the_third_step_of_first_scenario() {
	    
		System.out.println("Display Third step of 1st scenario");
	}
	
	@Given("This is the first step of second scenario")
	public void this_is_the_first_step_of_second_scenario() {
	    
		System.out.println("Display first step of 2nd scenario");
	}
	
	@When("This is the second step of second scenario")
	public void this_is_the_second_step_of_second_scenario() {
	    
		System.out.println("Display second step of 2nd scenario");
	}
	
	@Then("This is the third step of second scenario")
	public void this_is_the_third_step_of_second_scenario() {
	    
		System.out.println("Display Third step of 2nd scenario");
	}
}
