package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseAmazonHooks {

	public static WebDriver driver;
	
	@Before
	public void openBrowser() {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@After
	public void closeBrowser() {
		driver.close();
	}
}
