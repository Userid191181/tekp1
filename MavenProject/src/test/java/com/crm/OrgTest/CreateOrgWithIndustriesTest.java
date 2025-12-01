package com.crm.OrgTest;

import java.io.IOException;
import java.time.Duration;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.comcat.crm.objectrepositoryutility.CreateNewOrganizationPage;
import com.comcat.crm.objectrepositoryutility.HomePage;
import com.comcat.crm.objectrepositoryutility.LoginPage;
import com.comcat.crm.objectrepositoryutility.OrganizationHomePage;
import com.comcat.crm.objectrepositoryutility.OrganizationInfoPage;
import com.crm.generic.FileUtility.ExcelFileUtility;
import com.crm.generic.FileUtility.FileUtility;
import com.crm.generic.WebDriverUtility.JavaUtility;
import com.crm.generic.WebDriverUtility.WebDriverUtility;

public class CreateOrgWithIndustriesTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// Creating object for all Utilities
		FileUtility fLib = new FileUtility();
		ExcelFileUtility eLib = new ExcelFileUtility();
		WebDriverUtility wLib = new WebDriverUtility();
		JavaUtility jLib = new JavaUtility();

		// Reading data from Properties File (common data)
		String BROWSER = fLib.getDataFromPropertiesFile("browser");
		String URL = fLib.getDataFromPropertiesFile("url");
		String USERNAME = fLib.getDataFromPropertiesFile("username");
		String PASSWORD = fLib.getDataFromPropertiesFile("password");

		// Reading data from Excel (Testcase specific data)
		String orgname = eLib.getDataFromExcel("org", 4, 2) + jLib.getRandomNum();
		String Industry = eLib.getDataFromExcel("org", 4, 3);
		String Type = eLib.getDataFromExcel("org", 4, 4);

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

		// navigate to Organization module
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		hp.getOrganizationsLink().click();

		// naviagte to Organization Home Page
		OrganizationHomePage op = PageFactory.initElements(driver, OrganizationHomePage.class);
		op.getCreateOrganizationBtn().click();

		CreateNewOrganizationPage orgp = PageFactory.initElements(driver, CreateNewOrganizationPage.class);
		orgp.getOrgnameedit().sendKeys(orgname);

		// Selecting Industry and Type dropdown using Select class in WebDriverUtility
		WebElement ind = orgp.getOrgIndustry();
		WebElement type = orgp.getOrgType();

		wLib.select(ind, Industry);
		wLib.select(type, Type);

		orgp.getSaveBtn().click();

		// verify the Industry and Type
		OrganizationInfoPage orinfop = PageFactory.initElements(driver, OrganizationInfoPage.class);
		String actind1 = orinfop.getActIndAfterSave().getText();
		String acttype1 = orinfop.getActTypeAfterSave().getText();

		if (actind1.equals(Industry)) {
			System.out.println(actind1 + " is present in the Industry filed");
		} else {
			System.out.println("Industry name may not be present");
		}

		if (acttype1.equals(Type)) {
			System.out.println(acttype1 + " is present in the Type filed");
		} else {
			System.out.println("Type name may not be present");
		}

		driver.quit();
	}
}