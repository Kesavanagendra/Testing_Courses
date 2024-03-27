package com.redbus.qa.TestPages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.redbus.qa.Base.RedbusBase;
import com.redbus.qa.Pages.TicketStatusPage;

public class TestTicketStatusPage extends RedbusBase{

	TicketStatusPage ts;
	
	@BeforeMethod
	public void openApp() {
		
		openBrowser();
		
		ts = new TicketStatusPage(driver);
	}
	
	@AfterMethod
	public void CloseApp()
	{
		driver.quit();
	}
	
	
	@Test
	public void testTicketStatus() {
		
		ts.manageBookings();
		
		ts.ticketStatus();
		
	}
}
