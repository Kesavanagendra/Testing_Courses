package seleniumScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.ironspider.ca/forms/dropdowns.htm");
		
		//Syntax for write the xpath locator
		//Syntax: //tagname[@attribute = 'value']
		WebElement e1 = driver.findElement(By.xpath("//select[@name = 'coffee']"));
		
		
		// Using the Select class method we can perform the actions on the dropdown menu.
		Select dd = new Select(e1);
		
		//Here are three methods to select the dropdown, any one can method you can choose.
		
		dd.selectByIndex(0); //It will select the value by index in the dropdown menu
		Thread.sleep(1500);
		
		dd.selectByValue("sugar"); //It will select the value by attribute value of tag in the dropdown menu
		Thread.sleep(1500);
		
		dd.selectByVisibleText("Crisp (har har...)"); //It will select the value by visible text of tag in the dropdown menu
		
		List<WebElement> li = dd.getOptions();
		
		System.out.println("The size of the dropdown menu is "+ li.size());
		
		for(WebElement l : li) {
			System.out.println(l.getText());
		}
		
		
		// For starts-with() method
		// Syntax:- //tagname[starts-with(@attribute,'unique-value')]
		
		// For contains() method
		// Syntax:- //tagname[contains(@attribute,'uique-value')]
		
		// For text() method
		// Syntax:- //tagname[text() = 'text between tags']
		// example for link <a>log in</a>
		// for above example-- //a[text() = 'log in']
		
	}

}
