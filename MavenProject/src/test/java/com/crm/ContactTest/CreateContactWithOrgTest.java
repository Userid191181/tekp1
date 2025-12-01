package com.crm.ContactTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.comcat.crm.objectrepositoryutility.ContatcsHomePage;
import com.comcat.crm.objectrepositoryutility.ContatctInfoPage;
import com.comcat.crm.objectrepositoryutility.CreateNewContactPage;
import com.comcat.crm.objectrepositoryutility.CreateNewOrganizationPage;
import com.comcat.crm.objectrepositoryutility.HomePage;
import com.comcat.crm.objectrepositoryutility.LoginPage;
import com.comcat.crm.objectrepositoryutility.OrganizationHomePage;
import com.comcat.crm.objectrepositoryutility.OrganizationInfoPage;
import com.comcat.crm.objectrepositoryutility.OrganizationTabPageInContact;
import com.crm.generic.FileUtility.ExcelFileUtility;
import com.crm.generic.FileUtility.FileUtility;
import com.crm.generic.WebDriverUtility.JavaUtility;
import com.crm.generic.WebDriverUtility.WebDriverUtility;
import com.crm.generic.baseUtility.BaseClassTest;

public class CreateContactWithOrgTest extends BaseClassTest {
@Test
	public void CreateConatcWithOrg() throws EncryptedDocumentException, IOException, InterruptedException  {
		// Creating object for all Utility
		ExcelFileUtility eLib = new ExcelFileUtility();
		JavaUtility jLib = new JavaUtility();
		String orgname = eLib.getDataFromExcel("contact", 7, 2) + jLib.getRandomNum();
		String conlastname = eLib.getDataFromExcel("contact", 7, 3);
		System.out.println(orgname);

		HomePage hp=new HomePage(driver);
		hp.getOrganizationsLink().click();

		// navigate to Organization module
		OrganizationHomePage orgp = new OrganizationHomePage(driver);
		orgp.getCreateOrganizationBtn().click();

		CreateNewOrganizationPage creaorgp = new CreateNewOrganizationPage(driver);
		creaorgp.getOrgnameedit().sendKeys(orgname); //line 37
		creaorgp.getSaveBtn().click();

		// verify expected msg results in the Header
		OrganizationInfoPage orginfop = new OrganizationInfoPage(driver);
		String headerInfo = orginfop.getOrgheaderinfo().getText();
		if (headerInfo.contains(orgname)) {
			System.out.println(orgname + "is created==PASS");
		} else {
			System.out.println(orgname + " is not created");
		}

		// verify expected orgname
		String act_orgname = orginfop.getActOrgAfterSave().getText();

		if (act_orgname.equals(orgname)) {
			System.out.println(orgname + " is present in the Organisation Name field");
		} else {
			System.out.println("Organisation name is NOT be present");
		}

		// Navigate to contact module:
		// click on contact link
		hp.getContactsLink().click();
		ContatcsHomePage conhomep = new ContatcsHomePage(driver);
		conhomep.getCreateContactBtn().click();

		CreateNewContactPage creaconp = new  CreateNewContactPage(driver);
		creaconp.getLastNameEdit().sendKeys(conlastname);
		creaconp.getOrgnameSelectBtn().click();

		// Switching from parent window to child window from generic utility
		wLib.switchToTabOnUrl(driver, "module=Accounts");

		OrganizationTabPageInContact orgtabpagecontact = new OrganizationTabPageInContact(driver);
		orgtabpagecontact.getOrgsearchtxtBox().sendKeys(orgname);
		orgtabpagecontact.getSerchBtn().click();
		Thread.sleep(1000);
		String Contactorgname = driver.findElement(By.partialLinkText(orgname)).getText();
		Thread.sleep(1000);
		if (orgname.equals(Contactorgname)) {
			System.out.println("Organisation name " + orgname + " is displayed in the Organisation List");
			
		} else {
			System.out.println("Organisation name is not displayed in the Organisation List");
		}
		Thread.sleep(3000);
		orgtabpagecontact.getOrgNameTab().click();
		
		// Switching from child to parent window
		wLib.switchToTabOnUrl(driver, "Contacts&action");
		Thread.sleep(500);
		creaconp.getSaveBtn().click();

		ContatctInfoPage contInfop = new ContatctInfoPage(driver);

		// Verify Contact name present in header info.
		String connum1 = contInfop.getLastNameAfterSave().getText();
		String conheaderinfo = contInfop.getHeaderContactname().getText();
		if (conheaderinfo.contains(connum1)) {
			System.out.println("Conatct name " + connum1 + " is present in the Header Info");
		}

		// verify the Contact name in the Last Name field
		if (conlastname.equals(connum1)) {
			System.out.println(connum1 + " is present in the Contact Last Name filed");
		} else {
			System.out.println("Contact Last Name is not be present");
		}

		// Verify Organization name in Contact link page after loading the Organization
		Thread.sleep(2000);
		String Contactorgname1 = contInfop.getActOrgnameAfterSave().getText().trim();
		System.out.println(Contactorgname1);
		System.out.println(orgname);
		Thread.sleep(1000);
		if (orgname.equals(Contactorgname1)) {
			System.out.println("Organisation name " + orgname + " is displayed in the Contact Link page");
		} else {
			System.out.println("Organisation name is NOT displayed in the Contact Link page");
		}

	}}
