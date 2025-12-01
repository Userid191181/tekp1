package com.crm.OrgTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
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
import org.testng.annotations.Test;

import com.comcat.crm.objectrepositoryutility.CreateNewOrganizationPage;
import com.comcat.crm.objectrepositoryutility.HomePage;
import com.comcat.crm.objectrepositoryutility.LoginPage;
import com.comcat.crm.objectrepositoryutility.OrganizationHomePage;
import com.comcat.crm.objectrepositoryutility.OrganizationInfoPage;
import com.crm.generic.FileUtility.ExcelFileUtility;
import com.crm.generic.FileUtility.FileUtility;
import com.crm.generic.WebDriverUtility.JavaUtility;
import com.crm.generic.WebDriverUtility.WebDriverUtility;
import com.crm.generic.baseUtility.BaseClassTest;

public class CreateOrgTest extends BaseClassTest {
@Test
	public void CreateOrgTest() throws EncryptedDocumentException, IOException {

		String orgname=eLib.getDataFromExcel("org", 1, 2) + jLib.getRandomNum();		

		//navigate to Home Page
		HomePage hp=new HomePage(driver);		
		//Click on Organization Link in HomePage
		hp.getOrganizationsLink().click();
		
		OrganizationHomePage op=new OrganizationHomePage(driver);
		//click on Organization Link
		op.getCreateOrganizationBtn().click();
		
		CreateNewOrganizationPage orgp=new CreateNewOrganizationPage(driver);
		orgp.getOrgnameedit().sendKeys(orgname);
		orgp.getSaveBtn().click();

		//verify expected msg results in the Header
		OrganizationInfoPage orinfop=new OrganizationInfoPage(driver);	
		String orgheaderinfo=orinfop.getOrgheaderinfo().getText();		
		if(orgheaderinfo.contains(orgname))
		{
			System.out.println(orgname + "is created==PASS");
		}
		else
		{
			System.out.println(orgname + " is not created");
		}		
		//verify expected orgname
		String act_orgname=orinfop.getActOrgAfterSave().getText();
		
		if(act_orgname.equals(orgname))
		{
			System.out.println(orgname + " is present in the Organisation Name filled");
		}
		else
		{
			System.out.println("Organisation name is not be present");
		}	
	}

@Test
public void CreateOrgWithIndustriesTest() throws EncryptedDocumentException, IOException, InterruptedException
{

			// Reading data from Excel (Testcase specific data)
			String orgname = eLib.getDataFromExcel("org", 4, 2) + jLib.getRandomNum();
			String Industry = eLib.getDataFromExcel("org", 4, 3);
			String Type = eLib.getDataFromExcel("org", 4, 4);

			// navigate to Organization module
			HomePage hp = new HomePage(driver);
			hp.getOrganizationsLink().click();

			// naviagte to Organization Home Page
			OrganizationHomePage op = new OrganizationHomePage(driver);
			op.getCreateOrganizationBtn().click();

			CreateNewOrganizationPage orgp = new CreateNewOrganizationPage(driver);
			orgp.getOrgnameedit().sendKeys(orgname);

			// Selecting Industry and Type dropdown using Select class in WebDriverUtility
			WebElement ind = orgp.getOrgIndustry();
			WebElement type = orgp.getOrgType();
			wLib.select(ind, Industry);
			wLib.select(type, Type);
			orgp.getSaveBtn().click();

			// verify the Industry and Type
			OrganizationInfoPage orinfop = new OrganizationInfoPage(driver);
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
}

@Test
public void CreateOrgWithPhoneNumber() throws EncryptedDocumentException, IOException
{
	JavaUtility jLib = new JavaUtility();
	ExcelFileUtility eLib = new ExcelFileUtility();

	// Reading data from Excel (Testcase specific data)
	String orgname = eLib.getDataFromExcel("org", 7, 2) + jLib.getRandomNum();
	String PhoneNum = eLib.getDataFromExcel("org", 7, 3);

	// navigate to Organization module
	HomePage hp = new HomePage(driver);
	hp.getOrganizationsLink().click();
	
	// naviagte to Organization Home Page
	OrganizationHomePage op = new OrganizationHomePage(driver);
	op.getCreateOrganizationBtn().click();
	
	// navigate to Organization module
	CreateNewOrganizationPage orgp = new CreateNewOrganizationPage(driver);
	orgp.getOrgnameedit().sendKeys(orgname);
	orgp.getOrgPhone().sendKeys(PhoneNum);
	orgp.getSaveBtn().click();

	// verify the Phone number
	OrganizationInfoPage orinfop = new OrganizationInfoPage(driver);
	String actph1 = orinfop.getActPhoneAfterSave().getText();

	if (PhoneNum.equals(actph1)) {
		System.out.println(actph1 + " is present in the Industry field");
	} else {
		System.out.println("Phone number may not be present");
	}	
}
}