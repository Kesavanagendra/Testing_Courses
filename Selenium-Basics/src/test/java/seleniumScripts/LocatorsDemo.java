package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		// Maxamize the browser window- we will see browser window methods
		driver.manage().window().maximize();
		
		
		// for username with id locator
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%25253ASign+up");
		
		// Inspect the Element Username using ID locator and check if the textbox is present or not
		boolean displayed = driver.findElement(By.id("wpName2")).isDisplayed();
		System.out.println("Element is displayed "+displayed);
		
		// Inspect the Element Username using ID locator and check if the textbox is enabled or not
		boolean enabled = driver.findElement(By.id("wpName2")).isEnabled();
		System.out.println("Element is enabled "+enabled);
		
		// sendKeys("inputvalue") ==> will enter input data in a text box
		driver.findElement(By.id("wpName2")).sendKeys("admin");
		
		
		
		// // for password with id locator
		WebElement password = driver.findElement(By.id("wpPassword2"));
		
		password.isDisplayed();
		password.isEnabled();
		password.sendKeys("admin@123");
		
		// for confirm password with name locator
		WebElement confirm = driver.findElement(By.name("retype"));
		confirm.isDisplayed();
		confirm.isEnabled();
		confirm.sendKeys("admin@123");
		
		
		// for confirm password with name locator
		WebElement email = driver.findElement(By.name("email"));
		boolean display = email.isDisplayed();
		boolean enable =  email.isEnabled();
		email.sendKeys("admin@gmail.com");
		
		System.out.println("email is displayed "+ display);
		System.out.println("email is enabled "+ enable);
		
	}

}
