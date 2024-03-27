package com.redbus.qa.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.redbus.qa.Base.RedbusBase;

public class HomePage extends RedbusBase{

	@FindBy(xpath = "//div[@class = 'main-wrapper search-box-wrapper']/descendant::input[1]")
	WebElement source;
	
	@FindBy(xpath = "//div[@class='main-wrapper search-box-wrapper']/descendant::input[2]")
	WebElement destination;
	
	@FindBy(id = "search_butn")
	WebElement searchbutton;
	
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void getTitle() {
		
		String title  = driver.getTitle();
		System.out.println("Page title is "+ title);
	}

	
	public void bookTickets(String src , String dest ) {
		source.clear();
		source.sendKeys(src);
		
		destination.clear();
		destination.sendKeys(dest);	
	}
	
	
	public void dateSelect() throws InterruptedException {
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("document.getElementById('onward_cal').value='11/12/2024'");
		
		Thread.sleep(1000);
		searchbutton.click();
	}
	
}
