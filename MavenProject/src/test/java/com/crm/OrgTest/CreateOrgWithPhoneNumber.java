package com.crm.OrgTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Browser;
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

public class CreateOrgWithPhoneNumber {

	public static void main(String[] args) throws IOException {
		FileUtility fLib = new FileUtility();
		WebDriverUtility wLib = new WebDriverUtility();
		JavaUtility jLib = new JavaUtility();
		ExcelFileUtility eLib = new ExcelFileUtility();

		// Reading data from Properties File (common data)
		String BROWSER = fLib.getDataFromPropertiesFile("browser");
		String URL = fLib.getDataFromPropertiesFile("url");
		String USERNAME = fLib.getDataFromPropertiesFile("username");
		String PASSWORD = fLib.getDataFromPropertiesFile("password");

		// Reading data from Excel (Testcase specific data)
		String orgname = eLib.getDataFromExcel("org", 7, 2) + jLib.getRandomNum();
		String PhoneNum = eLib.getDataFromExcel("org", 7, 3);

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

		//	CreateNewOrganizationPage orgp=PageFactory.initElements(driver, CreateNewOrganizationPage.class);
		//orgp.getOrgnameedit().sendKeys(orgname);
		
		// navigate to Organization module
		CreateNewOrganizationPage orgp = PageFactory.initElements(driver, CreateNewOrganizationPage.class);
		orgp.getOrgnameedit().sendKeys(orgname);
		orgp.getOrgPhone().sendKeys(PhoneNum);
		orgp.getSaveBtn().click();

		// verify the Phone number
		OrganizationInfoPage orinfop = PageFactory.initElements(driver, OrganizationInfoPage.class);
		String actph1 = orinfop.getActPhoneAfterSave().getText();

		if (PhoneNum.equals(actph1)) {
			System.out.println(actph1 + " is present in the Industry field");
		} else {
			System.out.println("Phone number may not be present");
		}

		driver.quit();
	}
}
