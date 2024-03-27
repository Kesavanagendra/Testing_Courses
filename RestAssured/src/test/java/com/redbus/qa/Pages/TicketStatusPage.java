package com.redbus.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.redbus.qa.Base.RedbusBase;

public class TicketStatusPage extends RedbusBase {

	@FindBy(xpath = "//div[@class = 'manageHeaderLbl']")
	WebElement managebookings;
	
	@FindBy(xpath = "//div[@id = 'hmb']/descendant::span[4]")
	WebElement mytickets;
	
	@FindBy(xpath = "//input[@id = 'searchTicketTIN']")
	WebElement ticketno;
	
	@FindBy(xpath = "//input[@id = 'searchTicketEmail']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id = 'ticketSearch']")
	WebElement searchbtn;
	
	
	public TicketStatusPage(WebDriver driver) {
		
		PageFactory.initElements(driver , this);
	}
	
	
	public void manageBookings() {
		
		managebookings.click();
		mytickets.click();
	}
	
	public void ticketStatus() {
		
		ticketno.sendKeys("5649832");
		email.sendKeys("Admin@gmail.com");
		searchbtn.click();
	}
	
	
	
	
	
}
