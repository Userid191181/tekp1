package com.crm.generic.WebDriverUtility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {

	
	public void waitforPageToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}	
	public void waitforElement(WebDriver driver, WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void switchToTabOnUrl(WebDriver driver, String partialUrl)
	{		
		Set<String> set=driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext())
		{
			String windowID=it.next();
			driver.switchTo().window(windowID);		
			String acturl=driver.getCurrentUrl();
			if(acturl.contains(partialUrl))
			{
				break;
			}}	}
		
	public void switchToTabOnTitle(WebDriver driver, String partialTitle)
	{
		Set<String> set=driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext())
		{
			String windowID=it.next();
			driver.switchTo().window(windowID);
			
			String actTitle=driver.getTitle();
			if(actTitle.contains(partialTitle))
			{
				break;
			}
		}
	}
	
	public void switchToFrame(WebDriver driver, int index)
	{
		driver.switchTo().frame(index);
	}
	
	public void switchtoFrame(WebDriver driver, int nameID)
	{
		driver.switchTo().frame(nameID);
	}
	
	public void switchtoFrame(WebDriver driver, WebElement element)
	{
		driver.switchTo().frame(element);
	}
	
	public void switchToAlertAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public void switchToAlertDismiss(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public void select(WebElement element, String text) throws InterruptedException
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);		
	}
	public void select(WebElement element, int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);		
	}
	
	public void mouseMoveOnElement(WebDriver driver, WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	public void doubleClick(WebDriver driver, WebElement element)
	{
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
	}
	
}
