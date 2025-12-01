package com.crm.CampaignTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

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
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.comcat.crm.objectrepositoryutility.CampaignHomePage;
import com.comcat.crm.objectrepositoryutility.CampaignInfoPage;
import com.comcat.crm.objectrepositoryutility.CreateCampaignPage;
import com.comcat.crm.objectrepositoryutility.HomePage;
import com.comcat.crm.objectrepositoryutility.LoginPage;
import com.crm.generic.FileUtility.ExcelFileUtility;
import com.crm.generic.FileUtility.FileUtility;
import com.crm.generic.WebDriverUtility.JavaUtility;
import com.crm.generic.WebDriverUtility.WebDriverUtility;
import com.crm.generic.baseUtility.BaseClassTest;

public class CampaignWithTypeAndStatus extends BaseClassTest {
@Test
	public void CampaignWithTypeAndStatus() throws IOException, InterruptedException {
		// Creating object for all Utility
		ExcelFileUtility eLib = new ExcelFileUtility();
		WebDriverUtility wLib = new WebDriverUtility();
		
		// Reading data from Properties File (common data)

//		String BROWSER=fLib.getDataFromPropertiesFile("browser");
//		String URL=fLib.getDataFromPropertiesFile("url");
//		String USERNAME=fLib.getDataFromPropertiesFile("username");
//		String PASSWORD=fLib.getDataFromPropertiesFile("password");
		
		// Reading data from ExcelUtility (Testcase specific data)
		String campname=eLib.getDataFromExcel("campaign", 1, 2);
		String campaignType=eLib.getDataFromExcel("campaign", 1, 3);
		String campaignStatus=eLib.getDataFromExcel("campaign", 1, 4);
	
		//Open Browser
//		WebDriver driver=null;
//		if(BROWSER.equals("edge"))
//		{
//			driver=new EdgeDriver();
//		}
//		else if(BROWSER.equals("chrome"))
//		{
//			driver=new ChromeDriver();
//		}
//		else if(BROWSER.equals("firefox"))
//		{
//			driver=new FirefoxDriver();
//		}
//		else
//		{
//			driver=new FirefoxDriver();
//		}
		//login to application
//		wLib.waitforPageToLoad(driver);
//		driver.get(URL);
//		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
//		lp.logintocrm(USERNAME, PASSWORD);

		//Navigate to Campaign link
		HomePage hp=new HomePage(driver);
		hp.getMoreLink().click();
		hp.getCampaignsLink().click();
		
		CampaignHomePage cp=new CampaignHomePage(driver);
		cp.getCampaignBtn().click();
		
		CreateCampaignPage crecamp=new CreateCampaignPage(driver);
				
		//Adding Campaign Name, Type and Campaign Status.
		crecamp.getCampaignEdit().sendKeys(campname);
		WebElement campStatus = crecamp.getCampaignstatusListbox();		
		wLib.select(campStatus, campaignStatus);
		
		WebElement campType = crecamp.getCampaigntypeListbox();
		wLib.select(campType, campaignType);
		
		crecamp.getSaveBtn().click();
		
		CampaignInfoPage campinfop=new CampaignInfoPage(driver);
				
		//verify expected msg results in the Header
		String headerInfo = campinfop.getCampaignHeaderInfo().getText();
		if(headerInfo.contains(campname))
		{
			System.out.println(campname + "is created==PASS");
		}
		else
		{
			System.out.println(campname + " is not created");
		}
		//verify expected campname
		String act_campname=campinfop.getCampaignNameAfterSave().getText();
		if(act_campname.equals(campname))
		{
			System.out.println(campname + " is present in the Campaign Name field");
		}
		else
		{
			System.out.println("Campaign name is not be present");
		}
		
		String actcampType=campinfop.getCampaignTypeAfterSave().getText();
		String actcampStatus=campinfop.getCampaignStatusAfterSave().getText();

		if(campaignType.equals(actcampType))
		{
			System.out.println("Campaign Type is populated after click on Save button");
		}
		else
		{
			System.out.println("Campaign Type is not populated after click on Save button");
		}		
		
		if(campaignStatus.equals(actcampStatus))
		{
			System.out.println("Campaign Status is populated after click on Save button");
		}
		else
		{
			System.out.println("Campaign Status is not populated after click on Save button");
		}
	}
}