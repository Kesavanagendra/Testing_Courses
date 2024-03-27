package seleniumScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotJavaScriptExecution {
	
	public static void drawBorder(WebElement element , WebDriver driver) {
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border = '3px solid red'" ,element);
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		 WebDriver driver = new ChromeDriver();
			
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
			
		driver.get("https://opera.com/download");
			
		Thread.sleep(1000);
			
		WebElement e1 =	driver.findElement(By.xpath("(//div[@class='cookie-consent__body'])[1]/descendant::span[1]"));
		
		drawBorder(e1,driver);
		
		File srcFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		File destFile = new File("./Screenshots/Acceptcookies.png");
		
		FileUtils.copyFile(srcFile, destFile);
		
	}
	

}




