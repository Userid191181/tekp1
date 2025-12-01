package GenericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class WebDriverUtility {
		//Implicit Wait
		public void WaitForPageToLoad(WebDriver driver)
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}		
		//Explicit Wait
		public void WaitForElementToBeClicked(WebDriver driver, WebElement element)
		{
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
		public void SwitchToFrameIndex(WebDriver driver, int index)
		{
			driver.switchTo().frame(index);
		}
		public void SwitchToFrameNameId(WebDriver driver, String nameorid)
		{
			driver.switchTo().frame(nameorid);
		}
		public void SwitchToFrameElement(WebDriver driver, WebElement element)
		{
			driver.switchTo().frame(element);
		}
		public void selectIndex(WebElement element, int index)
		{
			Select sel=new Select(element);
			sel.selectByIndex(index);
		}
		
		public void selectValue(WebElement element, String value)
		{
			Select sel=new Select(element);
			sel.selectByValue(value);
		}
		
		public void selectVisibleText(WebElement element, String value)
		{
			Select sel=new Select(element);
			sel.selectByVisibleText(value);
		}
				
		//MouseHover
		public void MouseHoverOneWebElement(WebDriver driver, WebElement element)
		{
			Actions a=new Actions(driver);
			a.moveToElement(element).click().perform();			
		}
		
		
		//DoubleClick
		public void DoubleClick(WebDriver driver, WebElement element)
		{
		Actions a=new Actions (driver);
		a.doubleClick(element).perform();
		}
		//RightClick
		public void RightClick(WebDriver driver, WebElement element)
		{
		Actions a=new Actions (driver);
		a.contextClick(element).perform();
		}
		
		//DrapAndDrop
		public void DragAndDrop(WebDriver driver, WebElement target, WebElement source)
		{
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target);
		}
				
				
				
		
		//Maximize Page
		public void Maximizepage(WebDriver driver)
		{
			driver.manage().window().maximize();
		}
		
		public void SwitchToWindow(WebDriver driver)
		{
			String parent = driver.getWindowHandle();
			Set<String> child = driver.getWindowHandles();
			child.remove(parent);
			for(String id:child)
			{
				driver.switchTo().window(id);
			}
		}
		
		public void TakesScreenshot(WebDriver driver, String Filename) throws IOException, InterruptedException
		{
			TakesScreenshot ts=(TakesScreenshot) driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File des=new File("./folder" + Filename + ".png");
			FileHandler.copy(src, des);
		}
		
		
		public void SwitchToAlertAndAccept(WebDriver driver)
		{
			driver.switchTo().alert().accept();
		}
		public void SwitchToAlertAndDismiss(WebDriver driver)
		{
			driver.switchTo().alert().dismiss();
		}
		public void SwitchToAlertAndGetText(WebDriver driver)
		{
			driver.switchTo().alert().getText();
		}
		public void SwitchToAlertAndSendKeys(WebDriver driver, String text)
		{
			driver.switchTo().alert().sendKeys(text);
		}
		
		
		
		
		
	    //Switch Back to Main Page
	    public void switchBack(WebDriver driver) 
	    {
	        driver.switchTo().defaultContent();
	    }
		
		//KeyBoard Actions using Actions Class
	    
	    //Press ENTER key on an element
	    public void PressEnterKey(WebDriver driver, WebElement element) {
	        Actions act = new Actions(driver);
	        act.sendKeys(element, Keys.ENTER).perform();
	    }

	    //Press TAB key
	    public void PressTabKey(WebDriver driver, WebElement element) {
	        Actions act = new Actions(driver);
	        act.sendKeys(element, Keys.TAB).perform();
	    }

	    //Press ESC key
	    public void PressEscapeKey(WebDriver driver) {
	        Actions act = new Actions(driver);
	        act.sendKeys(Keys.ESCAPE).perform();
	    }

	    //Ctrl + A (Select All)
	    public void SelectAll(WebDriver driver, WebElement element) {
	        Actions act = new Actions(driver);
	        act.click(element).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	    }

	    //Ctrl + C (Copy)
	    public void Copy(WebDriver driver, WebElement element) {
	        Actions act = new Actions(driver);
	        act.click(element).keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
	    }

	    //Ctrl + V (Paste)
	    public void paste(WebDriver driver, WebElement element) {
	        Actions act = new Actions(driver);
	        act.click(element).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	    }

	    //Ctrl + X (Cut)
	    public void cut(WebDriver driver, WebElement element) {
	        Actions act = new Actions(driver);
	        act.click(element).keyDown(Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL).perform();
	    }
	}


