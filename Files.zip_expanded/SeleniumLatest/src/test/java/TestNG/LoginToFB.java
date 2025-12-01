package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginToFB {

	@Test
	public void LoginFB()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("abc@1.com");
		driver.findElement(By.id("pass")).sendKeys("passwore123");
		driver.findElement(By.name("login")).click();		
	}	
}
