package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class PropertyFile {
@Test

	public void ReadFromXml(XmlTest abc) throws Throwable
//public static void main(String[] args) throws IOException, InterruptedException, ParseException 
{
//Read data from Property File
//FileInputStream fis=new FileInputStream("./src/test/resources/commonData.properties");
//Properties pobj=new Properties();
//pobj.load(fis);
//String BROWSER=pobj.getProperty("browser");
//String URL=pobj.getProperty("url");
//String ID=pobj.getProperty("username");
//String PWD=pobj.getProperty("password");

//Read data from JSON
//JSONParser parser=new JSONParser();
//Object obj= parser.parse(new FileReader("D:\\OLDDATA\\BackUPCDrive\\SELENIUM\\TEKPyramid\\jsonCommonData.json"));
//JSONObject map = (JSONObject) obj;
//String URL=map.get("url").toString();
//String BROWSER=map.get("browser").toString();
//String ID=map.get("username").toString();
//String PWD=map.get("password").toString();

	
//Read data from XML
	String BROWSER=abc.getParameter("browser");
	String URL=abc.getParameter("url");
	String ID=abc.getParameter("username");
	String PWD=abc.getParameter("password");
WebDriver driver=null;
if(BROWSER.equals("chrome"))
{
	driver=new ChromeDriver();
}
else if(BROWSER.equals("edge"))
{
	driver=new EdgeDriver();
}
else if(BROWSER.equals("firefox"))
{
	driver = new FirefoxDriver();
}
driver.get(URL);
Thread.sleep(3000);
driver.findElement(By.name("user_name")).sendKeys(ID);
driver.findElement(By.name("user_password")).sendKeys(PWD);
driver.findElement(By.xpath("//input[@type='submit']")).click();

//Reading data from Excel
FileInputStream efis=new FileInputStream("D:\\OLDDATA\\BackUPCDrive\\SELENIUM\\TEKPyramid\\Excel.xlsx");
Workbook wb = WorkbookFactory.create(efis);
Sheet sh=wb.getSheet("Org");
Row row=sh.getRow(1);
String orgname = row.getCell(0).toString();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index' and text()='Organizations']")).click();
driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
driver.findElement(By.name("accountname")).sendKeys(orgname);
}
}
