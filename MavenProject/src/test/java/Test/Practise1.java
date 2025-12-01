package Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File;
import com.mysql.jdbc.Driver;
import java.util.*;

public class Practise1 {
	@Test(dataProvider="gggf")
//public static void main(String[] args) throws InterruptedException, SQLException, EncryptedDocumentException, IOException, AWTException {
//		WebDriver driver=new ChromeDriver();
//		WebElement ele=driver.findElement(By.id(""));
////		driver.findElement(RelativeLocator.with(By.id("")).toLeftOf(By.id(""))).click();
////	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//}	
	public void ddd(String FN, String LN)
	{
		System.out.println(FN + "Firstname" + LN);	}
	@DataProvider
	public Object[][] gggf()
	{
		Object[][] ddd=new Object[3][2];
		ddd[0][0]="aaa";
		ddd[0][1]="bbb";				
		return ddd;		
	}}
