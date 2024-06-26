package com.app.TestNGScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethodAnnotation {
	
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
	}

	@Test(priority = '1')
	public void getTitle() {
	
		String title = driver.getTitle();
		System.out.println(title);				
	}
	
	@Test(priority = '2')
	public void login() {
				
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.id("input-email")).sendKeys("Admin@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Admin123");
		
		driver.findElement(By.xpath("//input[@value = 'Login']")).click();	
	}
	
	@Test(priority = '3')
	public void logout() throws InterruptedException {
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.id("input-email")).sendKeys("Admin@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Admin123");
		
		driver.findElement(By.xpath("//input[@value = 'Login']")).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
		Thread.sleep(1500);		
	}
	
	@AfterMethod
	public void closeBrowser() {
		
		driver.close();
	}
}
