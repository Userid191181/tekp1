package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddDistributorPage {
		WebDriver driver;
		public  AddDistributorPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

@FindBy(id="distributor:name")
private WebElement distname; 

@FindBy(id="distributor:email")
private WebElement distnemail; 

@FindBy(xpath ="//input[@value='Add Distributor']")
private WebElement distbtn;

public WebDriver getDriver() {
	return driver;
}

public WebElement getDistbtn() {
	return distbtn;
}

public void setDistbtn(WebElement distbtn) {
	this.distbtn = distbtn;
}

public WebElement getDistname() {
	return distname;
}

public WebElement getDistnemail() {
	return distnemail;
}

public WebElement getDistphone() {
	return distphone;
}

public WebElement getDistaddress() {
	return distaddress;
}

@FindBy(id="distributor:phone")
private WebElement distphone; 

@FindBy(id="distributor:address")
private WebElement distaddress; 

}