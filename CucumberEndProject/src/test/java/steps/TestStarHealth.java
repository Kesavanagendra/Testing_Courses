package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class TestStarHealth {

	@Given("User open the Star Health Application")
	public void user_open_the_star_health_application() {
		
		StarHealthHooks.driver.get("https://www.starhealth.in/");	
	}
	
	
	@Then("validates the Star Health home page title using a JUnit assertion")
	public void validates_the_star_health_home_page_title_using_a_j_unit_assertion() {
		
		String ExpectedTitle = "Star Health Insurance: Medical, Accident and Travel insurance policies";
		String ActualTitle = StarHealthHooks.driver.getTitle();
		Assertions.assertEquals(ExpectedTitle,ActualTitle);
	   
	}
	
	@Then("clicks on Buy now button")
	public void clicks_on_buy_now_button() {
		
		StarHealthHooks.driver.findElement(By.xpath("//span[text() = 'Buy Now']")).click();
	}
	
	
	
	@Then("user enters following details")
	public void user_enters_following_details(DataTable dataTable) {
	    
		List<Map<String, String>> userList	= dataTable.asMaps(String.class, String.class);
		
		for(Map<String , String>e : userList) {
			
			StarHealthHooks.driver.findElement(By.xpath("//input[@id = 'name']")).clear();
			StarHealthHooks.driver.findElement(By.xpath("//input[@id = 'name']")).sendKeys(e.get("FullName"));
			
			StarHealthHooks.driver.findElement(By.xpath("//input[@id = 'contact_no']")).clear();
			StarHealthHooks.driver.findElement(By.xpath("//input[@id = 'contact_no']")).sendKeys(e.get("PhNo"));
			
			StarHealthHooks.driver.findElement(By.xpath("//input[@id = 'pinCode']")).clear();
			StarHealthHooks.driver.findElement(By.xpath("//input[@id = 'pinCode']")).sendKeys(e.get("PIN"));
			
		}
		
	}
	
	
	@Then("clicked on Star health logo")
	public void clicked_on_star_health_logo() throws InterruptedException { 
		
		StarHealthHooks.driver.findElement(By.xpath("//img[@class = 'jss103']")).click();
		Thread.sleep(1500);
	}
	
	@Then("User click on blog option")
	public void user_click_on_blog_option() {
		
		/*WebElement e1 = StarHealthHooks.driver.findElement(By.xpath("//span[@class= 'anticon anticon-close ant-modal-close-icon']"));
		WebDriverWait wait = new WebDriverWait(StarHealthHooks.driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class= 'anticon anticon-close ant-modal-close-icon']")));
		e1.click();*/

//		StarHealthHooks.driver.findElement(By.xpath("(//a[text() = 'Blog'])[1]")).click();
		StarHealthHooks.driver.findElement(By.xpath("	//div[@class = 'flex align-center account-info marquee-other-background']/descendant::a[1]")).click();
	
	}
	
	
	@Given("user open starHealth url and moves cursor to signin")
	public void user_open_starHealth_url_and_moves_cursor_to_signin() {
		
		StarHealthHooks.driver.get("https://www.starhealth.in/");
		WebElement signin = StarHealthHooks.driver.findElement(By.xpath("//span[text() = 'Sign in']"));
		Actions a = new Actions(StarHealthHooks.driver);
		a.moveToElement(signin).perform();
		
	   
		
	}
	
	@Then("click on Retails customer option")
	public void click_on_retails_customer_option() {
	   
		StarHealthHooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		StarHealthHooks.driver.findElement(By.xpath("(//div[@class = 'Header_border-bottom-xs__7UZwZ pt-12 pb-12'])[1]/descendant::a")).click();
		
		ArrayList<String> tabs = new ArrayList<>(StarHealthHooks.driver.getWindowHandles());
		StarHealthHooks.driver.switchTo().window(tabs.get(1));
		
	}
	
	@Then("moves cursor to plans")
	public void moves_cursor_to_plans() {
	   
		WebElement plans = StarHealthHooks.driver.findElement(By.xpath("(//div[text() = 'Plans'])[1]"));
		Actions a = new Actions(StarHealthHooks.driver);
		a.moveToElement(plans).build().perform();
	}
	
	@Then("userclicks on My Family plan page")
	public void userclicks_on_my_family_plan_page() {
	   
		StarHealthHooks.driver.findElement(By.xpath("(//div[@class = 'allPlansGA'])[2]")).click();	
	}
	
	@Then("user provides following data")
	public void user_provides_following_data(DataTable dataTable) {
	   
		List<Map<String, String>> userList	= dataTable.asMaps(String.class, String.class);
		
		for(Map<String , String>e : userList) {
			
			StarHealthHooks.driver.findElement(By.xpath("//input[@id = 'name']")).clear();
			StarHealthHooks.driver.findElement(By.xpath("//input[@id = 'name']")).sendKeys(e.get("Name"));
			
			StarHealthHooks.driver.findElement(By.xpath("//input[@id = 'mobile']")).clear();
			StarHealthHooks.driver.findElement(By.xpath("//input[@id = 'mobile']")).sendKeys(e.get("Mobile"));
			
			StarHealthHooks.driver.findElement(By.xpath("//input[@id = 'email']")).clear();
			StarHealthHooks.driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys(e.get("Email"));
			
		}
		
	}
	
	@Then("user clicks on next button")
	public void user_clicks_on_next_button() {

		StarHealthHooks.driver.findElement(By.xpath("//button[@type = 'submit']")).click();
	}
	
	@Then("user clicks on Star health logo")
	public void user_clicks_on_star_health_logo() {
	
		StarHealthHooks.driver.findElement(By.xpath("//img[@class = 'cursor-pointer']")).click();
		
	}

}
