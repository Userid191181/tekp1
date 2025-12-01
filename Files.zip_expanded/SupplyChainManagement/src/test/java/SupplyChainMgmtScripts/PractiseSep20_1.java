package SupplyChainMgmtScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PractiseSep20_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(3000);
//		
//		//Alerts and Popups:
//		driver.findElement(By.id("alertBtn")).click();
//		Alert alertpup=driver.switchTo().alert();
//		alertpup.accept();		
//		Thread.sleep(3000);
//		driver.findElement(By.id("confirmBtn")).click();
//		Alert confirmpup=driver.switchTo().alert();
//		confirmpup.accept();
//		Thread.sleep(3000);
//		driver.findElement(By.id("promptBtn")).click();
//		Alert promptpup=driver.switchTo().alert();
//		promptpup.accept();
//		Thread.sleep(3000);
//		
//		//MouseHover
//		WebElement mh=driver.findElement(By.xpath("//button[@class='dropbtn']"));
//		Actions act=new Actions(driver);
//		act.moveToElement(mh).perform();
//		driver.findElement(By.xpath("//div[@class='dropdown-content']/a[text()='Laptops']")).click();
//		
//		//Doubleclick 
//		Thread.sleep(3000);
//		WebElement douclick=driver.findElement(By.xpath("//button[text()='Copy Text']"));
//		Actions act1=new Actions(driver);
//		act1.doubleClick(douclick).perform();
//		
//		
//		//Drag and Drop
//		Thread.sleep(3000);
//		WebElement drag=driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
//		WebElement drop=driver.findElement(By.id("droppable"));
//		Thread.sleep(2000);
//		Actions dd=new Actions(driver);
//		dd.dragAndDrop(drag, drop).perform();

		
		
		//Slider		
		//driver.findElement(By.xpath("//div[@class='ui-slider-range ui-corner-all ui-widget-header']")).click();
//		WebElement slid=driver.findElement(By.xpath("//div[@class='ui-slider-range ui-corner-all ui-widget-header']"));
//		Actions slideact=new Actions(driver);
//		slideact.clickAndHold(slid).perform();
//		slideact.release(slid).perform();
		
		
		//svg
		//div[@class='widget-content']/div[@class='svg-container']//*[local-name()='svg'][3]
		
		
		
		
		
		
		
	}

}
