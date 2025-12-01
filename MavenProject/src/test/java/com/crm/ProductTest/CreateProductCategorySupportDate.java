package com.crm.ProductTest;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.generic.FileUtility.ExcelFileUtility;
import com.crm.generic.FileUtility.FileUtility;
import com.crm.generic.WebDriverUtility.JavaUtility;
import com.crm.generic.WebDriverUtility.WebDriverUtility;

public class CreateProductCategorySupportDate {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException {
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
		String productname = eLib.getDataFromExcel("products", 1, 2)+jLib.getRandomNum();
		String productcategory = eLib.getDataFromExcel("products", 1, 3);

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
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		// navigate to Product module
		driver.findElement(By.xpath("//a[@href='index.php?module=Products&action=index' and text()='Products']"))
				.click();
		driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
		driver.findElement(By.name("productname")).sendKeys(productname);
		WebElement ele = driver.findElement(By.name("productcategory"));
		
		wLib.select(ele, productcategory);
		
		String startdate = jLib.getSystemDateyyyymmdd();
		
		String enddate=jLib.getReqDateyyyymmdd(30);
		//Select sel1 = new Select(ele);
		//sel1.selectByVisibleText(productcategory);

		driver.findElement(By.name("start_date")).clear();
		driver.findElement(By.name("start_date")).sendKeys(startdate);

		driver.findElement(By.name("expiry_date")).clear();
		driver.findElement(By.name("expiry_date")).sendKeys(enddate);

		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();

		WebElement stdt = driver.findElement(By.id("dtlview_Support Start Date"));
		String stdt1 = stdt.getText();

		WebElement eddt = driver.findElement(By.id("dtlview_Support Expiry Date"));
		String eddt1 = eddt.getText();

		// verify expected msg results in the Header
		String headerInfo = driver.findElement(By.xpath("//span[@class='lvtHeaderText']")).getText();
		if (headerInfo.contains(productname)) {
			System.out.println(productname + "is created==PASS");
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

		if (productcategory.equals(actproductType)) {
			System.out.println("Product Category is populated after click on Save button");
		} else {
			System.out.println("Product Category is not populated after click on Save button");
		}

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
		driver.quit();

	}

}
