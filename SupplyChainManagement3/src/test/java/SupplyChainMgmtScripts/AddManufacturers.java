package SupplyChainMgmtScripts;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


import GenericUtility.ExcelUtility;
import GenericUtility.PropertiesFile;
import GenericUtility.WebDriverUtility;
import POMClasses.AddManufacturerPage;
import POMClasses.AddProductPage;
import POMClasses.HomePage;
import POMClasses.LoginPage;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;

public class AddManufacturers {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException {
		System.setProperty("webdriver.edge.driver", "./SeleniumJarFiles/msedgedriver.exe");		
		// Creating the Objects for the GenericUtilities
					PropertiesFile prolib = new PropertiesFile();
					ExcelUtility excellib = new ExcelUtility();
					WebDriverUtility webdrilib = new WebDriverUtility();
					WebDriver driver = null;
					String BROWSER = prolib.ToGetDataFromPropFile("browser");					
					String URL = prolib.ToGetDataFromPropFile("url");
					String UN = prolib.ToGetDataFromPropFile("username");		
					String PASSWORD = prolib.ToGetDataFromPropFile("password");
					String LOGINTYPE = prolib.ToGetDataFromPropFile("logintype");
							
					if (BROWSER.equals("edge")) {
						driver = new EdgeDriver();
					}
					if (BROWSER.equals("chrome")) {
						driver = new ChromeDriver();
					}
					driver.manage().window().maximize();
					driver.get(URL);
					webdrilib.waitforPageToLoad(driver);
					// Logging to the Application
					LoginPage lp = new LoginPage(driver);
					HomePage hp = new HomePage(driver);
					lp.getUN().sendKeys(UN);
					lp.getPWD().sendKeys(PASSWORD);
					lp.getLOGINTYPE().sendKeys(LOGINTYPE);
					lp.getLOGINBTN().click();			
					
					hp.getAddManufacturer().click();				
					String Name = excellib.ToGetDataFromExcel("Manufacturer", 1, 0);
					String Email = excellib.ToGetDataFromExcel("Manufacturer", 1, 1);
					String Phone = excellib.ToGetDataFromExcel("Manufacturer", 1, 2);
					String Username = excellib.ToGetDataFromExcel("Manufacturer", 1, 3);			
					String Password = excellib.ToGetDataFromExcel("Manufacturer", 1, 4);
					
					AddManufacturerPage addmanu=new AddManufacturerPage(driver);
					addmanu.getManufacturername().sendKeys(Name);
					addmanu.getManufactureremail().sendKeys(Email);
					addmanu.getManufacturerphone().sendKeys(Phone);
					addmanu.getManufacturerusername().sendKeys(Username);
					addmanu.getManufactureruserpassword().sendKeys(Password);
					addmanu.getAddmanubtn().click();
					Thread.sleep(10);
					Alert a=driver.switchTo().alert();
					a.accept();
					
	}

}
