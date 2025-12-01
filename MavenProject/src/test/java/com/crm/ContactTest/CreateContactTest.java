package com.crm.ContactTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcat.crm.objectrepositoryutility.ContatcsHomePage;
import com.comcat.crm.objectrepositoryutility.ContatctInfoPage;
import com.comcat.crm.objectrepositoryutility.CreateNewContactPage;
import com.comcat.crm.objectrepositoryutility.CreateNewOrganizationPage;
import com.comcat.crm.objectrepositoryutility.HomePage;
import com.comcat.crm.objectrepositoryutility.OrganizationHomePage;
import com.comcat.crm.objectrepositoryutility.OrganizationInfoPage;
import com.comcat.crm.objectrepositoryutility.OrganizationTabPageInContact;
import com.crm.generic.FileUtility.ExcelFileUtility;
import com.crm.generic.WebDriverUtility.JavaUtility;
import com.crm.generic.WebDriverUtility.UtilityClassObject;
import com.crm.generic.baseUtility.BaseClassTest;

public class CreateContactTest extends BaseClassTest {
	@Test(groups = "Smoke")
	public void CreateContactTest() throws EncryptedDocumentException, IOException {

		ExcelFileUtility eLib = new ExcelFileUtility();
		String contactLastname = eLib.getDataFromExcel("contact", 1, 2);
		HomePage hp = new HomePage(driver);
		ContatcsHomePage conhomep = new ContatcsHomePage(driver);
		CreateNewContactPage creaConp = new CreateNewContactPage(driver);
		ContatctInfoPage coninfop = new ContatctInfoPage(driver);
		// Open Browser, login to app coming from BaseClassTest

		hp.getContactsLink().click();
		// navigate to Contact module
		UtilityClassObject.getTest().log(Status.INFO, "Navigate to Contact Page");
		conhomep.getCreateContactBtn().click();
		UtilityClassObject.getTest().log(Status.INFO, "Navigate to Contact create contact page");
		creaConp.getLastNameEdit().sendKeys(contactLastname);
		creaConp.getSaveBtn().click();

		// verify the Contact number
		UtilityClassObject.getTest().log(Status.INFO, "Navigate to Contact info");
		String headerContactName = coninfop.getHeaderContactname().getText();
		boolean status = headerContactName.contains(contactLastname);
		Assert.assertEquals(status, true);

		String connumField = coninfop.getLastNameAfterSave().getText();
		Assert.assertEquals(connumField, connumField);
		UtilityClassObject.getTest().log(Status.INFO, "Navigate to Contact Page");
	}

	@Test(groups = "Regression")
	public void CreateContactWithSupportDateTest() throws EncryptedDocumentException, IOException {
		JavaUtility jLib = new JavaUtility();
		ExcelFileUtility eLib = new ExcelFileUtility();
		// Reading data from Properties File (common data)

		// Reading data from Excel (Testcase specific data)
		String contactname = eLib.getDataFromExcel("contact", 4, 2);

		// Reading dates from JavaUtility
		String startdate = jLib.getSystemDateyyyymmdd();
		String enddate = jLib.getReqDateyyyymmdd(30);

		HomePage hp = new HomePage(driver);
		hp.getContactsLink().click();
		// navigate to Contact module

		ContatcsHomePage conhomep = new ContatcsHomePage(driver);
		conhomep.getCreateContactBtn().click();
		CreateNewContactPage creaConp = new CreateNewContactPage(driver);
		creaConp.getLastNameEdit().sendKeys(contactname);
		creaConp.getSupstrDate().clear();
		creaConp.getSupstrDate().sendKeys(startdate);
		creaConp.getSupendDate().clear();
		creaConp.getSupendDate().sendKeys(enddate);
		creaConp.getSaveBtn().click();
		WebElement stdt = creaConp.getActsupstrDateAfterSave();
		String stdt1 = stdt.getText();

		WebElement eddt = creaConp.getActsupendDateAfterSave();
		String eddt1 = eddt.getText();
		Assert.assertEquals(stdt1, startdate);

		Assert.assertEquals(eddt1, enddate);
	}

	@Test(groups = "Regression")
	public void CreateContactWithOrgTest() throws InterruptedException, EncryptedDocumentException, IOException {
		// Creating object for all Utility
		ExcelFileUtility eLib = new ExcelFileUtility();
		JavaUtility jLib = new JavaUtility();
		String orgname = eLib.getDataFromExcel("contact", 7, 2) + jLib.getRandomNum();
		String conlastname = eLib.getDataFromExcel("contact", 7, 3);
		System.out.println(orgname);

		HomePage hp = new HomePage(driver);
		hp.getOrganizationsLink().click();

		// navigate to Organization module
		OrganizationHomePage orgp = new OrganizationHomePage(driver);
		orgp.getCreateOrganizationBtn().click();

		CreateNewOrganizationPage creaorgp = new CreateNewOrganizationPage(driver);
		creaorgp.getOrgnameedit().sendKeys(orgname); // line 37
		creaorgp.getSaveBtn().click();

		// verify expected msg results in the Header
		OrganizationInfoPage orginfop = new OrganizationInfoPage(driver);
		String headerInfo = orginfop.getOrgheaderinfo().getText();
		boolean status = headerInfo.contains(orgname);

		Assert.assertEquals(status, true);

		// verify expected orgname
		String act_orgname = orginfop.getActOrgAfterSave().getText();
		Assert.assertEquals(act_orgname, orgname);

		// Navigate to contact module:
		// click on contact link
		hp.getContactsLink().click();
		ContatcsHomePage conhomep = new ContatcsHomePage(driver);
		conhomep.getCreateContactBtn().click();

		CreateNewContactPage creaconp = new CreateNewContactPage(driver);
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
		Assert.assertEquals(orgname, Contactorgname);

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
		boolean status1 = conheaderinfo.contains(connum1);

		Assert.assertEquals(status1, true);

		// verify the Contact name in the Last Name field
		Assert.assertEquals(conlastname, connum1);

		// Verify Organization name in Contact link page after loading the Organization
		Thread.sleep(2000);
		String Contactorgname1 = contInfop.getActOrgnameAfterSave().getText().trim();
		Thread.sleep(1000);
		Assert.assertEquals(orgname, Contactorgname1);

	}
}