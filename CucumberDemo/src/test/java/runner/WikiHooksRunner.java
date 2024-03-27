package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "C:\\Users\\kesava nagendra\\eclipse-workspace\\CucumberDemo\\src\\test\\java\\features\\WikiHooks.feature",
	glue = {"steps"},
	dryRun = false,
	plugin = {"pretty", "html:target/TestreportToday.html"}, 
	monochrome = true, // console output will be in more readable format
	tags = "@login"
		
		)
public class WikiHooksRunner {

}
