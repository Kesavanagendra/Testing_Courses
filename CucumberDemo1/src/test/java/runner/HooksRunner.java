package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\kesava nagendra\\eclipse-workspace\\CucumberDemo1\\src\\test\\java\\features\\Hooks.feature",
				glue = {"steps"},
				dryRun = false,
				plugin = {"pretty" , "html:target/Hooksreport.html"},
				tags = "@all"
//				tags = "@Testing1"		
		
		)
public class HooksRunner {

	
}
