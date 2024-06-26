package seleniumScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement e1 = driver.findElement(By.xpath("//*[@class='nav-line-2 ']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(e1).perform();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//span[@class = 'nav-text'])[7]")).click();

	}

}

