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
import org.testng.Assert;

public class Practise {
public static void main(String[] args) 
{
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");	
	//clicking the drop down available
/*	WebElement dropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));	
	Select dd=new Select(dropdown);
	dd.selectByIndex(2);		
	System.out.println(dd.getFirstSelectedOption().getText());
	driver.findElement(By.id("divpaxinfo")).click();
	WebDriverWait wait = new WebDriverWait(driver,Duration. ofSeconds(5));
	System.out.println(driver.findElement(By.id("hrefIncAdt")).getText());		
	for(int i=1; i<5; i++)
	{
		driver.findElement(By.id("hrefIncAdt")).click();  //clicking the dropdown more than once using looping
	}	*/
	
	//checking the original from and To destinations
	
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	//Here the second dropdown populates only when the first dropdown is selected
	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA']")).click(); //parent->child traversing
	WebDriverWait wait1 = new WebDriverWait(driver,Duration. ofSeconds(5));
	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();//second dropdown.parent->child traversing index notrequired
	WebDriverWait wait2 = new WebDriverWait(driver,Duration. ofSeconds(5));
	
	//Checking the checkbox
	
	//<input id="ctl00_mainContent_chk_SeniorCitizenDiscount" type="checkbox" name="ctl00$mainContent$chk_SeniorCitizenDiscount">
	Assert.assertFalse((driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected()));
	System.out.println((driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected()));
	driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	Assert.assertTrue((driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected()));
	System.out.println((driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected()));

	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	
	//Selecting the calendar
	//ui-state-default ui-state-active
	//.ui-state-default.ui-state-active.ui-state-hover
	//driver.findElement(By.cssSelector(".ui-state-default.ui-state-active.ui-state-hover")).click();
	
	//selecting the radio button in the webpage (Round Trip)
	driver.findElement(By.cssSelector("input[id*='Content_rbtnl_Trip_1']")).click();
	if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1"))
	{
		System.out.println("enabed");
		Assert.assertTrue(true);
	}
	else Assert.assertTrue(false);

}
}