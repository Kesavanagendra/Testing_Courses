package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\kesava nagendra\\eclipse-workspace\\CucumberDemo\\src\\test\\java\\features\\Amazon.feature" ,
				glue = {"steps"},
				dryRun = false,
				plugin = {"pretty" , "html:target/AmazonReport.html",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						"timeline:test-output-thread/"},
				tags = "@all"
		
		)
public class AmazonRunner {

}
