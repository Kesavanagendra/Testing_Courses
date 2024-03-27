package com.qa.chilternoak.steps;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.apache.poi.EncryptedDocumentException;
import org.testng.asserts.SoftAssert;

import com.qa.chilternoak.pageObjects.SignUpPageObjects;
import com.qa.chilternoak.utilities.XLS_DataProvider;


public class SignUpSteps {
	
	SoftAssert Assert = new SoftAssert();
	
	static String email;
	SignUpPageObjects sob = new SignUpPageObjects(SignupHooks.driver);
		
	@When("User click on Admin logo")
	public void user_click_on_admin_logo() {
	    
		sob.clickAccount();
		
		String Expected_title = "Account – Chiltern Oak Furniture";
		String Actual_title = SignupHooks.driver.getTitle();
		
		Assert.assertEquals(Actual_title, Expected_title);
	}
	
	@Then("User click on Signup")
	public void user_click_on_signup() {
	    
		sob.clickSignupLink();
		
		String Expected_URL = "https://www.chilternoakfurniture.co.uk/account/register";
		String Actual_URL = sob.validate_CurrentURL();
		
		Assert.assertEquals(Actual_URL, Expected_URL);	
	}
	
	@When("User enters data from {string} and {int}")
	public void user_enters_data_from_and(String SheetName, Integer RowNumber) throws EncryptedDocumentException, IOException, InterruptedException {
	    
		List<Map<String,String>> testdata = XLS_DataProvider.getTestData(SheetName);
		
		String fname = testdata.get(RowNumber).get("Firstname");
		String lname = testdata.get(RowNumber).get("Lastname");
		email = testdata.get(RowNumber).get("Email");
		String pass = testdata.get(RowNumber).get("Password");
		
		sob.enterData(fname, lname, email, pass);
		Thread.sleep(1000);	
	}
	
	@Then("User click on create account")
	public void user_click_on_create_account() throws InterruptedException, IOException {
	   	
		Assert.assertEquals(true,sob.validate_createBtn());
		
		try{
			
			sob.clickCreateBtn();
			Thread.sleep(120000);
			
			boolean val = sob.validationDemo(email, sob.validate_Email());	
			Assert.assertEquals(true, val);
				
			sob.signOut();
//			XLS_DataProvider.writeTestData("Pass");
		}
		catch(Exception e) {
			
//			XLS_DataProvider.writeTestData("Fail");
			Assert.fail("Signout is not present");
		}
		Assert.assertAll();
		
		/*String Actual_mail = sob.validate_Email();
		String Expected_mail = email;
		Assert.assertEquals(Actual_mail, Expected_mail);*/
	}
	
	
	@Then("User try to click on create account")
	public void user_try_to_click_on_create_account() throws InterruptedException, IOException {
	   	
		Assert.assertEquals(true,sob.validate_createBtn());
		
		try{
			
			sob.clickCreateBtn();
//			Thread.sleep(120000);
			
			boolean val = sob.validationDemo(email, sob.validate_Email());	
			Assert.assertEquals(true, val);
				
			sob.signOut();
		}
		catch(Exception e) {
			
			Assert.fail("Signout is not present");
		}
		Assert.assertAll();
	}
	
}
