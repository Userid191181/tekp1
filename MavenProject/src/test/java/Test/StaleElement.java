package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class StaleElement {
	@FindBy(name="user_name")
	WebElement usrid;
	
	@FindBy(name="user_password")
	WebElement usrpwd;
	
	@FindBy(id="submitButton")
	WebElement subBTN;

@Test	
public void sampleTest()
{
	WebDriver driver=new ChromeDriver();
	driver.get("http://49.249.28.218:8888/");
	StaleElement s= PageFactory.initElements(driver, StaleElement.class);
	s.usrid.sendKeys("admin");
	s.usrpwd.sendKeys("admin");
	driver.navigate().refresh();
	s.usrid.sendKeys("admin");
	s.usrpwd.sendKeys("admin");	
	s.subBTN.click();	
}}

