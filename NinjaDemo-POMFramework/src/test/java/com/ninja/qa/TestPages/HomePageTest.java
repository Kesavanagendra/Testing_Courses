package com.ninja.qa.TestPages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ninja.qa.Base.TestBase;
import com.ninja.qa.Pages.HomePage;

public class HomePageTest extends TestBase {
	HomePage hp;
	
	@BeforeMethod
	public void openApp() {
		
		openBrowser();
		
		hp = new HomePage(driver);
	}
	
	@AfterMethod
	public void closeApp() {
		
		driver.quit();
	}
	
	@Test(priority = '1')
	public void testTitle() {
		
		hp.getTitle();
	}
	
	@Test(priority = '2')
	public void testRegisterLink() {
		
		hp.clickOnMyAccount();
		hp.clickOnRegister();
		hp.getTitle();
	}
	
	@Test(priority='3')
	public void testLoginLink()
	{
		hp.clickOnMyAccount(); 
		hp.clickOnLogin(); 
		hp.getTitle(); 
	}
	
	@Test(priority = '4')
	public void testClickOnMac() throws InterruptedException {
		
		hp.clickOnMac();
		hp.getTitle();
	}
}

