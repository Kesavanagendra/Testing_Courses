package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StarHealth002 {

	@Test
	public void print_link() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.starhealth.in/");
		
		String link1=	driver.findElement(By.linkText("Glossary")).getText();
		System.out.println(link1);
		
		String link2 = driver.findElement(By.xpath("//a[text() = 'Careers']")).getText();
		System.out.println(link2);
		
		String link3 = driver.findElement(By.xpath("//a[text() = 'Contact Us']")).getText();
		System.out.println(link3);
	
        String link4 = driver.findElement(By.xpath("//a[text() = 'Renewals']")).getText();
        System.out.println(link4);
		
		String link5 = driver.findElement(By.xpath("//a[text() = 'Downloads']")).getText();
		System.out.println(link5);
		
		driver.close();
	
	
	
	}
}
