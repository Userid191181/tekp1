package src;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class End2EndFlow {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		//selecting orignal city
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); 
		//Here the second dropdown populates only when the first dropdown is selected
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='DEL']")).click(); //parent->child traversing
		WebDriverWait wait1 = new WebDriverWait(driver,Duration. ofSeconds(5));
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();//second dropdown.parent->child traversing index notrequired
		WebDriverWait wait2 = new WebDriverWait(driver,Duration. ofSeconds(5));
		//selecting the RoundTrip radio button
		driver.findElement(By.cssSelector("input[id*='Content_rbtnl_Trip_0']")).click();
		if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("0.5"))
		{
			System.out.println("disabled");
			Assert.assertTrue(true);
		}
		
		else 
		{
			System.out.println("is enabled and this is incorrect");
			Assert.assertTrue(false);
		}
		
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration. ofSeconds(5));
		System.out.println(driver.findElement(By.id("hrefIncAdt")).getText());		
		for(int i=1; i<5; i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();  //clicking the dropdown more than once using looping
		}		
		driver.findElement(By.id("btnclosepaxoption")).click();		
		System.out.println(driver.findElement(By.id("hrefIncAdt")).getText());	
		
		driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		
		
	}

}
