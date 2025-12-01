package com.comcast.crm.generic.listenerutility;

import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.crm.generic.WebDriverUtility.UtilityClassObject;
import com.crm.generic.baseUtility.BaseClassTest;

public class ListenerImplementationClass implements ITestListener, ISuiteListener //achieving multiple inheritance by implementing ITestListener, ISuiteListener
{
	public ExtentSparkReporter spark; // configuring globally for Extent.log to use this.
	public static ExtentReports report;
	public  ExtentTest test;

	public void onStart(ISuite suite)
	{
		Reporter.log("Report Configuration", true);		
		// HighLevel Configuration is below:
		String time=new Date().toString().replace("","_").replace(":", "_");
		spark = new ExtentSparkReporter("./AdvanceReport/report_"+time+".html");
		spark.config().setDocumentTitle("CRMTestSuit - Result"); // Title of Report
		spark.config().setReportName("CRM - Automation - Report"); // Name of Report
		spark.config().setTheme(Theme.STANDARD); // Theme of the Report

		// Add Env information & create test
		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS", "Window-11");
		report.setSystemInfo("BROWSER", "Chrome1.1v");		
	}
	
	public void onFinish(ISuite suite)
	{
		Reporter.log("Report Backup", true);
		report.flush();
	}
	
	public void onTestStart(ITestResult result)
	{
        
		Reporter.log("========" +result.getMethod().getMethodName() +"====START====="); //this will display name of the test case in the console.
		test= report.createTest(result.getMethod().getMethodName());
		UtilityClassObject.setTest(test);  
		test.log(Status.INFO, result.getMethod().getMethodName()+"==> STARTED<==="); //passing statement before start of Test
	}
	
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log("========" + result.getMethod().getMethodName() +"=====END======"); //this will display at the end of test execution.
		test.log(Status.INFO, result.getMethod().getMethodName()+"==> COMPLETED<==="); //passing statement after test is completed
	}
	
	public void onTestFailure(ITestResult result)
	{
		String testname = result.getMethod().getMethodName();
		TakesScreenshot ts=(TakesScreenshot) BaseClassTest.sdriver;
		String src=ts.getScreenshotAs(OutputType.BASE64); //We need to use BASE64 as ExtentReport supports BASE64
		
		String newdate=new Date().toString().replace("","_").replace(":", "_"); 
		test.addScreenCaptureFromBase64String(src, testname+"_"+newdate); //passing the testcasename instaed of ErrorFile.
		test.log(Status.FAIL  , testname+"==> FAILED<===");//passing statement aftre failure
     }
}