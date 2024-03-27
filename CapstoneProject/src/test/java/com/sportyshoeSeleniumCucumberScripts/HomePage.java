package com.sportyshoeSeleniumCucumberScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase{

	@FindBy(xpath = "//div[@class = 'container mt-3']/descendant::p[1]")
	WebElement text;
	
	@FindBy(linkText="New User? Register Here")
	WebElement registerLink;
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public String getURL_page() {
		
		String URLnew = driver.getCurrentUrl();
		return URLnew;
	}
	
	public String getTextOnPage() {
		
		String pagetext = text.getText();
		System.out.println(pagetext);
		return pagetext;
	}
	
	public void click_register_link()
	{
		registerLink.click();
	}
}
