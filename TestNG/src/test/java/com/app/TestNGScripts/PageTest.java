package com.app.TestNGScripts;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PageTest {

	WebDriver driver;
	
	@BeforeClass
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.simplilearn.com/");
	}
	
	@Test(priority = '1')
	public void getTitle() {
		
		String expectedtitle = "Simplilearn | Online Courses - Bootcamp & Certification Platform";
		
		String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(expectedtitle, title);
	}
	
	@Test(priority = '2')
	public void myCourses() throws InterruptedException {
		
		WebElement element = driver.findElement(By.xpath("//div[@id = 'menu-button']/descendant::span[2]"));
		Actions a = new Actions(driver);
		a.moveToElement(element);
	}
	
	
	@Test(priority = '3')
	public void selectCourse() throws InterruptedException {
		
		Actions a = new Actions(driver);
		
		WebElement dev = driver.findElement(By.xpath("(//a[text() = 'DevOps'])[2]"));
		a.moveToElement(dev).click();	
		
	}
	
	@Test(priority = '4')
	public void SearchCourses() throws InterruptedException {
		
		Thread.sleep(1500);
		WebElement search = driver.findElement(By.id("header_srch"));
		
		boolean searchbox = search.isDisplayed();
		Assert.assertTrue(searchbox);
		
	    search.sendKeys("Devops Engineer");
	    search.submit();
	
	}
	
	
	@AfterClass
	public void closeBrowser() {
		
		driver.close();
	}
}
