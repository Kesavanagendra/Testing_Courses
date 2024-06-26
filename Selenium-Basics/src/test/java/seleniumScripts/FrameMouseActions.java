package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameMouseActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		// Switch to the frame using its name or index
		
		driver.switchTo().frame(0);
		
		// find element to be dragged
		WebElement e1 = driver.findElement(By.id("draggable"));
		
		// find element where we have to drop
		WebElement e2 = driver.findElement(By.id("droppable"));
		
		// It is mouse Event-> we will use an Action class
		Actions a = new Actions(driver);
		
		a.clickAndHold(e1).moveToElement(e2).release().perform();
		
		driver.close();
		
	}

}
