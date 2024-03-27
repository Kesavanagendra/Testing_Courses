package steps;

import io.cucumber.java.en.Given;

public class TestTags {

	
	@Given("Desired contact will be displayed")
	public void desired_contact_will_be_displayed() {
	    
		System.out.println("This method displays the desired Contact");
	}
	
	@Given("Desired deal will be displayed")
	public void desired_deal_will_be_displayed() {
	   
		System.out.println("This method displays the desired Deal");
	}
	
	@Given("Desired email will be displayed")
	public void desired_email_will_be_displayed() {
		
		System.out.println("This method displays the desired Email");
	    
	}
	
	@Given("Desired photo will be dispayed")
	public void desired_photo_will_be_displayed() {
		
		System.out.println("This method displays the desired image");
	    
	}
}
