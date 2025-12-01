package PractiseTestNG;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File;

public class Screenshot<EvenFiringWebDriver> {

	
@Test
public void Screenshot()
{
	WebDriver driver=new ChromeDriver();
	driver.get("http://amazon.com");
	//Step1: Create object for EventFiringWebDriver
//	EventFiringWebDriver edriver=new EventFiringWebDriver(driver);
//	File src=edriver.getScreenshot(OutputType.FILE);
//	
//	//Store screenshot in local drive
//	FileUtils.copyFile(src, new File("/src/des/test.png");
	
	//EventFiringWebDriver will not work on Selenium 4,  if we want to use this then we need to have Selenium 3, so only Thory part is covered.
	
}
	
}
