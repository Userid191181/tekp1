package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook {
//	//declaring the webelements
//	private WebElement username;
//	private WebElement password;
//	private WebElement loginbtn;	
//	//Initialization
//	Facebook(WebDriver driver) //constructor
//	{
//		username=driver.findElement(By.id("email"));
//		password=driver.findElement(By.id("pass"));
//		loginbtn=driver.findElement(By.name("login"));
//	}	
//	//var utilization
//	public void enterusername(String name)
//	{
//		username.sendKeys(name);
//	}
//	public void enterpassword(String pwd)
//	{
//		password.sendKeys(pwd);
//	}
//	public void loginbutton()
//	{
//		loginbtn.click();
//	}
	
@FindBy(id="email")
private WebElement un;
@FindBy(id="pass")
private WebElement pd;
@FindBy(name="login")
private WebElement lb;

Facebook(WebDriver driver)
{
	PageFactory.initElements(driver, this);
//	un=driver.findElement(By.id("email"));
//	pd=driver.findElement(By.id("pass"));
//	lb=driver.findElement(By.name("login"));
}

public void un(String name)
{
	un.sendKeys(name);
}
public void pd(String pwd)
{
	pd.sendKeys(pwd);
}
public void lb()
{
	lb.click();
}











}