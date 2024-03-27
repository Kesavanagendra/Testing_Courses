package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SignupHooks {

	public static WebDriver driver;
	
	@Before
	public void setup() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.chilternoakfurniture.co.uk/");
	}
	
	@After
	public void teardown() {
		
		driver.close();
	}
}
