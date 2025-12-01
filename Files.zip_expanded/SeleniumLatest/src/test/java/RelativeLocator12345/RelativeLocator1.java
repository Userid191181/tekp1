package RelativeLocator12345;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocator1 
{


			public static void main(String[] args) 
			{
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
//				driver.get("https://demowebshop.tricentis.com/");
//				WebElement searchele=driver.findElement(By.xpath("//input[@type='submit']"));
//				driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(searchele)).sendKeys("mobiles");
				driver.get("https://www.amazon.in/");
				WebElement returnsOrders = driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute']"));
				driver.findElement(RelativeLocator.with(By.id("nav-cart-count")).toRightOf(returnsOrders)).click();
				
			}

}
