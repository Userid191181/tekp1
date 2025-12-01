package PractiseTestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.generic.WebDriverUtility.WebDriverUtility;

public class AmazonGetProdInfoUsingDataProvider {
@Test(dataProvider = "getData")
public void getProdinfotest(String brandname, String prodname) //using dataProvider
{
	WebDriverUtility wLib=new WebDriverUtility();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	wLib.waitforPageToLoad(driver);
	driver.manage().window().maximize();
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(brandname,Keys.ENTER);
	String price=driver.findElement(By.xpath("//span[text()='"+prodname+"']/../../../../div[@class='puisg-row puis-desktop-list-row']//div[@class='a-row a-size-base a-color-base']//a//span[@class='a-price-whole']")).getText();
	//Dynamic xpath play major role in Ecommerce application, without dynamic xpath we cannot automate these kind of scenarios
	//prodname and brandname we will get from dataProvider with multiple set of data to be executed. 
	System.out.println(price);	
	driver.quit();
}

@DataProvider
public Object[][] getData()
{
	Object[][] objarr = new Object[3][2];
	objarr[0][0]="iphone";
	objarr[0][1]="Apple iPhone 15 (128 GB) - Pink";
	
	objarr[1][0]="iphone";
	objarr[1][1]="Apple iPhone 15 (128 GB) - Green";
	
	objarr[2][0]="iphone";
	objarr[2][1]="Apple iPhone 15 (128 GB) - Blue";
	return objarr;
}	
}