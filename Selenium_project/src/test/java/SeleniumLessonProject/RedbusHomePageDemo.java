package SeleniumLessonProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedbusHomePageDemo {

	public static void main(String[] args) throws InterruptedException, IOException, ClassNotFoundException, SQLException, AWTException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.redbus.com/");
		
		driver.findElement(By.xpath("//div[@class = 'main-wrapper search-box-wrapper']/descendant::input[1]")).sendKeys("paris");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[2]")).clear();
		
		driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[2]")).sendKeys("London");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='autoFill autosuggest-ul rdc-dest']/descendant::li[3]")).click();
		
		// calendar  
		driver.findElement(By.id("date-box")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='DatePicker__CalendarContainer-sc-1x9sb82-0 bkhtIz']/descendant::span[41]")).click();
		
		   Thread.sleep(3000);	
		driver.findElement(By.id("search_butn")).click();
		
		Thread.sleep(1000);
		
   // Upload file using autoIT

	    driver.get("https://www.remove.bg/");		
	    Thread.sleep(3000);
	    WebElement e1 = driver.findElement(By.xpath("//div[@class='mx-auto w-full px-8 max-w-5xl relative']/descendant::button[1]"));

	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='mx-auto w-full px-8 max-w-5xl relative']/descendant::button[1]")));

	    e1.click();

	    Runtime.getRuntime().exec("C:\\Users\\kesava nagendra\\OneDrive\\Documents\\demo\\Scitescript.exe");
	    
	
	
		// handle webelement using mouse hover
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement e2 = driver.findElement(By.xpath("//*[@class='nav-line-2 ']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(e2).perform();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//span[@class = 'nav-text'])[7]")).click();
		
		
		// JDBC
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		String title = driver.getTitle();
		
		String url = driver.getCurrentUrl();
		
		String dburl = "jdbc:mysql://localhost:3306/seleniumtest";
		String username = "root";
		String password = "Kesava1@";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(dburl,username,password);
		PreparedStatement ps = con.prepareStatement("insert into webtest values(?,?)"); // execute query
		ps.setString(1,title);
		ps.setString(2,url);
		ps.executeUpdate();
		
		
		
		
		// Screenshot
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destFile = new File("./Screenshots/project.png");

		FileUtils.copyFile(srcFile, destFile);
		
		
		

	}

}




















/*
driver.get("https://www.redbus.com/");

//source 
driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[1]")).clear(); 
driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[1]")) .sendKeys("Paris"); 
//stop for five seconds 
Thread.sleep(5000); 
//Press Enter 

Robot robot = new Robot();
robot.keyPress(KeyEvent.VK_ENTER);


// destination 
driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[2]")).clear(); 
driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[2]")) .sendKeys("London"); 
//stop for five seconds 
Thread.sleep(5000); 
//Press Enter 
robot.keyPress(KeyEvent.VK_ENTER);

//stop for 3 seconds 
Thread.sleep(3000);

//Calendar 
driver.findElement(By.id("date-box")).click(); 
Thread.sleep(5000);

// Select date 
driver.findElement( By.xpath("//div[@class='DatePicker__CalendarContainer-sc-1x9sb82-0 bkhtIz']/descendant::span[41]")) .click(); 
//stop for five seconds 
Thread.sleep(5000);

// click on search button 
driver.findElement(By.id("search_butn")).click();

//Stop for 10 seconds. 
Thread.sleep(1000);
*/
