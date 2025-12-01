package SupplyChainMgmtScripts;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import GenericUtility.ExcelUtility;
import GenericUtility.PropertiesFile;
import GenericUtility.WebDriverUtility;
import POMClasses.AddRetailerPage;
import POMClasses.HomePage;
import POMClasses.LoginPage;

public class AddRetailer {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.edge.driver", "./SeleniumJarFiles/msedgedriver.exe");	
		PropertiesFile prolib=new PropertiesFile();
		ExcelUtility excellib=new ExcelUtility();
		WebDriverUtility weblib=new WebDriverUtility();
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
		weblib.waitforPageToLoad(driver);
		// Logging to the Application
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		lp.getUN().sendKeys(UN);
		lp.getPWD().sendKeys(PASSWORD);
		lp.getLOGINTYPE().sendKeys(LOGINTYPE);
		lp.getLOGINBTN().click();
		
		hp.getAddRetailers().click();
		String Name=excellib.ToGetDataFromExcel("Retailer", 1, 0);
		String Password=excellib.ToGetDataFromExcel("Retailer", 1, 1);
		String Areacode=excellib.ToGetDataFromExcel("Retailer", 1, 2);
		String Phone=excellib.ToGetDataFromExcel("Retailer", 1, 3);
		String Email=excellib.ToGetDataFromExcel("Retailer", 1, 4);
		String Address=excellib.ToGetDataFromExcel("Retailer", 1, 5);

		
		AddRetailerPage addret=new AddRetailerPage(driver);
		addret.getUsername().sendKeys(Name);
		addret.getPassword().sendKeys(Password);
		addret.getPhone().sendKeys(Phone);
		addret.getEmail().sendKeys(Email);
		addret.getAddress().sendKeys(Address);
		addret.getAreacode().sendKeys(Areacode);
		addret.getAddRetBtn().click();
		Thread.sleep(10);
		Alert a=driver.switchTo().alert();
		a.accept();

	}
}