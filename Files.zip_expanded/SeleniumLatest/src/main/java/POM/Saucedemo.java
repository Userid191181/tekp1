package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Saucedemo {
@FindBy(id="user-name")
private WebElement username;
@FindBy(id="password")
private WebElement password;
@FindBy(id="login-button")
private WebElement loginbtn;
Saucedemo(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void enterusername(String name)
{
	username.sendKeys(name);
}
public void enterpwd(String name)
{
	password.sendKeys(name);
}
public void loginbtn()
{
	loginbtn.click();
}

}
