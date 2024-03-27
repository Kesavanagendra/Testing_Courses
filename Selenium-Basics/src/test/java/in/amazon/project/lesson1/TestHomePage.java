package in.amazon.project.lesson1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestHomePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();		
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

		WebElement e1 = driver.findElement(By.xpath("//*[@class='nav-line-2 ']"));
		Actions a = new Actions(driver);		
		a.moveToElement(e1).perform();		
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign in")).click();
		
		//Inspect the Email and continue button on sign page.
		Thread.sleep(3000);
		
		driver.findElement(By.id("ap_email")).sendKeys("Kesava@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'continue']")).click();
		
		
		//Inspect the password and continue button on sign page.
		driver.findElement(By.id("ap_password")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id = 'signInSubmit']")).click();
		
		
		String text = driver.findElement(By.xpath("//div[@class = 'a-alert-content']/descendant::span")).getText();
		System.out.println(text);
	
	}

}
