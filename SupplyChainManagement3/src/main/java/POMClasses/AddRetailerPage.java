package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRetailerPage {
WebDriver driver;
public  AddRetailerPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
	
@FindBy(name="txtRetailerUname")
private WebElement Username;

@FindBy(id="retailer:password")
private WebElement Password;

@FindBy(id="retailer:areaCode")
private WebElement Areacode;

@FindBy(id="retailer:phone")
private WebElement Phone;

@FindBy(id="retailer:email")
private WebElement Email;

@FindBy(xpath="//input[@value='Add Retailer']")
private WebElement AddRetBtn;

@FindBy(id="retailer:address")
private WebElement Address;

public WebElement getAddRetBtn() {
	return AddRetBtn;
}

public WebDriver getDriver() {
	return driver;
}

public WebElement getUsername() {
	return Username;
}

public WebElement getPassword() {
	return Password;
}

public WebElement getAreacode() {
	return Areacode;
}

public WebElement getPhone() {
	return Phone;
}

public WebElement getEmail() {
	return Email;
}

public WebElement getAddress() {
	return Address;
}


}
