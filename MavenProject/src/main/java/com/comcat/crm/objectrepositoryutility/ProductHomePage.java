package com.comcat.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductHomePage {
	
	WebDriver driver;
	public ProductHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//img[@title='Create Product...']")
private WebElement createProductbtn;

public WebElement getCreateProductbtn() {
	return createProductbtn;
}
	
}
