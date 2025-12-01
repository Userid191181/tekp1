package com.crm.ContactTest;


import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.comcat.crm.objectrepositoryutility.ContatcsHomePage;
import com.comcat.crm.objectrepositoryutility.CreateNewContactPage;
import com.comcat.crm.objectrepositoryutility.HomePage;
import com.crm.generic.FileUtility.ExcelFileUtility;
import com.crm.generic.FileUtility.FileUtility;
import com.crm.generic.WebDriverUtility.JavaUtility;
import com.crm.generic.WebDriverUtility.WebDriverUtility;
import com.crm.generic.baseUtility.BaseClassTest;

public class CreateContactWithSupportDate extends BaseClassTest {
@Test
		public void CreateContactWithSupportDate() throws EncryptedDocumentException, IOException, InterruptedException  {
			// Creating object for all Utility	
			JavaUtility jLib=new JavaUtility();
			ExcelFileUtility eLib=new ExcelFileUtility();
			// Reading data from Properties File (common data)			
			
			// Reading data from Excel (Testcase specific data)
			String contactname=eLib.getDataFromExcel("contact", 4, 2);
			
			//Open Browser
			//login to application
			
			//Reading dates from JavaUtility
			String startdate=jLib.getSystemDateyyyymmdd();
			String enddate=jLib.getReqDateyyyymmdd(30);			
			
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
			WebElement stdt=creaConp.getActsupstrDateAfterSave();
			String stdt1=stdt.getText();

			WebElement eddt=creaConp.getActsupendDateAfterSave();
			String eddt1=eddt.getText();
			if(stdt1.equals(startdate)) {
				System.out.println("StartDate " +startdate+ " date is present ");
			}
			else {
				System.out.println("StartDate date is NOT present ");
			}
			if(eddt1.equals(enddate)) {
				System.out.println("EndDate "+ enddate + " date is present ");
			}
			else {
				System.out.println("EndDate date is NOT present ");
			}
					
	
	}}
