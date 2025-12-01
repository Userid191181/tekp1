package com.crm.generic.baseUtility;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.comcat.crm.objectrepositoryutility.HomePage;
import com.comcat.crm.objectrepositoryutility.LoginPage;
import com.crm.generic.DatabaseUtility.DatabaseUtility;
import com.crm.generic.FileUtility.ExcelFileUtility;
import com.crm.generic.FileUtility.FileUtility;
import com.crm.generic.WebDriverUtility.JavaUtility;
import com.crm.generic.WebDriverUtility.UtilityClassObject;
import com.crm.generic.WebDriverUtility.WebDriverUtility;

@Listeners(com.comcast.crm.generic.listenerutility.ListenerImplementationClass.class)
	public class BaseClassTest {
	public FileUtility fLib = new FileUtility();
	public ExcelFileUtility eLib = new ExcelFileUtility();
	public WebDriverUtility wLib = new WebDriverUtility();
	public JavaUtility jLib = new JavaUtility();
	public DatabaseUtility dLib = new DatabaseUtility();
	public WebDriver driver = null; // need to declare globally.
	public static WebDriver sdriver = null; // declaring this as static variable to pass Session IT to @Listener

	
	@BeforeSuite(groups = { "Smoke", "Regression" })
	public void beforeSuite() throws SQLException {
		System.out.println("===Connect to DB, Report Config===");
		dLib.getDatabase();
	}

	@Parameters("Browser") // specifying @Parameter and specifying "Browser" which is same in TestNG file
	@BeforeClass(groups = { "Smoke", "Regression" })
	public void beforeClass() throws IOException {
		System.out.println("===Launch Browser===");
		//String BROWSER = fLib.getDataFromPropertiesFile("browser");
		String BROWSER = System.getProperty("browser", fLib.getDataFromPropertiesFile("browser"));
		// browser;//here we are not taking browser fomr Properties file we are taking
		// from testng.xml file
		// fLib.getDataFromPropertiesFile("browser");
		if (BROWSER.equals("edge")) {
			driver = new EdgeDriver();
		} else if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new FirefoxDriver();
		}
		sdriver = driver; // driver is the real browser object storing this in sdriver for Session ID.
							// This sdriver we pass as the SessionID to Listener Implemenation.
		UtilityClassObject.setDriver(driver);	
	}

	@BeforeMethod(groups = { "Smoke", "Regression" })
	public void beforeMethod() throws IOException, InterruptedException {
		System.out.println("===Login to App===");
//		String URL = fLib.getDataFromPropertiesFile("url");
//		String USERNAME = fLib.getDataFromPropertiesFile("username");
//		String PASSWORD = fLib.getDataFromPropertiesFile("password");
		
		String URL=System.getProperty("url", fLib.getDataFromPropertiesFile("url"));
		String USERNAME=System.getProperty("username", fLib.getDataFromPropertiesFile("username"));
		String PASSWORD=System.getProperty("password", fLib.getDataFromPropertiesFile("password"));
		LoginPage lp = new LoginPage(driver);
		lp.logintocrmWithURl(URL, USERNAME, PASSWORD);
	}

	@AfterMethod(groups = { "Smoke", "Regression" })
	public void afterMethod() {
		System.out.println("===Logout of App===");
		HomePage hp = new HomePage(driver);
		hp.logout();
	}

	@AfterClass(groups = { "Smoke", "Regression" })
	public void afterClass() {
		System.out.println("===Close Browser===");
		driver.quit();
	}

	@AfterSuite(groups = { "Smoke", "Regression" })
	public void afterSuite() {
		System.out.println("===Close DB, ReportBackUp===");
		dLib.closedbconnection();
	}
}