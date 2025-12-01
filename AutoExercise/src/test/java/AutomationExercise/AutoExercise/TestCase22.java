package AutomationExercise.AutoExercise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestCase22 {

public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://automationexercise.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0,7500)");

	List<WebElement> ele=driver.findElements(By.xpath("//div[@id='recommended-item-carousel']"));
	for(WebElement e:ele)
	{
		if(e.isDisplayed())
		{
		System.out.println(e.getText());
		}
		else
		{
			System.out.println("Recommand Items are not displayed");
		}
	}
	
	Thread.sleep(5000);
	WebElement dd=driver.findElement(By.id("//div[@class='recommended_items']//descendant::p[text()='Stylish Dress']/..//descendant::a[@class='btn btn-default add-to-cart']"));
	if(dd.isDisplayed())
	{
		dd.click();
	}
	else
	{
		Thread.sleep(3000);
		dd.click();
	}
	
	
	}

}
