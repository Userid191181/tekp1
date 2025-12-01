package com.crm.CampaignTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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

public class CreateCampaignTest extends BaseClassTest {	
@Test(groups="Smoke")
	public void CreateCampaign() throws IOException, EncryptedDocumentException, IOException {
		ExcelFileUtility eLib=new ExcelFileUtility();
		JavaUtility jLib = new JavaUtility();
		// Reading data from Excel sheet by creating an object.
		String campname = eLib.getDataFromExcel("campaign", 1, 2) + jLib.getRandomNum();
		// Navigate to Campaign link
		HomePage hp = new HomePage(driver);
		hp.getMoreLink().click();
		hp.getCampaignsLink().click();

		CampaignHomePage cp = new CampaignHomePage(driver);
		cp.getCampaignBtn().click();

		CreateCampaignPage crecamp = new CreateCampaignPage(driver);

		// Adding Campaign Name, Type and Campaign Status.
		crecamp.getCampaignEdit().sendKeys(campname);
		crecamp.getSaveBtn().click();

		// verify expected msg results in the Header
		CampaignInfoPage campinfop = new CampaignInfoPage(driver);

		String headerInfo = campinfop.getCampaignHeaderInfo().getText();
		boolean status=headerInfo.contains(campname);
		Assert.assertEquals(status, true);

		// verify expected campname after save
		String act_campname = campinfop.getCampaignNameAfterSave().getText();
		//HardAssert as i am verifying mandatory campaign name
		Assert.assertEquals(act_campname, campname);
	}

@Test(groups="Regression")
public void CampaignWithTypeAndStatus() throws IOException, InterruptedException {
	// Creating object for all Utility
	ExcelFileUtility eLib = new ExcelFileUtility();
	WebDriverUtility wLib = new WebDriverUtility();
	
	// Reading data from ExcelUtility (Testcase specific data)
	String campname=eLib.getDataFromExcel("campaign", 1, 2);
	String campaignType=eLib.getDataFromExcel("campaign", 1, 3);
	String campaignStatus=eLib.getDataFromExcel("campaign", 1, 4);

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
	boolean status = headerInfo.contains(campname);
	Assert.assertEquals(status, true);
	
	//verify expected campname
	String act_campname=campinfop.getCampaignNameAfterSave().getText();
	Assert.assertEquals(act_campname, campname);	
	
	String actcampType=campinfop.getCampaignTypeAfterSave().getText();
	String actcampStatus=campinfop.getCampaignStatusAfterSave().getText();
	Assert.assertEquals(actcampType, actcampType);
	
//	if(campaignType.equals(actcampType))
//	{
//		System.out.println("Campaign Type is populated after click on Save button");
//	}
//	else
//	{
//		System.out.println("Campaign Type is not populated after click on Save button");
//	}		
	Assert.assertEquals(campaignStatus, actcampStatus);
//	if(campaignStatus.equals(actcampStatus))
//	{
//		System.out.println("Campaign Status is populated after click on Save button");
//	}
//	else
//	{
//		System.out.println("Campaign Status is not populated after click on Save button");
//	}
}

@Test(groups="Regression")

public void CreateCampaignWithExpectedCloseDate() throws EncryptedDocumentException, IOException
{
	ExcelFileUtility eLib=new ExcelFileUtility();
	String endDate = jLib.getReqDateyyyymmdd(30);

	// Reading data from Excel (Testcase specific data)
	String campname = eLib.getDataFromExcel("campaign", 1, 2) + jLib.getRandomNum();

	// Navigate to Campaign link
	HomePage hp = new HomePage(driver);
	hp.getMoreLink().click();
	hp.getCampaignsLink().click();

	CampaignHomePage cp = new CampaignHomePage(driver);
	cp.getCampaignBtn().click();
	CreateCampaignPage crecamp = new CreateCampaignPage(driver);

	// Adding Campaign Name, Type and Campaign Status.
	crecamp.getCampaignEdit().sendKeys(campname);
	crecamp.getExpClosedate().clear();
	crecamp.getExpClosedate().sendKeys(endDate);
	crecamp.getSaveBtn().click();

	// verify expected msg results in the Header
	CampaignInfoPage campinfop = new CampaignInfoPage(driver);

	String act_campname = campinfop.getCampaignNameAfterSave().getText();

	SoftAssert asse=new SoftAssert();
	asse.assertEquals(act_campname, campname);
	asse.assertAll();
}
}