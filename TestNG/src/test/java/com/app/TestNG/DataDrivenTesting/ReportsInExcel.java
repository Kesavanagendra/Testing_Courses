/*
package com.app.TestNG.DataDrivenTesting;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class ReportsInExcel {

	public WebDriver driver;
	
	@BeforeMethod
	public void baseclass1()
	{
		System.setProperty("webdriver.gecko.driver",  "/home/ubuntu/Downloads/gechodriver");
	       driver = new geckodriver();  // It is a depricated Version. so we cannot use .
	       driver.get("https://mvnrepository.com/");	
	}
	
	@AfterMethod
	public void quitDriver() {
		driver.close();
	}
	
	@AfterSuite
	public void generateReport() throws Exception {
		Xl.generateReport("Report_Excel.xlsx");
	}

}

*/
