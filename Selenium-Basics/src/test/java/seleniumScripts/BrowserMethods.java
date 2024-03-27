package seleniumScripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver(); // It will open the chrome interface using webdriver driver.
		
		driver.get("https://www.selenium.dev"); // It will open this link in chrome.
		
	
		String title = driver.getTitle(); // It will gives title of the page.
		System.out.println("The title of the page is : "+title);
		
		String url = driver.getCurrentUrl(); //It will gives the url of the page.
		System.out.println("The URL of the page is :"+url);
		
		driver.close();

	}

}
