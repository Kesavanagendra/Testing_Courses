package com.app.junitProject;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ProjectDemo {

	WebDriver driver;
	
	@BeforeAll
	public void startBrowser() {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
	}
	
	

	@DisplayName("Fb page")
	@ParameterizedTest(name = "CSV source")
	@CsvSource({"admin , admin@123.com"})	
	public void Testmethod1(String username, String pwd) throws InterruptedException
	{
        driver.findElement(By.cssSelector("input#email")).sendKeys(username);
		
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys(pwd);
		
	}
	

	@DisplayName("clicking on login")
	@RepeatedTest(2)
	public void Testmethod2() {
		
		driver.findElement(By.xpath("//button[@name = 'login']")).click();	
	}
	
	
	@AfterAll
	public void closebrowser()
	{
		driver.close();
	}
}
