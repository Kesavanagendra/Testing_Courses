package com.app.TestNG.DataDrivenTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WikiCreateAccount {

	WebDriver driver;
	
	@BeforeClass
	public void startbrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up");
	}

	
	@Test(dataProvider = "testdata" )
	public void CreateAccount(String username, String password, String retype, String email) throws InterruptedException
	{

		driver.findElement(By.id("wpName2")).clear();
		driver.findElement(By.id("wpName2")).sendKeys(username);
		driver.findElement(By.id("wpPassword2")).clear();
		driver.findElement(By.id("wpPassword2")).sendKeys(password);
		driver.findElement(By.id("wpRetype")).clear();
		driver.findElement(By.id("wpRetype")).sendKeys(retype);
		driver.findElement(By.id("wpEmail")).clear();
		driver.findElement(By.id("wpEmail")).sendKeys(email);
		
		Thread.sleep(2000);
	}
	
	
	// in testNG we can create a DATA provider method that will fetch data from excel sheet
	// and suppy the data to your @Test method
	// this method datatype is goign to be an object
	// the row and column cell value
	
	@DataProvider(name="testdata")
	public Object[][] datasupplier() throws EncryptedDocumentException, IOException
	{
		
		Object input[][] = XLS_DataProvider.getTestData("Sheet1");
		return input;
		
	}
}
