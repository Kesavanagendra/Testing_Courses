package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String args[]) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.chilternoakfurniture.co.uk/");
		
		driver.findElement(By.xpath("//a[@class = 'toolbar-account']")).click();
		
		Thread.sleep(2000);
		
		
		
//		driver.findElement(By.linkText("//a[text() = 'New customer? Sign up for an account']")).click();
		
		
		driver.findElement(By.xpath("//input[@id = 'customer_email']")).sendKeys("Admin123@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'customer_password']")).sendKeys("Ramsai");
		
		driver.findElement(By.xpath("(//input[@class = 'btn'])[1]")).click();
		
		Thread.sleep(60000);
		
		driver.findElement(By.xpath("//a[@class = 'toolbar-account']")).click();
		
		String text = driver.findElement(By.xpath("//div[@id = 'customer_sidebar']/descendant::p")).getText();
		
		System.out.println(text);
//--------------------Login---------------------------------		
	
	/*	driver.findElement(By.xpath("(//a[@class = 'standard-link'])[2]")).click();
		
		driver.findElement(By.xpath("//input[@id = 'first_name']")).sendKeys("sai");
		
		driver.findElement(By.xpath("//input[@id = 'last_name']")).sendKeys("ram");
		
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("Admin42@gmail.com");
		
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("789456");
		
		String text = driver.findElement(By.xpath("//input[@id = 'first_name']")).getText();
		System.out.println(text);
		
		Thread.sleep(5000);*/
		
//		driver.findElement(By.xpath("//input[@class = 'btn']")).click();
	}
}
