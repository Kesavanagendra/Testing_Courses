package project;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class StarHealthPage {

	WebDriver driver;
	
	@BeforeClass
	public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.starhealth.in/");
	}
	

	@Test(priority='1')
	public void Validate_title()
	{
		
		String ExpectedTitle = "Star Health Insurance: Medical, Accident and Travel insurance policies";
		String ActualTitle = driver.getTitle();
		System.out.println("The title of the page is "+ActualTitle );
       assertEquals(ActualTitle, ExpectedTitle , "The title is not valid");
	}
	
	
	@Test(priority='2')
	@Parameters({"name","mobile","email"})
	public void Test_Header_plan(String name, String mobile, String email)
	{
		
		WebElement signin = driver.findElement(By.xpath("//span[text() = 'Sign in']"));
		Actions a = new Actions(driver);
		a.moveToElement(signin).perform();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("(//div[@class = 'Header_border-bottom-xs__7UZwZ pt-12 pb-12'])[1]/descendant::a")).click();
		
		
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
//		driver.findElement(By.xpath("//b[text() = 'Close']")).click();
		
		
		WebElement plans = driver.findElement(By.xpath("(//div[text() = 'Plans'])[1]"));
		a.moveToElement(plans).build().perform();
		
		driver.findElement(By.xpath("(//div[@class = 'allPlansGA'])[2]")).click();
		
		boolean selected = driver.findElement(By.xpath("//input[@id = 'dndConsent']")).isSelected();
		Assert.assertTrue(selected);
		
		driver.findElement(By.xpath("//input[@id = 'name']")).sendKeys(name);

		driver.findElement(By.xpath("//input[@id = 'mobile']")).sendKeys(mobile);

		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys(email);
		
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
	}
	
	

	@Test(dataProvider = "testdata",priority = '3')
	public void validatedatafromExcel(String input1, String input2, String input3, String input4 , String input5)
	{
		
		String Actual_fb = driver.findElement(By.xpath("(//a[@class = 'mr-4 mr-10-xs'])[1]")).getAttribute("href");
		System.out.println(Actual_fb);
		String Expected_fb = input1;
		Assert.assertEquals(Actual_fb, Expected_fb);
		
		String Actual_YT = driver.findElement(By.xpath("(//a[@class = 'mr-4 mr-10-xs'])[2]")).getAttribute("href");
		String Expected_YT = input2;
		Assert.assertEquals(Actual_YT, Expected_YT);
		
		String Actual_Linkedin = driver.findElement(By.xpath("(//a[@class = 'mr-4 mr-10-xs'])[3]")).getAttribute("href");
		String Expected_Linkedin = input3;
		Assert.assertEquals(Actual_Linkedin, Expected_Linkedin);
		
		String Actual_twitter = driver.findElement(By.xpath("(//a[@class = 'mr-4 mr-10-xs'])[4]")).getAttribute("href");
		String Expected_twitter = input4;
		Assert.assertEquals(Actual_twitter, Expected_twitter);
		
		String Actual_insta = driver.findElement(By.xpath("(//a[@class = 'mr-4 mr-10-xs'])[5]")).getAttribute("href");
		String Expected_insta = input5;
		Assert.assertEquals(Actual_insta, Expected_insta);
	
	}
	
	
	@DataProvider(name="testdata")
	public Object[][] datasupplier() throws IOException
	{
		
		Object[][] inputdata = XLS_DataProvider.getTestData("Sheet1");
		
		return inputdata;
	}
	
	
	
	@Test(priority='4')
	public void Clickontwitter()
	{
		driver.findElement(By.xpath("(//a[@class = 'mr-4 mr-10-xs'])[4]")).click();
		
//		ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tab.get(0));
		
		String actualTitle = driver.getTitle();
		
		String expectedTitle = "StarHealthIns";
		
		if(actualTitle.contains(expectedTitle))
		{
			System.out.println("The twitter title contains StarHealthIns");
		}
		else {
			System.out.println("does not contain");
		}
		
	}
	

	@AfterClass
	public void teardown()
	{
		
		driver.quit();
	}
}
