package com.demowebshop.qa.Utilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class MyListeners implements ITestListener{

	ExtentReports e;
	ExtentSparkReporter sr;
	ExtentTest t;
	
	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test Case Started");
		t.log(Status.INFO, result.getMethod().getMethodName()+"has started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test Case Success");
		t.log(Status.PASS, result.getMethod().getMethodName()+"has passes");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test Case Failure");
		t.log(Status.FAIL, result.getMethod().getMethodName()+"has failed");
		try {
			
			t.log(Status.PASS, "Screenshot "+t.addScreenCaptureFromBase64String(ScreenshotUtility.takesScreenshot()));
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Test Case Skipped");
		t.log(Status.SKIP, result.getMethod().getMethodName()+"has skipped");
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("TestNG Class Started");
		e = new ExtentReports();
		sr = new ExtentSparkReporter("test-output\\MyReport.html");
		t=e.createTest("LoginAction has Started");
		e.attachReporter(sr);
		e.setSystemInfo("OS", System.getProperty("os.name"));
		e.setSystemInfo("JAVA", System.getProperty("java.version"));
		e.setSystemInfo("HOSTNAME", "Kesava");
		e.setSystemInfo("BROWSER", "Chrome");
	}

	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("TestNG Class Completed");
		e.flush();
	}
	
	

}
