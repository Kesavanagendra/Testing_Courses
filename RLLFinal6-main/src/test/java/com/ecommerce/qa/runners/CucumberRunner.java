package com.ecommerce.qa.runners;
import org.junit.runner.RunWith;
import org.testng.annotations.Listeners;

import com.ecommerce.qa.utilities.TestListener;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@Listeners(TestListener.class)
@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\kesava nagendra\\eclipse-workspace\\RLLFinal6-main\\src\\test\\java\\com\\ecommerce\\qa\\features",
					glue = {"com.ecommerce.qa.steps"},
					dryRun = false,
					plugin = {"html:target/Cucumberreport.html",
							 "pretty",
							 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
							 "timeline:test-output-thread/"
							 }
					)
public class CucumberRunner {

}
