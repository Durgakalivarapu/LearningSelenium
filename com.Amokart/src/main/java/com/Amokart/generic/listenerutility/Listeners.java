package com.Amokart.generic.listenerutility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.Amokart.generic.common.BaseClass;

public class Listeners extends BaseClass implements ITestListener
{

	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
			}

	public void onTestFailure(ITestResult result) {
		
		String name = result.getName();
		
		Reporter.log("TAKING SCREENSHOT --Start-- : " + name, true);
		
		
		//Perform TypeCasting-WebdriverType to TakeScreenshot
		TakesScreenshot tsref = (TakesScreenshot)BaseClass.driver_Static;
		
		//call the screenshot Method & save in temp path
		File temp = tsref.getScreenshotAs(OutputType.FILE);
		
		//Create a permanent path & save it
		File permanent = new File("./src/test/resources/Screenshot/"+name+".png");
		
		//copy the file from temp to permanent
		try {
			FileHandler.copy(temp, permanent);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Reporter.log("TAKING SCREENSHOT --COMPLTED--: " + name, true);
		
		
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}
	

}
