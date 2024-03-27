package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class StarHealthHooks {

	public static WebDriver driver;
	
	@Before
	public void openBrowser() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@After
	public void closeBrowser() {
		driver.close();
	}
}
