package steps;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TestAmazonDemo {

	
	@Given("user click on signin link")
	public void user_click_on_signin_link() throws InterruptedException {
	    
		WebElement e1 = BaseAmazonHooks.driver.findElement(By.xpath("//*[@class='nav-line-2 ']"));
		Actions a = new Actions(BaseAmazonHooks.driver);		
		a.moveToElement(e1).perform();		
		Thread.sleep(5000);
		BaseAmazonHooks.driver.findElement(By.linkText("Sign in")).click();
	}
	
	@Then("user Enters username as {string}")
	public void user_enters_username_as(String string) {
	    
		BaseAmazonHooks.driver.findElement(By.id("ap_email")).sendKeys(string);
		BaseAmazonHooks.driver.findElement(By.xpath("//input[@id = 'continue']")).click();
	}
	
	@Then("user Enters password as {string}")
	public void user_enters_password_as(String string) {
	    
		BaseAmazonHooks.driver.findElement(By.id("ap_password")).sendKeys(string);
		
	}
	
	@Then("user click on login")
	public void user_click_on_login() {
	   
		BaseAmazonHooks.driver.findElement(By.xpath("//input[@id = 'signInSubmit']")).click();
	}
	
	@Given("user clicks on mobile")
	public void user_clicks_on_mobile() {
	    
		BaseAmazonHooks.driver.findElement(By.linkText("Mobiles")).click();
	}
	
	@Then("user moves cursor to mobiles&Accessories")
	public void user_moves_cursor_to_mobiles_accessories() throws InterruptedException {
	    
		WebElement mobile = BaseAmazonHooks.driver.findElement(By.xpath("//*[@id='nav-subnav']/descendant::span[2]"));
		
		Actions a = new Actions(BaseAmazonHooks.driver);
		a.moveToElement(mobile).build().perform();
		Thread.sleep(3000);
	}
	
	@Then("click on Apple link")
	public void click_on_apple_link() throws InterruptedException {
	    
		BaseAmazonHooks.driver.findElement(By.linkText("Apple")).click();
		Thread.sleep(1500);
	}
	
	@Then("select the mobile")
	public void select_the_mobile() {
		
		BaseAmazonHooks.driver.findElement(By.xpath("(//span[@class = 'a-size-base-plus a-color-base a-text-normal'])[1]")).click();
		
		// switch to the new tab window				
		ArrayList<String> tabs = new ArrayList<String>(BaseAmazonHooks.driver.getWindowHandles());
					
		BaseAmazonHooks.driver.switchTo().window(tabs.get(1));	
	}
	
	@Then("click on add to cart button")
	public void click_on_add_to_cart_button() {
	    
		BaseAmazonHooks.driver.findElement(By.xpath("//input[@id = 'add-to-cart-button']")).click();
	}
}
