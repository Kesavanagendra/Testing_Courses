package seleniumScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opera.com/download");
		
		// Implicit wait is written in the beginning of the script after we open the URL
		// here selenium is going to wait for full 3 seconds before throwing an error that element not found
		// Even if elements are visible on the webpage, selenium will wait for 3 seconds
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		driver.findElement(By.xpath("(//div[@class='cookie-consent__body'])[1]/descendant::span[1]")).click();
		
	}

}
