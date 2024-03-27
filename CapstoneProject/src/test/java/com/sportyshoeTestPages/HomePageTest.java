package com.sportyshoeTestPages;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;


import com.sportyshoeSeleniumCucumberScripts.HomePage;
import com.sportyshoeSeleniumCucumberScripts.TestBase;

public class HomePageTest extends TestBase {
	
	HomePage hp;
	
	@BeforeTest
	public void startBrowser() {
		
		openBrowser();	
		hp = new HomePage(driver);
	}
	
	@Test(priority = '1')
	public void test_GetUrl() {
		String expected = "http://localhost:9010/";
		String Actual = hp.getURL_page();
		Assert.assertEquals(Actual, expected);
		
		System.out.println();
	}
	
	@Test(priority = '2')
	public void test_getTextOnPage() {
		
		String ActualText = hp.getTextOnPage();
		String ExpectedText = "Powered By Simplilearn";
		
		Assert.assertEquals(ExpectedText, ActualText);	
	}
	
	@Test(priority='3')
	public void test_click_register_link() throws InterruptedException
	{
		Thread.sleep(1500);
		hp.click_register_link();
	}

}
