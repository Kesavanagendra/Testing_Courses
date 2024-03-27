package steps;


import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.SignUpPageObjects;
import utilities.XLS_DataProvider;

public class SignUpSteps  {

	static String email;

	SignUpPageObjects sob = new SignUpPageObjects(SignupHooks.driver);
	
	
//	@Given("User open the Chilternoak application")
//	public void user_open_the_chilternoak_application() {
//	   
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.chilternoakfurniture.co.uk/");
//	}
	
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
	
	@When("User enters firstName lastName email password")
	public void user_enters_first_name_last_name_email_password() throws EncryptedDocumentException, IOException, InterruptedException {
	    
		List<Map<String,String>> testdata = XLS_DataProvider.getTestData("sheet1");
		
		for(Map<String , String>e : testdata) {
			
			String fname =String.valueOf(e.get("Firstname"));
			String lname =String.valueOf(e.get("Lastname"));
			email =String.valueOf(e.get("Email"));
			String pass =String.valueOf(e.get("Password"));
			
			sob.enterData(fname, lname, email, pass);
			
			Thread.sleep(1000);
			
		}
//		sob.enterData("Ram", "ram", "Admin586@gmail.com", "546987");
	}
	
	@Then("User click on create account")
	public void user_click_on_create_account() throws InterruptedException {
	   
		sob.clickCreateBtn();
		
		Thread.sleep(20000);
		Assert.assertEquals(true,sob.validate_createBtn());
		
		boolean val = sob.validationDemo(email, sob.validate_Email());
			
		Assert.assertEquals(true, val);
		
		
	}

	
	
}
