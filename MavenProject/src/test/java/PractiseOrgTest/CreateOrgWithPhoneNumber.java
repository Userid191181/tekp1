package PractiseOrgTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
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
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.support.ui.Select;

public class CreateOrgWithPhoneNumber {

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
		Sheet sh= wb.getSheet("org");
		Row r1=sh.getRow(7);
		
		String orgname=r1.getCell(2).toString()+ran;
		String PhoneNum=r1.getCell(3).toString();

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
		
		//navigate to Organization module
		driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index' and text()='Organizations']")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys(orgname);
		driver.findElement(By.id("phone")).sendKeys(PhoneNum);
		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
		
		//verify the Phone number
		WebElement actph=driver.findElement(By.xpath("//span[@id='dtlview_Phone']"));
		String actph1=actph.getText();
		
		if(PhoneNum.equals(actph1))
		{
			System.out.println(actph1 + " is present in the Industry filed");
		}
		else
		{
			System.out.println("Phone number may not be present");
		}
				
		
		//logout
		//driver.quit();		

	}

}
