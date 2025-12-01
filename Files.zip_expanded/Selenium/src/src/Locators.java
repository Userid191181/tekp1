package src;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args)  {
		  WebDriver driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicitly waits for 5 seconds
		  driver.get("https://www.Amazon.in");
		  driver.manage().window().maximize();
		  driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();		  
		  driver.findElement(By.cssSelector("input.a-input-text")).sendKeys("9379845225"); //using CSS selector with class name (tagname.classname)
		  driver.findElement(By.xpath("//input[@type='submit']")).click();  //using relative xpath for Continue button
		  //driver.findElement(By.className("a-button-input")).click();
		  driver.findElement(By.cssSelector("input#ap_password")).sendKeys("Amazon191181!"); //using CSS selector with Id->tagname#id
		  driver.findElement(By.cssSelector("input[id='signInSubmit']")).click();  // using CSS selector with Tagname[attribute=’value’]
		  driver.findElement(By.linkText("Amazon Pay")).click();  //using link text
		  driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("Mobiles");
		  driver.close();
		  }
}
