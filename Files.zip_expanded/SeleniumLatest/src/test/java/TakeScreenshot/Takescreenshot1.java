package TakeScreenshot;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
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
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Takescreenshot1 {

	public static void main(String[] args) throws IOException, InterruptedException {
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com/");				
//		TakesScreenshot ts= (TakesScreenshot) driver;
//		File src=ts.getScreenshotAs(OutputType.FILE);
//		File dest=new File("./screenshot/google1.png");
//		FileHandler.copy(src,dest);
		
		

	
		
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");	
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-left");
		System.out.println(driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText());

		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.tagName("div")).getText());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		

//		driver.switchTo().parentFrame();
//		driver.switchTo().frame("frame-right");
//		System.out.println(driver.findElement(By.tagName("body")).getText());
//		
//		driver.switchTo().defaultContent();
//		driver.switchTo().frame("frame-bottom");
//		System.out.println(driver.findElement(By.tagName("body")).getText());
		
		
		
		
		
	
		
		
		
		
		

	
	}}


