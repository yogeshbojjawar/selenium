package com.Test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("test started now");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("test successfully executed");


	}

	public void onTestFailure(ITestResult result) {
		System.out.println("find out why test failed");

	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("test case skipped");
	}

	public void onFinish(ITestContext context) {
		System.out.println("test case over");

	}

}
