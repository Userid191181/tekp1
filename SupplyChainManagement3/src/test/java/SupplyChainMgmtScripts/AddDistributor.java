package SupplyChainMgmtScripts;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import GenericUtility.ExcelUtility;
import GenericUtility.PropertiesFile;
import GenericUtility.WebDriverUtility;
import POMClasses.AddDistributorPage;
import POMClasses.HomePage;
import POMClasses.LoginPage;

public class AddDistributor {

	public static void main(String[] args) throws IOException, InterruptedException {
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
					
					hp.getAddDistributor().click();
					String Name=excellib.ToGetDataFromExcel("Distributor", 1, 0);
					String Email=excellib.ToGetDataFromExcel("Distributor", 1, 1);
					String Phone=excellib.ToGetDataFromExcel("Distributor", 1, 2);
					String Address=excellib.ToGetDataFromExcel("Distributor", 1, 3);
					
					AddDistributorPage adddis=new AddDistributorPage(driver);
					adddis.getDistname().sendKeys(Name);
					adddis.getDistnemail().sendKeys(Email);
					adddis.getDistphone().sendKeys(Phone);
					adddis.getDistaddress().sendKeys(Address);
					adddis.getDistbtn().click();
					Thread.sleep(10);
					Alert a=driver.switchTo().alert();
					a.accept();

	}

}
