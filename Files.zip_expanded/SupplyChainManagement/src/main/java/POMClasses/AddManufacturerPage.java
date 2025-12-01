package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddManufacturerPage {
	WebDriver driver;
	public  AddManufacturerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="manufacturer:name")
	private WebElement manufacturername;
	
	@FindBy(id="manufacturer:email")
	private WebElement manufactureremail;
	
	@FindBy(id="manufacturer:phone")
	private WebElement manufacturerphone;
	
	@FindBy(id="manufacturer:username")
	private WebElement manufacturerusername;
	
	@FindBy(id="manufacturer:password")
	private WebElement manufactureruserpassword;	
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getManufacturername() {
		return manufacturername;
	}

	public WebElement getManufactureremail() {
		return manufactureremail;
	}

	public WebElement getManufacturerphone() {
		return manufacturerphone;
	}

	public WebElement getManufacturerusername() {
		return manufacturerusername;
	}

	public WebElement getManufactureruserpassword() {
		return manufactureruserpassword;
	}

	public WebElement getAddmanubtn() {
		return addmanubtn;
	}

	@FindBy(xpath="//input[@value='Add Manufacturer']")
	private WebElement addmanubtn;
	
	
	
}
