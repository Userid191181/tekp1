package com.crm.CampaignTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.comcat.crm.objectrepositoryutility.CampaignHomePage;
import com.comcat.crm.objectrepositoryutility.CampaignInfoPage;
import com.comcat.crm.objectrepositoryutility.CreateCampaignPage;
import com.comcat.crm.objectrepositoryutility.HomePage;
import com.comcat.crm.objectrepositoryutility.LoginPage;
import com.crm.generic.FileUtility.ExcelFileUtility;
import com.crm.generic.FileUtility.FileUtility;
import com.crm.generic.WebDriverUtility.JavaUtility;
import com.crm.generic.WebDriverUtility.WebDriverUtility;

public class CreateCampaignWithExpectedCloseDate {

	public static void main(String[] args) throws IOException {
		// Creating object for all Utility
		FileUtility fLib = new FileUtility();
		ExcelFileUtility eLib = new ExcelFileUtility();
		WebDriverUtility wLib = new WebDriverUtility();
		JavaUtility jLib = new JavaUtility();

		// Adding Date to Expected Close Date
		String endDate = jLib.getReqDateyyyymmdd(30);

		// Reading data from Properties File (common data)
		FileInputStream fis = new FileInputStream("./ConfigAppData/commonData.properties");
		Properties pro = new Properties();
		pro.load(fis);
		String BROWSER = fLib.getDataFromPropertiesFile("browser");
		String URL = fLib.getDataFromPropertiesFile("url");
		String USERNAME = fLib.getDataFromPropertiesFile("username");
		String PASSWORD = fLib.getDataFromPropertiesFile("password");

		// Reading data from Excel (Testcase specific data)
		String campname = eLib.getDataFromExcel("campaign", 1, 2) + jLib.getRandomNum();

		// Open Browser
		WebDriver driver = null;
		if (BROWSER.equals("edge")) {
			driver = new EdgeDriver();
		} else if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new FirefoxDriver();
		}
		// login to application
		wLib.waitforPageToLoad(driver);
		driver.get(URL);
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		lp.logintocrm(USERNAME, PASSWORD);

		// Navigate to Campaign link
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		hp.getMoreLink().click();
		hp.getCampaignsLink().click();

		CampaignHomePage cp = PageFactory.initElements(driver, CampaignHomePage.class);
		cp.getCampaignBtn().click();

		CreateCampaignPage crecamp = PageFactory.initElements(driver, CreateCampaignPage.class);

		// Adding Campaign Name, Type and Campaign Status.
		crecamp.getCampaignEdit().sendKeys(campname);
		crecamp.getExpClosedate().clear();
		crecamp.getExpClosedate().sendKeys(endDate);
		crecamp.getSaveBtn().click();

		// verify expected msg results in the Header
		CampaignInfoPage campinfop = PageFactory.initElements(driver, CampaignInfoPage.class);

		String act_campname = campinfop.getCampaignNameAfterSave().getText();

		if (act_campname.equals(campname)) {
			System.out.println(campname + " is present in the Campaign Name field");
		} else {
			System.out.println("Campaign name is not be present");
		}
		driver.quit();
	}
}