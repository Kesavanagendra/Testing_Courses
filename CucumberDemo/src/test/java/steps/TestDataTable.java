package steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TestDataTable {

	WebDriver driver;
	
	@Given("User is on Create Account Page")
	public void user_is_on_create_account_page() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up&returntoquery=centralAuthAutologinTried%3D1%26centralAuthError%3DNot%2Bcentrally%2Blogged%2Bin");
	}
	
	

	@Then("User enters following details")
	public void user_enters_following_details(DataTable datatable) {
		
		// A datatable in cucumber return a List or a Map
		List<List<String>>userList = datatable.asLists(String.class);
		
		for(List<String> e : userList) {    
			
//			System.out.println(e);
			
			// Here fetch the value based on index
			driver.findElement(By.xpath("(//div[@class='cdx-text-input']/descendant::input[1])[1]")).clear();
			driver.findElement(By.xpath("(//div[@class='cdx-text-input']/descendant::input[1])[1]"))
			.sendKeys(e.get(0));
			driver.findElement(By.xpath("(//div[@class='cdx-text-input']/descendant::input[1])[2]")).clear();
			driver.findElement(By.xpath("(//div[@class='cdx-text-input']/descendant::input[1])[2]"))
			.sendKeys(e.get(1));
			driver.findElement(By.xpath("(//div[@class='cdx-text-input']/descendant::input[1])[3]")).clear();
			driver.findElement(By.xpath("(//div[@class='cdx-text-input']/descendant::input[1])[3]"))
			.sendKeys(e.get(2));
			driver.findElement(By.xpath("(//div[@class='cdx-text-input']/descendant::input[1])[4]")).clear();
			driver.findElement(By.xpath("(//div[@class='cdx-text-input']/descendant::input[1])[4]"))
			.sendKeys(e.get(3));
			
		}
	}
	
	
	@Then("User enters following details using column name")
	public void datatabledemoMaps(DataTable datatable)
	{
	// fetches the entire data table
		
		List<Map<String , String>>userList = datatable.asMaps(String.class , String.class);
		
		for(Map<String , String> e : userList) {
			
			// Here fetch the value based on column
			driver.findElement(By.xpath("(//div[@class='cdx-text-input']/descendant::input[1])[1]")).clear();
			driver.findElement(By.xpath("(//div[@class='cdx-text-input']/descendant::input[1])[1]"))
			.sendKeys(e.get("Username"));
			driver.findElement(By.xpath("(//div[@class='cdx-text-input']/descendant::input[1])[2]")).clear();
			driver.findElement(By.xpath("(//div[@class='cdx-text-input']/descendant::input[1])[2]"))
			.sendKeys(e.get("Password"));
			driver.findElement(By.xpath("(//div[@class='cdx-text-input']/descendant::input[1])[3]")).clear();
			driver.findElement(By.xpath("(//div[@class='cdx-text-input']/descendant::input[1])[3]"))
			.sendKeys(e.get("retype"));
			driver.findElement(By.xpath("(//div[@class='cdx-text-input']/descendant::input[1])[4]")).clear();
			driver.findElement(By.xpath("(//div[@class='cdx-text-input']/descendant::input[1])[4]"))
			.sendKeys(e.get("Email ID"));
		}
		
	}
	
	@Then("Account creation is successfull")
	public void account_creation_is_successfull() {
	
		driver.close();
	}
}
