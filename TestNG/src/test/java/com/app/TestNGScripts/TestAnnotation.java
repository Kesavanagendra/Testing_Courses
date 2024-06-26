package com.app.TestNGScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestAnnotation {
	
	
	// testNG framework will execute your selenium scripts
	// So no need of main methods
	// the selenium scripts in testNG will be written in methods
	// each method will be called as testcases or test method
	// Annotations: 1. @Test
	// In a java class which ever test method has @Test annotation, that will get executed
	
	@Test
	public void getTitle() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
	}
	
	@Test
	public void login() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.id("input-email")).sendKeys("Admin@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Admin123");
		
		driver.findElement(By.xpath("//input[@value = 'Login']")).click();
		
		driver.close();
		
	}
	
	@Test
	public void logout() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.id("input-email")).sendKeys("Admin@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Admin123");
		
		driver.findElement(By.xpath("//input[@value = 'Login']")).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
		Thread.sleep(1500);
		driver.close();
		
	}
	
	
}
