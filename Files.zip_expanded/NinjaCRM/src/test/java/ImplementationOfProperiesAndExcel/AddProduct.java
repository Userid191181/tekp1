
package ImplementationOfProperiesAndExcel;

import java.io.IOException;
import java.time.Duration;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import GenericUtility.ExcelUtility;
import GenericUtility.PropertiesFile;
import GenericUtility.WebDriverUtility;
import POMClasses.CreateProductPage;
import POMClasses.HomePage;
import POMClasses.LoginPage;
import GenericUtility.JavaUtility;

public class AddProduct {

	// private static final WebDriver WebDriverwait = null;

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.edge.driver", "./sw/msedgedriver.exe");	
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
		String Product = excellib.TogetDataFromExcelFile("Products", 1, 1);
		String Category = excellib.TogetDataFromExcelFile("Products", 1, 2);
		String Quantity = excellib.TogetDataFromExcelFile("Products", 1, 3);
		String PricePerUnit = excellib.TogetDataFromExcelFile("Products", 1, 4);
		String SelectVendor = excellib.TogetDataFromExcelFile("Products", 1, 5);
		HomePage hp = new HomePage(driver);
		hp.getProducts().click();
		// CreateProduct
		CreateProductPage crepro = new CreateProductPage(driver);
		crepro.getAddproduct().click();
		WebElement g = crepro.getProductname();
		int ran = jlib.getRandomNum();
		g.sendKeys(Product + ran);
		WebElement ele = crepro.getProductCategory();
		webdrilib.selectValue(ele, Category);
		crepro.getQuantity().clear();
		crepro.getQuantity().sendKeys(Quantity);
		crepro.getPrice().clear();
		crepro.getPrice().sendKeys(PricePerUnit);
		WebElement ele1 = crepro.getVendorId();
		webdrilib.selectVisibleText(ele1, SelectVendor);
		crepro.getAddproductbtn().click();
		WebElement toast = hp.getToastmsg();
		webdrilib.WaitForElementToBeClicked(driver, toast);
		String a = toast.getText();
		if (a.contains("Product" + ran)) {
			System.out.println("Product is created successfully");
		} else {
			System.out.println("Product is not created");
		}
		WebElement move = hp.getUsericon();
		webdrilib.MouseHoverOneWebElement(driver, move);
		hp.getLogout().click();
		driver.close();
	}
}