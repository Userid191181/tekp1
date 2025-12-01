package SeleniumLocators;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/");
	TakesScreenshot t= (TakesScreenshot)driver;
	File file= t.getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(file, file);
	
}
}
