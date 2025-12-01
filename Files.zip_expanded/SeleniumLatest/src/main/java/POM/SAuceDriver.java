package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SAuceDriver {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Saucedemo s=new Saucedemo(driver);
		s.enterusername("standard_user");
		s.enterpwd("secret_sauce");
		s.loginbtn();
		driver.findElement(By.tagName(null));

	}

}
