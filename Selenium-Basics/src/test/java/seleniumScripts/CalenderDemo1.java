package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		driver.manage().deleteAllCookies(); // delete the cookies of the browser
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		// click on the text box of Date field, so that calender is displayed
		driver.findElement(By.xpath("//input[contains(@id,'picker')]")).click();		
		Thread.sleep(1500);
		
		// Once the calander opens, lets inspect the month and year and then print its text on console		
		// whenever we have to get text of an element- getText()
		String monthyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		
		String my[] =  monthyear.split(" ");
		String month = my[0];
		String year = my[1];
		
		while(!(month.equals("August") && year.equals("2024"))) {
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();			
			
			monthyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			
			month = monthyear.split(" ")[0];
			year = monthyear.split(" ")[1];
		
		}
		
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[text()='27']")).click();
	
	}

}




