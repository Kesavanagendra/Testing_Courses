package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinktextPartialDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =  new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up");
		
		// Inpsect the element link and write the locator linktext
		// LinkText locator value is always the text between the start tag and end tag
		// the value of locator should be same as on the HTML document
		
		driver.findElement(By.linkText("Log in")).click();
		
		Thread.sleep(1500); // wait for 1.5 seconds
		
		// find the locator for username on login page and enter text		
		driver.findElement(By.id("wpName1")).sendKeys("admin");
				
		// find the locator for password on login page and enter text				
		driver.findElement(By.id("wpPassword1")).sendKeys("admin@123");
				
		// find the check box element and click on it
		driver.findElement(By.id("wpRemember")).click();
				
		Thread.sleep(1500);
				
		// Find locator of button and click on it	
		driver.findElement(By.id("wpLoginAttempt")).click();
				
		Thread.sleep(1500);		
				
		// Similar to link text we have one more locator called PartialLinktext locator
		// the value for this is partial text of the link
		// locator will still be able to find the element and click on it
				
		// Click on the new link on top with text as Create account link, it will redirect you to new page		
		driver.findElement(By.partialLinkText("account")).click();
		
	}

}
