package com.ninja.qa.TestPages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ninja.qa.Base.TestBase;
import com.ninja.qa.Pages.ProductPage;
import com.ninja.qa.Pages.SearchPage;

public class TestProductPage extends TestBase {

	SearchPage sp;
	ProductPage pp;
	
	@BeforeMethod
	public void OpenApp()
	{
		openBrowser();
		sp = new SearchPage(driver);
		pp = new ProductPage(driver);
		
	}
	
	@AfterMethod
	public void CloseApp()
	{
		driver.quit();
	}
	
	@Test
	public void testproduct_addtocart() throws InterruptedException
	{
		
		sp.searchProduct();
		Thread.sleep(1000);
		sp.selectProduct();
		Thread.sleep(1000);
		pp.addToCart();
		
	}
}
