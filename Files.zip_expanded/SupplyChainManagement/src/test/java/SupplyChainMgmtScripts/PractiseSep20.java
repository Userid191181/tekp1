package SupplyChainMgmtScripts;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import src.Alerts;
public class PractiseSep20 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("Hari Hari Hari");
		driver.findElement(By.id("email")).sendKeys("hari.hari@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("1234567890");
		driver.findElement(By.id("textarea")).sendKeys("#2, model colony, Bangalore:560022");
		driver.findElement(By.id("male")).click();
		driver.findElement(By.id("sunday")).click();
		
		WebElement Countyrele = driver.findElement(By.id("country"));
		Select sel=new Select(Countyrele);
		
		sel.selectByContainsVisibleText("India");
		
		WebElement Colorssele = driver.findElement(By.id("colors"));
		Select sel1=new Select(Colorssele);
		sel1.selectByVisibleText("Yellow");
		
		
		//Attaching multiple files
		WebElement mulfileupload=driver.findElement(By.xpath("//input[@id='multipleFilesInput']"));
		mulfileupload.sendKeys("D:\\OLDDATA\\BackUPCDrive\\SELENIUM\\TEKPyramid\\SCM.pptx\nD:\\OLDDATA\\BackUPCDrive\\SELENIUM\\TEKPyramid\\SCM.pptx");
		//mulfileupload.sendKeys("D:\\OLDDATA\\BackUPCDrive\\SELENIUM\\TEKPyramid\\SCM.pptx\nD:\\OLDDATA\\BackUPCDrive\\SELENIUM\\TEKPyramid\\Proof of Concept.docx");
				
//	TakesScreenshot t=(TakesScreenshot) driver;
//	File src= t.getScreenshotAs(OutputType.FILE);
//	File dec=new File("./src/ff/f/d.xlsx");
//	FileHandler.copy(src,dec);
//	

	}}
	


