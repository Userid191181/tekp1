package SupplyChainMgmtScripts;

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
import POMClasses.AddProductPage;
import POMClasses.HomePage;
import POMClasses.LoginPage;
import org.openqa.selenium.Alert;


public class AddProducts {
public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.edge.driver", "./SeleniumJarFiles/msedgedriver.exe");		

			// Creating the Objects for the GenericUtilities
			PropertiesFile prolib = new PropertiesFile();
			ExcelUtility excellib = new ExcelUtility();
			WebDriverUtility webdrilib = new WebDriverUtility();
			
			String BROWSER = prolib.ToGetDataFromPropFile("browser");					
			String URL = prolib.ToGetDataFromPropFile("url");
			String UN = prolib.ToGetDataFromPropFile("username");		
			String PASSWORD = prolib.ToGetDataFromPropFile("password");
			String LOGINTYPE = prolib.ToGetDataFromPropFile("logintype");
					
			WebDriver driver = null;
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
		
			String Product = excellib.ToGetDataFromExcel("Product", 1, 0);
			String Price = excellib.ToGetDataFromExcel("Product", 1, 1);
			String UnitType = excellib.ToGetDataFromExcel("Product", 1, 2);
			String Category = excellib.ToGetDataFromExcel("Product", 1, 3);			
			String ProDescription = excellib.ToGetDataFromExcel("Product", 1, 5);
			hp.getAddProducts().click();
			// AddProduct
			AddProductPage addpro=new AddProductPage(driver);
			addpro.getProductname().sendKeys(Product);
			addpro.getProductprice().sendKeys(Price);
			addpro.getProductunit().sendKeys(UnitType);
			addpro.getProductcategory().sendKeys(Category);
			addpro.getStkmgmtenable().click();
			addpro.getProdescription().sendKeys(ProDescription);
			addpro.getAddProbtn().click();	
			Thread.sleep(10);
			Alert a=driver.switchTo().alert();
			a.accept();

}
}
