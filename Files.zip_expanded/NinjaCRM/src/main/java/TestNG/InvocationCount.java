package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount=4, threadPoolSize=2)
	public void sample()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Reporter.log("done", true);
		driver.close();
	}
}
