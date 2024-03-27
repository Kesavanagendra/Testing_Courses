package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\kesava nagendra\\eclipse-workspace\\CucumberDemo1\\src\\test\\java\\features\\Tags.feature",
				glue = {"steps"},
				dryRun = false,
				plugin = {"pretty" , "html:target/Tagsreport.html"},
				tags = "@all"
//				tags = "@SmokeTest"
//				tags = "not @SmokeTest"
//				tags = "@SmokeTest and @DbTest"
//				tags = "@SmokeTest or @RegressionTest"
				
		
		)
public class TagsRunner {

}
