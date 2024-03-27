package seleniumScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver driver = new ChromeDriver();
			
		driver.manage().window().maximize();
			
		driver.get("https://www.flipkart.com/");
		
		WebElement e1 = driver.findElement(By.xpath("//div[@class = '_3skCyB']/descendant::input"));
	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class = '_3skCyB']/descendant::input")));
		
		// enter the mobile number on dialogue box
		e1.sendKeys("231546987");
		
		// click on cross button
		driver.findElement(By.xpath("//div[@class='JFPqaw']/descendant::span[1]")).click();
	
	}

}
