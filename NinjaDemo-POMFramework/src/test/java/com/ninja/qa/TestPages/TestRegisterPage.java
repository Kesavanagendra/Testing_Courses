package com.ninja.qa.TestPages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ninja.qa.Base.TestBase;
import com.ninja.qa.Pages.HomePage;
import com.ninja.qa.Pages.RegisterPage;
import com.ninja.qa.Utilities.XLS_DataProvider;

public class TestRegisterPage extends TestBase {

	HomePage hp;
	RegisterPage rp;
	
	@BeforeMethod
	public void openApp() {
		
		openBrowser();	
		hp = new HomePage(driver);
		rp = new RegisterPage(driver);
	}
	
	@AfterMethod
	public void CloseApp()
	{
		driver.quit();
	}
	
	
	@Test(priority='1', dataProvider="testdata")
	public void testregisterUser(String name,String lname,String email,String ph,String password,String cpasswd) throws InterruptedException
	{
		hp.clickOnMyAccount();
		hp.clickOnRegister();
		rp.registerUser(name,lname,email,ph,password,cpasswd);
	}
	
	@DataProvider(name = "testdata")
	public Object [][] dataSupplier() throws EncryptedDocumentException, IOException{
		
		Object input[][] =  XLS_DataProvider.getTestData("sheet1");
		return input;
	}
		
}



