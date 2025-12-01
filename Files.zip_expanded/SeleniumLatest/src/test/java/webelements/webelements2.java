package webelements;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v127.indexeddb.model.Key;
import org.openqa.selenium.edge.EdgeDriver;

public class webelements2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		WebElement ele=driver.findElement(By.xpath("//button[@type=='submit']"));
		boolean b= ele.isEnabled();
		if(b)
		{
			System.out.println("Login button in Instagram page is Enabled");
		}
		else
		{
		System.out.println("Login button is NOT Enabled");
		}
//		driver.get("https://www.saucedemo.com/v1/");
//		WebElement ele = driver.findElement(By.cssSelector("input[id='login-button']"));
//		if(ele.isDisplayed())
//		{
//			System.out.println("Login button is Displayed");
//		}
//		else
//		{
//			System.err.println("Login button is not displayed");
//		}
	}
	
}
