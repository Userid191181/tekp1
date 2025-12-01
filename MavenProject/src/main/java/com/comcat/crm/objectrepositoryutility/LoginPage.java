package com.comcat.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.generic.WebDriverUtility.WebDriverUtility;

public class LoginPage extends WebDriverUtility {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@type='text']")
	private WebElement userid;
	@FindBy(name="user_password")
	WebElement passwordEdit;
	
	@FindAll({@FindBy(id="submitButton"),@FindBy(xpath="//input[@value='Login']")})	
	private WebElement loginBtn;
	
	public WebElement getUserid() {
		return userid;
	}

	public WebElement getPasswordEdit() {
		return passwordEdit;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	// Business class for login
	public void logintocrm(String username, String password ) {
		waitforPageToLoad(driver);
		driver.manage().window().maximize();
		userid.sendKeys("admin");
		passwordEdit.sendKeys("admin");
		loginBtn.click();
	}
	
/**
 * login to application based on username, password, url, arguments
 * @param url
 * @param username
 * @param password
 * @throws InterruptedException
 */
	public void logintocrmWithURl(String url, String username, String password ) throws InterruptedException {
		waitforPageToLoad(driver);
		driver.get(url);
		driver.manage().window().maximize();
		userid.sendKeys(username);
		Thread.sleep(500);
		passwordEdit.sendKeys(password);
		loginBtn.click();
	}
}
