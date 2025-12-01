package webelements;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v127.indexeddb.model.Key;
import org.openqa.selenium.edge.EdgeDriver;

public class webelements1 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement s= driver.findElement(By.xpath("//input[@id='email']"));
	s.sendKeys("dfdfd");
//	driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("dfkjnsfj");	
//	driver.findElement(By.xpath("//button[@name='login']")).sendKeys(Keys.ENTER);
	s.sendKeys(Keys.CONTROL+"a");
	
	
}
}
