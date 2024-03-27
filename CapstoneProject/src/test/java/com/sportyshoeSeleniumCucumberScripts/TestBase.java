package com.sportyshoeSeleniumCucumberScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;
	
	public void openBrowser() {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://localhost:9010/");
	}
	
	public static void closeBrowser() {
		
		driver.close();
	}
}
