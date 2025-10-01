package com.hyt.screenshots;

import org.openqa.selenium.devtools.v124.page.Page.CaptureScreenshotFormat;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerClass extends BaseTest implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		
		
		//  For ITestListener
		/*
		System.out.println(result.getMethod().getMethodName());
		captureScreenshot(result.getMethod().getMethodName() + ".jpg");
		*/
		// For Dependency Injection
		System.out.println(result.getTestContext().getName() + "_" + result.getMethod().getMethodName());
		captureScreenshot(result.getTestContext().getName() + "_" + result.getMethod().getMethodName() + ".jpg");
	}

	
}
