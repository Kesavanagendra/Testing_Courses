package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLoginFeature {

	WebDriver driver;

	
	@Given("I open the browser and enter url")
	public void i_open_the_browser_and_enter_url() {
	    
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mypage.rediff.com/login/dologin");
	}
	
	@Then("I capture the title of the page")
	public void i_capture_the_title_of_the_page() {
	    
		driver.getTitle();
	}
	
	@Then("I enter username and password")
	public void i_enter_username_and_password() {
	   
		driver.findElement(By.xpath("//input[@id = 'txtlogin']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@name = 'num']")).sendKeys("admin@123");
	}
	
	@When("I click on login button")
	public void i_click_on_login_button() {
	    
		driver.findElement(By.xpath("//input[@value = 'Login']")).click();
	}
	
	@Then("I should see an Error message")
	public void i_should_see_an_error_message() {
	    
		driver.findElement(By.xpath("//div[@class = 'errmsg']/descendant::b")).getText();
	}
	
	@Then("I click on click here link")
	public void i_click_on_click_here_link() {
	   
		driver.findElement(By.xpath("//div[@class = 'errmsg']/descendant::a")).click();
	}
	
	@Then("I close the browser")
	public void i_close_the_browser() {
	   
		driver.quit();
	}
	
	@Then("I click on create a Rediffmail account")
	public void i_click_on_create_a_rediffmail_account() {
	    
		driver.findElement(By.xpath("//div[@id = 'toprightinfo']/child::a[2]")).click();
	}


}
