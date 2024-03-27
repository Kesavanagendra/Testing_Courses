/*package steps;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PageObjects;

public class LoginStep {

	PageObjects pb = new PageObjects(WebshopHooks.driver);
	
	@When("User click on Login")
	public void user_click_on_login() {
	   
		pb.clickLogin();

		
	}

	@Then("User enter username")
	public void user_enter_username() throws EncryptedDocumentException, IOException, InterruptedException {
	    
		List<Map<String,String>> testdata = XLS_DataProvider.getTestData("sheet1");
		
		for(Map<String , String>e : testdata) {
			
			String user =String.valueOf(e.get("username"));
			System.out.println(user);
			pb.enteruser(user);
			
			Thread.sleep(10000);
			
			String pass =String.valueOf(e.get("password"));
			System.out.println(pass);
			pb.enterpass(pass);
	
		}
	}

	@Then("User enter password")
	public void user_enter_password() {
	    
//		pb.enterpass(string);
	}

	@Then("User click on login button")
	public void user_click_on_login_button() {
	   
		pb.clickLoginBtn();
	}

	

	@Then("User click on Logout button")
	public void user_click_on_logout_button() {
	    
		pb.clickLogout();
	}
}*/
