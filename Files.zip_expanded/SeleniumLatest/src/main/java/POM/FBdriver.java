package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FBdriver {

	public static void main(String[] args) {
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com/");		
//		FacebookPageFactory t=new FacebookPageFactory(driver);
//		t.enterusername("usrrname12345");
//		t.enterpassword("password12345");
//		t.loginbutton();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		Facebook f= new Facebook(driver);
		f.un("ffff");
		f.pd("ggg");
		f.lb();
	
	}
}
