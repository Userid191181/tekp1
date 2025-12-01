package com.crm.ProductTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
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
import org.testng.annotations.Test;

import com.comcat.crm.objectrepositoryutility.CreateProductPage;
import com.comcat.crm.objectrepositoryutility.HomePage;
import com.comcat.crm.objectrepositoryutility.LoginPage;
import com.comcat.crm.objectrepositoryutility.ProductHomePage;
import com.comcat.crm.objectrepositoryutility.ProductInfoPage;
import com.crm.generic.FileUtility.ExcelFileUtility;
import com.crm.generic.FileUtility.FileUtility;
import com.crm.generic.WebDriverUtility.JavaUtility;
import com.crm.generic.WebDriverUtility.WebDriverUtility;
import com.crm.generic.baseUtility.BaseClassTest;

public class CreateProduct extends BaseClassTest {
	@Test
	public void CreateProduct() throws EncryptedDocumentException, IOException {
		ExcelFileUtility eLib = new ExcelFileUtility();

		// Reading data from Excel (Testcase specific data)
		String productname = eLib.getDataFromExcel("products", 1, 2) + jLib.getRandomNum();

		HomePage hp = new HomePage(driver);
		hp.getProductsLink().click();

		// navigate to Product module
		ProductHomePage prodhomep = new ProductHomePage(driver);
		prodhomep.getCreateProductbtn().click();

		CreateProductPage creaprop = new CreateProductPage(driver);
		creaprop.getProductnamedit().sendKeys(productname);
		creaprop.getSaveBtn().click();

		// verify expected msg results in the Header
		ProductInfoPage proinfop = new ProductInfoPage(driver);
		String headerInfo = proinfop.getHeaderProductname().getText();

		if (headerInfo.contains(productname)) {
			System.out.println(productname + " is created==PASS");
		} else {
			System.out.println(productname + " is not created");
		}
		// verify expected orgname
		String act_productname = proinfop.getActProductAfterSave().getText();

		if (act_productname.equals(productname)) {
			System.out.println(productname + " is present in the Product Name field");
		} else {
			System.out.println("product name is not be present");
		}
	}

	@Test
	public void CreateProductCategoryAttachFile() throws EncryptedDocumentException, IOException, InterruptedException {
		// Reading data from Properties File (common data)
		ExcelFileUtility eLib = new ExcelFileUtility();

		// Reading data from Excel (Testcase specific data)
		String productname = eLib.getDataFromExcel("products", 1, 2) + jLib.getRandomNum();
		String productcategory1 = eLib.getDataFromExcel("products", 1, 3);

		HomePage hp = new HomePage(driver);
		hp.getProductsLink().click();
		
		// navigate to Product module
		ProductHomePage prodhomep = new ProductHomePage(driver);
		prodhomep.getCreateProductbtn().click();
		
		CreateProductPage creaprop = new CreateProductPage(driver);
		creaprop.getProductnamedit().sendKeys(productname);

		WebElement ele1=creaprop.getProductCategory();
		wLib.select(ele1, productcategory1);

		WebElement attachfile = driver.findElement(By.id("my_file_element"));
		attachfile.sendKeys("D:\\OLDDATA\\BackUPCDrive\\SELENIUM\\TEKPyramid\\abc.jpg");

		creaprop.getSaveBtn().click();

		// verify expected msg results in the Header
		ProductInfoPage proinfop = new ProductInfoPage(driver);
		
		String headerInfo = proinfop.getActProductAfterSave().getText();
		if (headerInfo.contains(productname)) {
			System.out.println(productname + " is created==PASS");
		} else {
			System.out.println(productname + " is not created");
		}

		// verify expected productname
		String act_productname = driver.findElement(By.xpath("//span[@id='dtlview_Product Name']")).getText();
		WebElement productnamefield = driver.findElement(By.id("mouseArea_Product Name"));

		if (act_productname.equals(productname)) {
			System.out.println(productname + " is present in the Product Name field");
		} else {
			System.out.println("product name is not be present");
		}

		String actproductType = driver.findElement(By.xpath("//span[@id='dtlview_Product Category']")).getText();
		System.out.println(actproductType);

		if (productcategory1.equals(actproductType)) {
			System.out.println("Product Category is populated after click on Save button");
		} else {
			System.out.println("Product Category is not populated after click on Save button");
		}
	}
	
@Test
public void CreateProductCategorySupportDate() throws EncryptedDocumentException, IOException, InterruptedException
{
	// Reading data from Properties File (common data)
	ExcelFileUtility eLib = new ExcelFileUtility();

	// Reading data from Excel (Testcase specific data)
	String productname = eLib.getDataFromExcel("products", 1, 2) + jLib.getRandomNum();
	String productcategory1 = eLib.getDataFromExcel("products", 1, 3);

	HomePage hp = new HomePage(driver);
	hp.getProductsLink().click();
	
	// navigate to Product module
	ProductHomePage prodhomep = new ProductHomePage(driver);
	prodhomep.getCreateProductbtn().click();
	
	CreateProductPage creaprop = new CreateProductPage(driver);
	creaprop.getProductnamedit().sendKeys(productname);

	WebElement ele1=creaprop.getProductCategory();
	wLib.select(ele1, productcategory1);
	
	String startdate = jLib.getSystemDateyyyymmdd();	
	String enddate = jLib.getReqDateyyyymmdd(30);
	
	creaprop.entersuppStartAndEndDate(startdate, enddate);
	creaprop.getSaveBtn().click();

	// verify expected productname
	ProductInfoPage proinfop = new ProductInfoPage(driver);
	String act_productname = proinfop.getActProductAfterSave().getText();
	if (act_productname.equals(productname)) {
		System.out.println(productname + " is present in the Product Name field");
	} else {
		System.out.println("product name is not be present");
	}

	String actproductType = driver.findElement(By.xpath("//span[@id='dtlview_Product Category']")).getText();
	if (productcategory1.equals(actproductType)) {
		System.out.println(productcategory1 + " is populated after click on Save button");
	} else {
		System.out.println("Product Category is not populated after click on Save button");
	}

	String stdt1 = creaprop.getActSupportStrDateAfterSave().getText();
	String eddt1 = creaprop.getActSupportExpDateAfterSave().getText();
	
	if (stdt1.equals(startdate)) {
		System.out.println("StartDate " + startdate + " date is present ");
	} else {
		System.out.println("StartDate date is NOT present ");
	}
	if (eddt1.equals(enddate)) {
		System.out.println("EndDate " + enddate + " date is present ");
	} else {
		System.out.println("EndDate date is NOT present ");
	}

}

}