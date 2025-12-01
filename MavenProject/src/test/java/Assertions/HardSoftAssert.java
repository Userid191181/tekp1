package Assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardSoftAssert {

@Test

public void VerifyHomePage()
{
	String expPage="Home Page";
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://49.249.28.218:8888/");
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
	String actTitle=driver.findElement(By.xpath("//a[contains(text(),'Home')]")).getText();
	//HardAssert
	Assert.assertEquals(actTitle, expPage);
	
	driver.quit();
}
	
@Test
public void VerifyLogo()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://49.249.28.218:8888/");
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
	boolean imgstatus =driver.findElement(By.xpath("//img[@alt='vtiger-crm-logo.gif']")).isDisplayed();
	//HardAssert
	Assert.assertTrue(imgstatus); //if the boolean variable is true the it passes test case else fails testcase
	driver.quit();	

}
}