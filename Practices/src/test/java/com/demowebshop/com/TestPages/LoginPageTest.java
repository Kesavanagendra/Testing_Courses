package com.demowebshop.com.TestPages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demowebshop.com.Pages.LoginPage;
import com.demowebshop.qa.HomePage.HomePage;
import com.demowebshop.qa.Utilities.MyListeners;
import com.demowebshop.qa.Utilities.WriteDataExcel;
import com.demowebshop.qa.Utilities.XLS_DataProvider;

@Listeners(MyListeners.class)
public class LoginPageTest extends HomePage {

	LoginPage lp;
	
	@BeforeMethod
	public void openApp() {
		
		openBrowser();
		lp = new LoginPage(driver);
	}
	
	@AfterMethod
	public void closeApp() {
		
		driver.quit();
	}
	
	@Test(dataProvider = "testdata")
	public void loginPageAction(String user1,String user2) throws IOException {
		
		lp.clickLogin();
		lp.enterData(user1,user2);
		lp.clickLoginBtn();
		
		try {
			lp.clickLogout();
			
		}
		catch(Exception e) {
			
			Assert.fail("Signout is not present");
		}
	}
	
	@DataProvider(name = "testdata")
	public Object [][] dataSupplier() throws EncryptedDocumentException, IOException{
		
		Object input[][] = XLS_DataProvider.getTestData("sheet1");
		return input;
	}
}
