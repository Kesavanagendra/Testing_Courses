package com.demowebshop.com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demowebshop.qa.HomePage.HomePage;

public class LoginPage extends HomePage {

	@FindBy(id = "Email")
	WebElement username;
	
	@FindBy(id = "Password")
	WebElement pass;
	
	@FindBy(xpath = "//a[text()='Log in']")
	WebElement LoginLink;
	
	@FindBy(xpath = "//input[@value = 'Log in']")
	WebElement loginBtn;
	
	@FindBy(linkText = "Log out")
	WebElement logout;
	
	
	
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	public void clickLogin() {
		
		LoginLink.click();
	}
	
	public void enterData(String user1,String user2) {
		
		username.sendKeys(user1);
		pass.sendKeys(user2);
	}
	
	public void clickLoginBtn() {
		
		loginBtn.click();
	}
	
	public void clickLogout() {
		
		logout.click();
	}
}
