package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestNinjaWithArgs {

	WebDriver driver;
	
	@Given("Iam on tutorialsNinja Homepage")
	public void iam_on_tutorials_ninja_homepage() {
	    
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
	}
	
	@Then("I click on my account link")
	public void i_click_on_my_account_link() {
	   
		driver.findElement(By.xpath("//span[text() = 'My Account']")).click();
	}
	
	@When("I click on my login click")
	public void i_click_on_my_login_click() {
	   
		driver.findElement(By.xpath("//a[text() = 'Login']")).click();
	}
	
	@Then("I will be on  the login page and I capture the title of the page")
	public void i_will_be_on_the_login_page_and_i_capture_the_title_of_the_page() {
	   
		System.out.println("Title of the page is "+driver.getTitle()); 
	}
	
	
	@Then("I enter email id as {string} on the page")
	public void i_enter_email_id_as_on_the_page(String string) {
	   
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys(string);
	}
	
	@Then("I enter password as {string} on the page")
	public void i_enter_password_as_on_the_page(String string) {
	    
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys(string);
	}
	
	@Then("I click on Login button")
	public void i_click_on_login_button() {
	    
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
	}



}
