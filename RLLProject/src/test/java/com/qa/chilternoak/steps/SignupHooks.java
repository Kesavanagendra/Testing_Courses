package com.qa.chilternoak.steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class SignupHooks {

	public static WebDriver driver;
	
	
	@Before
	public void setup() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.chilternoakfurniture.co.uk/");
	}
	
	@After
	public void teardown(Scenario scenario) {
		
		if(scenario.isFailed()) {
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			final byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
		}
		
		driver.close();
	}
	
}


