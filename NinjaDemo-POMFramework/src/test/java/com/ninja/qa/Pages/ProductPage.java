package com.ninja.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ninja.qa.Base.TestBase;

public class ProductPage extends TestBase {

	@FindBy(xpath="//input[@id='input-quantity']")
	WebElement quantity;
	
	@FindBy(xpath="//button[@id='button-cart']")
	WebElement addtocart;
	
	
	public ProductPage(WebDriver driver) {
		
		PageFactory.initElements(driver ,  this);
	}
	
	public void addToCart() throws InterruptedException {
		
		quantity.clear();
		quantity.sendKeys("5");
		Thread.sleep(1000);
		addtocart.click();
	}
	
}
