package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapModeldialogueBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(1500);
		
		// enter the mobile number on dialogue box
//		driver.findElement(By.xpath("(//input[@type = 'text'])[2]")).sendKeys("134567890");
		driver.findElement(By.xpath("//div[@class = '_3skCyB']/descendant::input")).sendKeys("134567890");
		
		// click on cross button
		driver.findElement(By.xpath("//span[@class = '_30XB9F']")).click();
		
		

	
		
		
		
		
	}

}
