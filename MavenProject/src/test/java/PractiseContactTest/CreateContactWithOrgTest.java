package PractiseContactTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

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

public class CreateContactWithOrgTest {

	public static void main(String[] args) throws IOException, InterruptedException {
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
				Row r1=sh.getRow(7);
				
				String orgname=r1.getCell(2).toString()+ran;
				String conlastname=r1.getCell(3).toString();

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
				driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
				
				//verify expected msg results in the Header
				String headerInfo=driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
				if(headerInfo.contains(orgname))
				{
					System.out.println(orgname + "is created==PASS");
				}
				else
				{
					System.out.println(orgname + " is not created");
				}
				//verify expected orgname
				String act_orgname=driver.findElement(By.xpath("//span[@id='dtlview_Organization Name']")).getText();
				WebElement orgnamefield=driver.findElement(By.id("mouseArea_Organization Name"));
				
				if(act_orgname.equals(orgname))
				{
					System.out.println(orgname + " is present in the Organisation Name filled");
				}
				else
				{
					System.out.println("Organisation name is not be present");
				}
				
				//Navigate to contact module:
				//click on contact link
				driver.findElement(By.xpath("//a[@href='index.php?module=Contacts&action=index']")).click();
				driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
				driver.findElement(By.name("lastname")).sendKeys(conlastname);
				driver.findElement(By.xpath("//input[@name='account_name']/following-sibling::img")).click();
				
				//Switching from parent window to child window
				Set<String> wins=driver.getWindowHandles();
				Iterator<String> it= wins.iterator();				
				while(it.hasNext())
				{
					String win=it.next();
					driver.switchTo().window(win);
					
					String acturl=driver.getCurrentUrl();
					if(acturl.contains("module=Accounts&action"))
					{
						break;
					}
				}		
				
				
//				String parent = driver.getWindowHandle();
//				Set<String> child = driver.getWindowHandles();
//				for(String id:child)
//				{
//					driver.switchTo().window(id);
//				}				
				
				
				
				driver.findElement(By.id("search_txt")).sendKeys(orgname);
				driver.findElement(By.name("search")).click();
				Thread.sleep(1000);
				String Contactorgname=driver.findElement(By.partialLinkText(orgname)).getText();
				Thread.sleep(1000);
				if(orgname.equals(Contactorgname))
				{
					System.out.println("Organisation name " + orgname +  " is displayed in the Organisation List");
					driver.findElement(By.partialLinkText(orgname)).click();
				}
				else
				{
					System.out.println("Organisation name is not displayed in the Organisation List");
				}				
				
				//switching back to parent window
				Set<String> wins1=driver.getWindowHandles();
				Iterator<String> it1= wins1.iterator();				
				while(it1.hasNext())
				{
					String win1=it1.next();
					driver.switchTo().window(win1);
					
					String acturl=driver.getCurrentUrl();
					if(acturl.contains("module=Contacts&action"))
					{
						break;
					}
				}
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				
				//Verify Contact name present in header info.
				String connum1=driver.findElement(By.xpath("//span[@id='dtlview_Last Name']")).getText();
				String conheaderinfo=driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
				if(conheaderinfo.contains(connum1))
				{
					System.out.println("Conatct name " + connum1 + " is present in the Header Info");
				}
				
				//verify the Contact name in the Last Name field				
				
				
				if(conlastname.equals(connum1))
				{
					System.out.println(connum1 + " is present in the Contact Last Name filed");
				}
				else
				{
					System.out.println("Contact Last Name is not be present");
				}

				//Verify Organication name in Contact link page after loading the Organization name.
				
				String Contactorgname1=driver.findElement(By.partialLinkText(orgname)).getText();
				Thread.sleep(1000);
				if(orgname.equals(Contactorgname1))
				{
					System.out.println("Organisation name " + orgname +  " is displayed in the Contact Link page");
				}
				else
				{
					System.out.println("Organisation name is not displayed in the Contact Link page");
				}
				
				//logout
				//driver.quit();		


	}

}
