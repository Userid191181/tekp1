//package ExtendReport;
//
//import java.io.File;
//
//import org.bouncycastle.crypto.digests.SparkleDigest;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.aventstack.extentreports.reporter.configuration.Theme;
//import com.crm.generic.baseUtility.BaseClassTest;
//
//public class CreateContactTest extends BaseClassTest {
//
//	ExtentReports report; //configuring globally for Extent.log to use this.
//	
////@BeforeSuite
////public void configBS()
////{
//////	//HighLevel Configuration is below:
//////	ExtentSparkReporter spark=new ExtentSparkReporter("./AdvanceReport/report.html");
//////	spark.config().setDocumentTitle("CRMTestSuit - Result"); //Title of Report
//////	spark.config().setReportName("CRM - Automation - Report"); //Name of Report
//////	spark.config().setTheme(Theme.STANDARD); //Theme of the Report
//
//	
//////	
//////	//Add Env information & create test
//////	report.attachReporter(spark);
//////	report.setSystemInfo("OS", "Window-11");
//////	report.setSystemInfo("BROWSER", "Chrome1.1v");
////}
////@AfterSuite
////public void configAS()
////{
////	//report.flush(); //Taking BAckup of the report. If this is not give then the Reports will not be saved.
////}
//	
//@Test
//public void CreateContact()
//{
//	WebDriver driver=new ChromeDriver();
//	driver.get("http://49.249.28.218:8888/");
//	
////	TakesScreenshot ts=(TakesScreenshot) driver;
////	String src=ts.getScreenshotAs(OutputType.BASE64); //We need to use BASE64 as ExtentReport supports BASE64
//	//movig this TakesScreenshot to ListenerImplementationClass
//	ExtentTest test= report.createTest("CreateContactTest");
//	
//	test.log(Status.INFO, "login to app"); //instead of SOP we use test.log and passing Info Status 
//	test.log(Status.INFO, "navigate to contact page"); 
//	test.log(Status.INFO, "create contact");
//	if("HDFC".equals("HDF"))
//			{
//			test.log(Status.PASS,"Contact is created"); //we use test.log and passing Status.PASS 
//			}
//	else
//	{
//		//Whenever there is failure we will configure below code to add screenshot with BASE64
//		test.log(Status.FAIL, "Contact is NOT saved");
//
//	}
//	driver.close();
//	test.log(Status.INFO, "Log out of app");	
//}
//
//@Test(enabled=false)
//public void CreateContactWithOrg()
//{
//
//	ExtentTest test= report.createTest("CreateContactWithOrgTest");
//	
//	test.log(Status.INFO, "login to app"); //instead of SOP we use test.log and passing Info Status 
//	test.log(Status.INFO, "navigate to contact with Org page"); 
//	test.log(Status.INFO, "create contact with Org");
//	if("HDFC".equals("HDFC"))
//			{
//			test.log(Status.PASS,"Contact is created with Org"); //we use test.log and passing Status.PASS 
//			}
//	else
//	{
//		test.log(Status.FAIL, "Contact is NOT created with Org");//we use test.log and passing Status.FAIL 
//	}
//	test.log(Status.INFO, "Log out of app");
//}
//
//
//@Test(enabled=false)
//public void CreateContactWithSupportDate()
//{
//
//	ExtentTest test= report.createTest("CreateContactWithSupportDate");
//	
//	test.log(Status.INFO, "login to app"); //instead of SOP we use test.log and passing Info Status 
//	test.log(Status.INFO, "navigate to contact page"); 
//	test.log(Status.INFO, "create contact with Support Date");
//	if("HDFC".equals("HDFC"))
//			{
//			test.log(Status.PASS,"Contact is created with Support Date"); //we use test.log and passing Status.PASS 
//			}
//	else
//	{
//		test.log(Status.FAIL, "Contact is NOT created with Support Date");//we use test.log and passing Status.FAIL 
//	}
//	test.log(Status.INFO, "Log out of app");	
//}
//}
