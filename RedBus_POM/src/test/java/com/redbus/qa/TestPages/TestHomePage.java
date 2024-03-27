package com.redbus.qa.TestPages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.redbus.qa.Base.RedbusBase;
import com.redbus.qa.Pages.HomePage;
import com.redbus.qa.Utilities.XLS_DataProvider;

public class TestHomePage extends RedbusBase {

	HomePage hp;
	
	@BeforeMethod
	public void openApp() {
		
		openBrowser();
		
		hp = new HomePage(driver);
	}
	
	@AfterMethod
	public void CloseApp()
	{
		driver.quit();
	}
	
	@Test(dataProvider = "testdata")
	public void testBookTickets(String src , String dest) throws InterruptedException {
		
		hp.getTitle();
		
		hp.bookTickets(src, dest);
		
		hp.dateSelect();
		
	}
	
	@DataProvider(name = "testdata")
	public Object [][] dataSupplier() throws EncryptedDocumentException, IOException{
		
		Object input[][] = XLS_DataProvider.getTestData("sheet1");
		return input;
	}
	
}
