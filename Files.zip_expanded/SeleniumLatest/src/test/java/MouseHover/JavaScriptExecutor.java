package MouseHover;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v127.indexeddb.model.Key;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptExecutor {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");		
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("document.getElementById('email').value='admin'");			
//		js.executeScript("document.getElementById('pass').value='password'");
//		WebElement ele=driver.findElement(By.name("login"));
//		js.executeScript("argument[0].click()", ele);
//		js.executeScript("arguments[0].value='admin'", ele);
//		js.executeScript("window.scrollTo(0,80)");		
//		js.executeScript("window.scrollTo(0,document.body.scrollTop)");		
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementBy('paas').value='admin'");		
		WebElement ele=driver.findElement(By.name("login"));
		js.executeScript("argument[0].value='admin'", ele);
		js.executeScript("window.scrollTo(0,80)");
		js.executeScript("window.scrollTo(0, document.body.scrollTop)");		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("./src\\des\\dfd\\eee.xlsx");
		FileHandler.copy(src, des);		
		Workbook b=WorkbookFactory.create(new FileInputStream("./src\\ssss\\gggg.xlsx"));
		Row sh = b.getSheet("Sampe").getRow(0);
		String ch=sh.getCell(0).toString();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));		
		WebDriverWait wb=new WebDriverWait(driver, Duration.ofSeconds(10));
		wb.until(ExpectedConditions.visibilityOf(ele));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		WebElement ddd=driver.findElement(By.id("dd"));
		WebDriverWait wwww=new WebDriverWait(driver, Duration.ofSeconds(10));
		wwww.until(ExpectedConditions.visibilityOf(ddd));				
		Actions ss=new Actions(driver);
		ss.moveToElement(ddd).perform();
		ss.dragAndDrop(ddd, ddd);		
//		FluentWait w1=new FluentWait(driver);
//		w1.pollingEvery(Duration.ofSeconds(1));
//		w1.withTimeout(Duration.ofSeconds(10));
//		w1.until(ExpectedConditions.visibilityOf(ele));
		
		
		
		}

}
