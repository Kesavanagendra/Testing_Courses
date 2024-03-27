package com.ninja.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ninja.qa.Base.TestBase;

public class HomePage extends TestBase {
	
	
	Actions a = new Actions(driver);
	
	// Create PageFactory
	// this code will find the element using xpath locator and store it in webelement object myaccount
	
	@FindBy(xpath = "//span[text() = 'My Account']")
	WebElement myaccount;
	
	@FindBy(xpath = "//a[text() = 'Register']")
	WebElement register;		
		
	@FindBy(xpath="//a[text()='Login']")
	WebElement login;
	
	@FindBy(xpath = "//a[text() = 'Desktops']")
	WebElement desktop;
	
	@FindBy(linkText = "Mac (1)")
	WebElement macdropdown;
	
	
	public HomePage(WebDriver driver) {
		
		// driver can now work with our elements and methods of the class.
		PageFactory.initElements(driver , this);	
	}
	
	// We will now write action methods, that will perform action on these elements
	//but these methods will not be executed here.
	public void getTitle() {
		
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	
	// method name is similar to action to be done.
	public void clickOnMyAccount() {
		myaccount.click();
	}
	
	public void clickOnLogin() {
		login.click();
	}
	
	public void clickOnRegister() {
		register.click();
	}
	
	public void clickOnMac() throws InterruptedException {
		
		a.moveToElement(desktop).build().perform();
		Thread.sleep(1500);
		
		macdropdown.click();
	}
	
	
	
}
