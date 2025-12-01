package PractiseContactTest;

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

public class CreateContactTest {



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
			Sheet sh= wb.getSheet("contact");
			Row r1=sh.getRow(1);			
			String contact=r1.getCell(2).toString();

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
			
			//navigate to Contact module
			driver.findElement(By.xpath("//a[@href='index.php?module=Contacts&action=index']")).click();
			driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
			driver.findElement(By.name("lastname")).sendKeys(contact);
			driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
			
			//verify the Contact number
			WebElement connum=driver.findElement(By.xpath("//span[@id='dtlview_Last Name']"));
			String connum1=connum.getText();
			
			if(contact.equals(connum1))
			{
				System.out.println(connum1 + " is present in the Contact Last Name filed");
			}
			else
			{
				System.out.println("Contact Last Name is not be present");
			}
					
			
			//logout
			//driver.quit();		


	}

}
