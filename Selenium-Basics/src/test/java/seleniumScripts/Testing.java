package seleniumScripts;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Testing {

	public static void main(String args[]) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.starhealth.in/");
		
		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//a[text() = 'Retail Customers'])[1]")).click();
		
		WebElement signin = driver.findElement(By.xpath("//span[text() = 'Sign in']"));
		Actions a = new Actions(driver);
		a.moveToElement(signin).perform();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("(//div[@class = 'Header_border-bottom-xs__7UZwZ pt-12 pb-12'])[1]/descendant::a")).click();
		
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		
		WebElement plans = driver.findElement(By.xpath("(//div[text() = 'Plans'])[1]"));
		a.moveToElement(plans).build().perform();
		
		driver.findElement(By.xpath("(//div[@class = 'allPlansGA'])[2]")).click();
		
		
		boolean selected = driver.findElement(By.xpath("//input[@id = 'dndConsent']")).isSelected();
		Assert.assertTrue(selected);
		
		driver.findElement(By.xpath("//input[@id = 'name']")).sendKeys("admin");

		driver.findElement(By.xpath("//input[@id = 'mobile']")).sendKeys("123456789");

		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("admin@gmail.com");
		
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
	}
}
