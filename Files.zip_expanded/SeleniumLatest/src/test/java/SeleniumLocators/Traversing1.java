package SeleniumLocators;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Traversing1 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Create new account")).click();
	WebElement ele=driver.findElement(By.xpath("//input[@name='firstname']"));
	ele.sendKeys("Naresh");
	ele.sendKeys(Keys.CONTROL+"a");
	ele.sendKeys(Keys.BACK_SPACE);
	
	
		
	
	//WATS to enter text in FN field in FB app and remove text using backspace key
	
	

	
	
	
	
}
}
