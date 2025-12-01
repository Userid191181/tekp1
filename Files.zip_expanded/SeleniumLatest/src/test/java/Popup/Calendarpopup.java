package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calendarpopup {
public static void main(String[] args) throws InterruptedException {

	
	
//	WebDriver driver=new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//	driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();	
//	Alert a=driver.switchTo().alert();
//	a.accept();
//	
//	driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//	Alert a1=driver.switchTo().alert();
//	a.accept();
//	
//	driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
//	Alert a2=driver.switchTo().alert();
//	a.accept();

	
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.yatra.com/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//img[@alt='cross'])[1]")).click();	
		
	Alert a2=driver.switchTo().alert();
	a2.dismiss();
	a2.accept();
	
	
//	driver.findElement(By.xpath("//div[@class='css-w7k25o']")).click();
//	driver.findElement(By.xpath("//span[text()='August 2025']/ancestor::div[@class='react-datepicker__month-container']//descendant::span[text()='14']")).click();

	
	
	
//	WebDriver driver=new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("https://jqueryui.com/droppable/");
//	driver.switchTo().frame(0);
//	WebElement drag=driver.findElement(By.id("draggable"));
//	WebElement drop=driver.findElement(By.id("droppable"));
//	Actions a=new Actions(driver);
//	a.dragAndDrop(drag, drop).perform();
	
	
	
	
//	WebDriver driver=new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("https://jqueryui.com/droppable/");

//	WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//	driver.switchTo().frame(frame);
//	WebElement drag=driver.findElement(By.id("draggable"));
//	WebElement drop=driver.findElement(By.id("droppable"));
//	Actions a=new Actions(driver);
//	a.dragAndDrop(drag, drop).perform();
	
	
	
//	driver.switchTo().frame("iFrame Demo");
//	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Testing12345");

//	driver.switchTo().frame("SingleFrame");
//	frame.sendKeys("Testing12345");	
//	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Testing12345");
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("document.getElementById('email').value='aaaa'");
	
	WebElement e=driver.findElement(By.id("email"));
	
	
	js.executeScript("argyments[0].value='admine'",e);
	
	
	js.executeScript("window.scrollTo(0.document.body.scrollTop");
	
}
}
