package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StaleElementRefExcepUsingPOM {
	@FindBy(id="email")
	private WebElement un; 
	@FindBy(id="pass")
	private WebElement pwd; 
	
	public StaleElementRefExcepUsingPOM(WebDriver driver)	{
		PageFactory.initElements(driver, this);
	}	
	public void getun(String name)
	{
		un.sendKeys(name);
	}
	public void getpwd(String pwdd)
	{
		pwd.sendKeys(pwdd);
	}	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
