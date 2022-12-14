package com.actitime.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.externalautomation.practice.BaseClass;

public class ListenersImplementation extends BaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{

		TakesScreenshot t=(TakesScreenshot)driver;
		File src=t.getScreenshotAs(OutputType.FILE);
		File des=new File("./Screenshots/"+result.getName()+".png");
		try 
		{
			FileUtils.copyFile(src, des);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onFinish(ITestContext context) {
	}

}
