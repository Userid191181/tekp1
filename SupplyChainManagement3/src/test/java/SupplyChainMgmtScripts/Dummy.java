package SupplyChainMgmtScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dummy {

	public static void main(String[] args) {
		//Display the form (wwwwL) for Bengaluru bulls 
		//System.setProperty("webdriver.chrome.driver", "./SeleniumJarFiles/msedgedriver.exe");		
		//WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new ChromeDriver();
//		driver.get("https://www.amazon.in/");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//button[@alt='Continue shopping']")).click();
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
//		driver.findElement(By.id("nav-search-submit-button")).click();
//		driver.findElement(By.xpath("//span[@class='a-size-base a-color-base' and contains(text(),'Android 13.0')]")).click();

//		driver.get("https://www.prokabaddi.com/standings");
//		List<WebElement> ele=driver.findElements(By.xpath("//p[text()='Bengaluru Bulls']/ancestor::div[@class='table-row-wrap']/div/div[@class='table-data form']/ul[@class='form-listing']"));
//			
//		for(WebElement s:ele)
//		{
//			System.out.println(s.getText());
//		}
		
		//Get the Gold coins
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.olympics.com/en/athletes/neeraj-chopra");
//		driver.manage().window().maximize();
//		WebElement ee=driver.findElement(By.xpath("//h1[text()='Neeraj CHOPRA']/../../../div[@class='sc-450d2f6e-6 ghEDDP']/div[@class='sc-450d2f6e-12 kRfToA'][1]/div[@class='sc-450d2f6e-13 AjTKm']/div[@title='Gold']"));
//		System.out.println(ee.getText());
		
		//print product and use code in woohoo.in 
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.woohoo.in/brand-gift-cards");
//		driver.manage().window().maximize();
//		List<WebElement> ele=driver.findElements(By.xpath("//div[@class='products row']/div[@class='mb-2 col-6 col-sm-6 col-md-3 col-lg-3 col-xl-3']/descendant::div[@class='cardDesc']|//div[@class='products row']/div[@class='mb-2 col-6 col-sm-6 col-md-3 col-lg-3 col-xl-3']/descendant::span[@class='sitePrimaryColor']"));
//		for(WebElement e:ele)
//		{
//			System.out.println(e.getText());
//		}
//		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("samsung");
		driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='KzDlHZ']|//div[@class='KzDlHZ']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']"));
		int op=ele.size();
		System.out.println(op);		
			
		for(WebElement e:ele)
		{
			System.out.println(e.getText());
		}
		
		
	}

}
