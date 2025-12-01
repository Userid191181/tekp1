package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverStaleElewithPOM {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		StaleElementRefExcepUsingPOM hj=new StaleElementRefExcepUsingPOM(driver);
		hj.getun("ddddd");
		hj.getpwd("ffff");	
		driver.navigate().refresh();
		hj.getun("ddddd");
		hj.getpwd("ffff");			
	}
}
