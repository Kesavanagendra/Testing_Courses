/*package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikulidemo {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.remove.bg/");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@class='py-4 md:py-8']/descendant::button[1]")).click();
		
		Screen s = new Screen();
		
		Pattern textfield = new Pattern("C:\\sikuliImage\\newfile1.png");
		
		Pattern openButton = new Pattern("C:\\sikuliImage\\newfile2.png");
		
		s.wait(textfield,20);
		
		s.type(textfield,"C:\\Users\\This pc\\Documents\\ATE-Phase1-SL\\sikulidemo.png");
		
		s.click(openButton);

	}

}*/