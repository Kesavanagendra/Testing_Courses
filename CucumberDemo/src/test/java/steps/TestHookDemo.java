package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TestHookDemo {

	WebDriver driver;
	
	@Given("I am on tutorialsNinja Homepage")
	public void i_am_on_tutorials_ninja_homepage() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");   
	}

	@Then("I close browser")
	public void i_close_browser() {
		
	    driver.close();
	}
	
	@Then("I enter the Input for the search box")
	public void i_enter_the_input_for_the_search_box() {
		
	  driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Mac");
	}
	@Then("I click on the search button")
	public void i_click_on_the_search_button() {
		
		 driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
	}
	
	@Given("I click on Add to Cart button")
	public void i_click_on_add_to_cart_button() {
		 driver.findElement(By.linkText("Shopping Cart")).click();
	}
	@Given("I click on the checkout button")
	public void i_click_on_the_checkout_button() {
		driver.findElement(By.linkText("Checkout")).click();
	}
}
