package com.ninja.qa.TestPages;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		// if a @test method is started, it will record the log		
		System.out.println("Test method has been started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		// if test method is success
		System.out.println("Test method is success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		// if test method is failure		
		System.out.println("Test method is failure");
		System.out.println("screenshot code");	
	}

	@Override
	public void onTestSkipped(ITestResult result) {	
		System.out.println("Test method is sipped");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("Test method is failure due to timeout");
	}

	@Override
	public void onStart(ITestContext context) {
		
		// this method will record events in the very beginning of testing		
		System.out.println("Testing has started");
	}

	@Override
	public void onFinish(ITestContext context) {
		
		// this method will record events at end of testing
		System.out.println("Testing has ended");
	}

	
}
