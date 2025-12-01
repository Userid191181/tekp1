package ImplementationOfProperiesAndExcel;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import GenericUtility.ExcelUtility;
import GenericUtility.JavaUtility;
import GenericUtility.PropertiesFile;
import GenericUtility.WebDriverUtility;
import POMClasses.CreateCampaignPage;
import POMClasses.HomePage;
import POMClasses.LoginPage;

public class AddCloseDate {

	public static void main(String[] args) throws InterruptedException, IOException {

		// Reading data from Properites file
		// Creating the Objects for the GenericUtilities
		PropertiesFile prolib = new PropertiesFile();
		ExcelUtility excellib = new ExcelUtility();
		WebDriverUtility webdrilib = new WebDriverUtility();
		JavaUtility jlib = new JavaUtility();
		// Reading data from Properites file
		String bro = prolib.TogetDataFromPropFile("browser");
		String url = prolib.TogetDataFromPropFile("url");
		String un = prolib.TogetDataFromPropFile("username");
		String pwd = prolib.TogetDataFromPropFile("password");
		WebDriver driver = null;
		if (bro.equals("edge")) {
			driver = new EdgeDriver();
		}
		if (bro.equals("chrome")) {
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		webdrilib.WaitForPageToLoad(driver);

		// login
		LoginPage lp = new LoginPage(driver);
		lp.getUN().sendKeys(un);
		lp.getPWD().sendKeys(pwd);
		lp.getLOGINBTN().click();
		// reading data from excel
		String CampaignValue = excellib.TogetDataFromExcelFile("Campaign", 1, 2);
		String TargetSize = excellib.TogetDataFromExcelFile("Campaign", 1, 3);
		// HomePage to click on CreateCampaign btn
		HomePage hp = new HomePage(driver);
		hp.getCretecampaign().click();
		// enter data in createcampaign page
		CreateCampaignPage cmp = new CreateCampaignPage(driver);
		cmp.getCampaignname().sendKeys(CampaignValue);
		cmp.getTargetsize().clear();
		cmp.getTargetsize().sendKeys(TargetSize);
		String ReqDate = jlib.getRequiredFutureDate(30);
		cmp.getExpectedCloseDate().sendKeys(ReqDate);
		cmp.getCreateCampaignbtn().click();
		WebElement toast = hp.getToastmsg();
		webdrilib.WaitForElementToBeClicked(driver, toast);
		String a = toast.getText();
		if (a.contains(CampaignValue)) {
			System.out.println("Campaing is created successfully with the Expected Close Date");
		} else {
			System.out.println("Campaing is not created");
		}
		WebElement move = hp.getUsericon();
		webdrilib.MouseHoverOneWebElement(driver, move);
		hp.getLogout().click();
		driver.close();
	}
}