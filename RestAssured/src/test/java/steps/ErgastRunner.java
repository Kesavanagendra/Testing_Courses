package steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\kesava nagendra\\eclipse-workspace\\RestAssured\\src\\test\\java\\features\\ergast.feature",
					glue = {"steps"},
					dryRun = false,
					plugin = {"pretty","html:target/Report1.html"}
					)
public class ErgastRunner {

}
