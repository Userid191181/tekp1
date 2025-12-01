package SupplyChainMgmtScripts;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practise {

	public static void main(String[] args) throws InterruptedException {
//shadow (open shadow)
//WebDriver driver=new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
//Thread.sleep(3000);
//SearchContext ele = driver.findElement(By.xpath("(//form/div)[1]")).getShadowRoot();
//ele.findElement(By.cssSelector("input[type='text']")).sendKeys("username123");

//shadow (closed shadow) 
//WebDriver driver=new ChromeDriver();
//driver.get("https://demoapps.qspiders.com/ui/shadow/closed?sublist=1");
//Thread.sleep(3000);
//driver.findElement(By.xpath("//h1[.='Login']")).click();
//Thread.sleep(3000);
//Actions act=new Actions(driver);
//act.sendKeys(Keys.TAB+"u").perform();
//Thread.sleep(3000);
//act.sendKeys("123");


//		WebDriver driver=new ChromeDriver();
//		driver.get("https://demoapps.qspiders.com/ui/shadow/closed?sublist=1");
//		Thread.sleep(3000);
//SearchContext ele=driver.findElement(By.xpath("//form/div[1]")).getShadowRoot();
//Thread.sleep(5000);
//ele.findElement(By.cssSelector("input[type='text']")).sendKeys("abcdefg");

//WebElement ele1=driver.findElement(By.xpath("//form/div[1]"));

Date d= new Date();
SimpleDateFormat sim=new SimpleDateFormat("dd-MM-yyyy");
String dd=sim.format(d);
System.out.println(dd);

Calendar s=sim.getCalendar();
s.add(Calendar.DAY_OF_MONTH,30);
String ss=sim.format(s.getTime());
System.out.println(ss);








}

}
