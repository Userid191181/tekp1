package src;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SiblingsParent {
	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicitly waits for 5 seconds
		driver.get("http://google.com");
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");		
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));	
		Select dd=new Select(dropdown);
		dd.selectByIndex(2);		
		System.out.println(dd.getFirstSelectedOption().getText());
		driver.findElement(By.id("divpaxinfo")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration. ofSeconds(5));
		System.out.println(driver.findElement(By.id("hrefIncAdt")).getText());		
		for(int i=1; i<5; i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();  //clicking the dropdown more than once using looping
		}		
		driver.findElement(By.id("btnclosepaxoption")).click();		
		System.out.println(driver.findElement(By.id("hrefIncAdt")).getText());	
		
		
	}
}
