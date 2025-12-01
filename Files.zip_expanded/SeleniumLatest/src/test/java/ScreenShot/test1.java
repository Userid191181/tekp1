package ScreenShot;
import java.io.File;
import java.io.IOException;
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
import org.openqa.selenium.support.ui.Select;

public class test1 {
public static void main(String[] args) throws IOException, InterruptedException {
	//screen shot of a webpage
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	Thread.sleep(3000);
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File destination=new File("./ScreenShot/google.png"); 
	FileHandler.copy(src, destination);
	
	WebElement ele=driver.findElement(By.xpath("//a[@aria-label='Sign in']"));
	File src1 = ele.getScreenshotAs(OutputType.FILE);
	File des1=new File("./ScreenShot/signin.png");
	FileHandler.copy(src1,des1);
	
	//For Takescreeshot we need to import below:
	//import org.openqa.selenium.io.FileHandler; 
	//import org.openqa.selenium.OutputType;
	//import org.openqa.selenium.TakesScreenshot;
	
	

	
	
	



}
}
