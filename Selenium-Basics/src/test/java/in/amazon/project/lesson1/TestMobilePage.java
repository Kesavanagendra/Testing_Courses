package in.amazon.project.lesson1;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestMobilePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();		
			
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		Thread.sleep(1500);
		
		driver.findElement(By.linkText("Mobiles")).click();
		
		WebElement mobile = driver.findElement(By.xpath("//*[@id='nav-subnav']/descendant::span[2]"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(mobile).build().perform();
		
		Thread.sleep(3000);
		
		// click on the mobile brand Apple		
		driver.findElement(By.linkText("Apple")).click();
		
		// Click on apple phone link	
		driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[6]/descendant::span[9]")).click();
			
		// switch to the new tab window				
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
					
		driver.switchTo().window(tabs.get(1));
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("(//input[@id = 'add-to-cart-button'])[2]")).click();
		
		
		
		
	}

}
