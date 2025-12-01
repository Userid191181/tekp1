package MouseHover;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptExecutor1 {

	private static final String OutputType = null;

	public static void main(String[] args) throws InterruptedException, IOException {
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("document.getElementById('email').value='username'");			
//		js.executeScript("document.getElementById('pass').value='ffffffffffff'");		
//		WebElement ele=driver.findElement(By.name("login"));		
//		js.executeScript("arguments[0].click()", ele);		
//		js.executeScript("window.scrollTo(0,90)");		
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");	
//		js.executeScript("window.scrollTo(0,document.body.scrollTop)");	
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('email').value='admin'");	
		WebElement ele=driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
		js.executeScript("arguments[0].value='sddd'",ele);
		js.executeScript("window.scrollTo(0,80)");
		js.executeScript("window.scrollTo(0.document.body.scrollTop)");
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOf(ele));		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FluentWait w1=new FluentWait(driver);
		w1.pollingEvery(Duration.ofSeconds(1));
		w1.withTimeout(Duration.ofSeconds(10));
		w1.until(ExpectedConditions.visibilityOf(ele));
		
		
//		TakesScreenshot ts=(TakesScreenshot) driver;
//		File src=ts.getScreenshotAs(OutputType.FILE);
//		File des=new File("./src/fffff.xlsx");
//		FileHandler.copy(src,des);
		
		
//		Workbook b=WorkbookFactory.create(new FileInputStream("./src/fffff.xlsx"));
//		Row dd=b.getSheet("Sheet1").getRow(0);
//		String fw = dd.getCell(0).toString();
//		String fw1 = dd.getCell(1).toString();
		
		WebElement ele2 = driver.findElement(By.xpath("//select[@name='productCategory']"));
		Select s = new Select(ele2);
		s.selectByValue("Electronics");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
