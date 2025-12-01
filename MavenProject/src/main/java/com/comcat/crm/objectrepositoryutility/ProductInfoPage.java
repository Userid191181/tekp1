package com.comcat.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductInfoPage {

	WebDriver driver;
	public ProductInfoPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getHeaderProductname() {
		return headerProductname;
	}

	@FindBy(xpath="//span[@class='lvtHeaderText']")
	private WebElement headerProductname;
	
	@FindBy(xpath="//span[@id='dtlview_Product Name']")
	private WebElement actProductAfterSave;

	public WebElement getActProductAfterSave() {
		return actProductAfterSave;
	}
}
