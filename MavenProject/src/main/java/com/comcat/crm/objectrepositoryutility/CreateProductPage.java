package com.comcat.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProductPage {
	
	private WebDriver driver;

	public CreateProductPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="productname")
	private WebElement productnamedit;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveBtn;
	
	@FindBy(name="productcategory")
	private WebElement productCategory;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getProductCategory() {
		return productCategory;
	}

	public WebElement getProductnamedit() {
		return productnamedit;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	@FindBy(name="start_date")
	private WebElement supportStrDate;
	
	@FindBy(name="expiry_date")
	private WebElement supportExpDate;
	
	@FindBy(id="dtlview_Support Start Date")
	private WebElement actSupportStrDateAfterSave;

	@FindBy(id="dtlview_Support Expiry Date")
	private WebElement actSupportExpDateAfterSave;
	
	public WebElement getSupportStrDate() {
		return supportStrDate;
	}

	public WebElement getSupportExpDate() {
		return supportExpDate;
	}

	public WebElement getActSupportStrDateAfterSave() {
		return actSupportStrDateAfterSave;
	}

	public WebElement getActSupportExpDateAfterSave() {
		return actSupportExpDateAfterSave;
	}

	public void entersuppStartAndEndDate(String startDate, String expDate)
	{
		supportStrDate.clear();
		supportStrDate.sendKeys(startDate);
		supportExpDate.clear();
		supportExpDate.sendKeys(expDate);	
	}
}