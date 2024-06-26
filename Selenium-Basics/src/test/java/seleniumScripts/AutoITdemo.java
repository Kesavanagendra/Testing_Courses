package seleniumScripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoITdemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.remove.bg/");
		
		Thread.sleep(3000);
		
		WebElement e1 = driver.findElement(By.xpath("//div[@class='mx-auto w-full px-8 max-w-5xl relative']/descendant::button[1]"));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='mx-auto w-full px-8 max-w-5xl relative']/descendant::button[1]")));
		
		e1.click();
		
		// In order to upload files from our windows machine we will use too AutoIT
		
		// We will use autoIt Editor to write a script 
		// locate filename text box and open button
		/* Write this script using scite tool
		  ControlFocus("Open","","Edit1")
		  ControlSetText("Open","","Edit1","C:\Users\sonal\Documents\ATE-Phase1-SL\JDBCconnectivity.png")
          ControlClick("Open","","Button1")
		*/
		
		// save the script in a folder on your desktop
		// now go to this folder--> right click on your script file--> select Compile script
		// a new compiled file will be there
		// Now we have to ask autoIT tool to run this compiled script
		
		Runtime.getRuntime().exec("C://Users//kesava nagendra//OneDrive//Documents//demo/Scriptfile.exe");
		
		
	}

}
