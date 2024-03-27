package com.demowebshop.qa.SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RegisterPage {
	
	WebDriver driver;

	@Test
	public void gridDemo() throws MalformedURLException {
		
		ChromeOptions cap = new ChromeOptions();
		
		URL url = new URL("http://localhost:4490/wd/hub");
		
		driver = new RemoteWebDriver(url,cap);
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/register");
		
		String title = driver.getTitle();
		System.out.println(title);
		
	}
}

