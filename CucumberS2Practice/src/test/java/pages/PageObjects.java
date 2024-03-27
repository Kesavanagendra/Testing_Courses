package pages;


import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageObjects {

	@FindBy(id = "Email")
	WebElement username;
	
	@FindBy(id = "Password")
	WebElement pass;
	
	@FindBy(xpath = "//a[text()='Log in']")
	WebElement LoginLink;
	
	@FindBy(xpath = "//input[@value = 'Log in']")
	WebElement loginBtn;
	
	@FindBy(linkText = "Log out")
	WebElement logout;
	
	@FindBy(xpath = "//input[@id = 'small-searchterms']")
	WebElement searchbar;
	
	@FindBy(xpath = "//input[@class = 'button-1 search-box-button']")
	WebElement searchbutton;
	
	public PageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickLogin() {
		
		LoginLink.click();
	}
	
	public void enteruser(String user1) {
		
		username.sendKeys(user1);
		
		
	}
	
	public void enterpass(String user2) {
		
		pass.sendKeys(user2);
		
	}
	
	public void clickLoginBtn() {
		
		loginBtn.click();
	}
	
	public void clickLogout() {
		
		logout.click();
	}
	
	public void clickSearchbar() {
		
		searchbar.sendKeys("books");
	}
	
	public void clickSearchicon() {
		
		searchbutton.click();
	}
}
