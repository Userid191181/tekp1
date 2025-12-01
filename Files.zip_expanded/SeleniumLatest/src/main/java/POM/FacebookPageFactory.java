package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPageFactory {
	//declaring the webelements
	@FindBy(id="email")
	private WebElement username;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(xpath="//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")
	private WebElement loginbtn;	
	//Initialization
	FacebookPageFactory(WebDriver driver) //constructor
	{
		PageFactory.initElements(driver, this);
		//username=driver.findElement(By.id("email"));
//		password=driver.findElement(By.id("pass"));
//		loginbtn=driver.findElement(By.name("login"));
	}	
	//var utilization
	public void enterusername(String name)
	{
		username.sendKeys(name);
	}
	public void enterpassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void loginbutton()
	{
		loginbtn.click();
	}}