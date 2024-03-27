package com.sportyshoeTestPages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

import com.sportyshoeSeleniumCucumberScripts.HomePage;
import com.sportyshoeSeleniumCucumberScripts.RegisterPage;
import com.sportyshoeSeleniumCucumberScripts.TestBase;

public class RegisterPageTest extends TestBase {

	HomePage hp;
	RegisterPage rp;
	
	@BeforeTest
	public void start_browser()
	{
		openBrowser();
		hp = new HomePage(driver);
		rp = new RegisterPage(driver);
	}

	
	@Test(priority='1')
	public void test_click_register_link() throws InterruptedException
	{
		Thread.sleep(1500);
		hp.click_register_link();
	}
	
	@Test(priority='2')
	public void test_getTitle_page()
	{
		String expected = "http://localhost:9010/register";
		String Actual = hp.getURL_page();
		Assert.assertEquals(Actual, expected);
		
	}
	
	@Test(priority='3')
	public void Test_register_user()
	{
		rp.register_user();
	}
	
	@Test(priority='4')
	public void Test_validate_registration_URL()
	{
		String expected = "http://localhost:9010/register-user";
		String Actual = rp.validate_registration_URL();
		Assert.assertEquals(Actual, expected);
	}
	
	@Test(priority='5')
	
	public void Test_validate_registration_Text()
	{
		String expected = "Hello Kesava !";
		String actualText = rp.validate_registration_Text();
		Assert.assertEquals(actualText, expected);
	}
	
	
}
