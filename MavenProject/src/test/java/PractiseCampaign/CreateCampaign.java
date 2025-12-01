package PractiseCampaign;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

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

public class CreateCampaign {

	public static void main(String[] args) throws IOException {
		// Reading data from Properties File (common data)
		FileInputStream fis = new FileInputStream("D:\\OLDDATA\\BackUPCDrive\\SELENIUM\\QSpider-Selenium\\commonData.properties");
		Properties pro = new Properties();
		pro.load(fis);
		String BROWSER=pro.getProperty("browser");
		String URL=pro.getProperty("url");
		String USERNAME=pro.getProperty("username");
		String PASSWORD=pro.getProperty("password");
		
		//creating Random numbers
		Random r=new Random();
		int ran=r.nextInt(1000);		
		// Reading data from Excel (Testcase specific data)
		Workbook wb=WorkbookFactory.create(new FileInputStream("D:\\OLDDATA\\BackUPCDrive\\SELENIUM\\QSpider-Selenium\\Excel123.xlsx"));
		Sheet sh= wb.getSheet("campaign");
		Row r1=sh.getRow(1);
		
		String campname=r1.getCell(2).toString()+ran;
		//String conlastname=r1.getCell(3).toString();

		wb.close();
		
		//Open Browser
		WebDriver driver=null;
		if(BROWSER.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(BROWSER.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(BROWSER.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		//login to application
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		//Navigate to Campaign link
		
		//table[@class='hdrTabBg']//a[text()='More']
		driver.findElement(By.xpath("//table[@class='hdrTabBg']//a[text()='More']")).click();
		driver.findElement(By.name("Campaigns")).click();
		driver.findElement(By.xpath("//table[@class='hdrTabBg']//a[text()='Campaigns']")).click();
		driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();		
		driver.findElement(By.name("campaignname")).sendKeys(campname);
		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
		
		//verify expected msg results in the Header
		String headerInfo=driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		if(headerInfo.contains(campname))
		{
			System.out.println(campname + "is created==PASS");
		}
		else
		{
			System.out.println(campname + " is not created");
		}
		//verify expected campname
		String act_campname=driver.findElement(By.xpath("//span[@id='dtlview_Campaign Name']")).getText();
		//WebElement orgnamefield=driver.findElement(By.id("mouseArea_Organization Name"));
		
		if(act_campname.equals(campname))
		{
			System.out.println(campname + " is present in the Organisation Name filled");
		}
		else
		{
			System.out.println("Organisation name is not be present");
		}
		
		//logout
		//driver.quit();	


	}

}
