package com.qa.chilternoak.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Users\\kesava nagendra\\eclipse-workspace\\RLLProject\\src\\test\\java\\com\\qa\\chilternoak\\features\\SignUp.feature",
					glue = {"com.qa.chilternoak.steps"},
					dryRun = false,
					plugin = {"html:target/Cucumberreport.html",
							 "pretty",
							 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
							 "timeline:test-output-thread/"
							 }
					)
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
