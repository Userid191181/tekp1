package com.comcat.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContactPage {
	
	WebDriver driver;
	public CreateNewContactPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="lastname")
	private WebElement lastNameEdit;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveBtn;
	
	@FindBy(xpath="//input[@name='account_name']/following-sibling::img")
	private WebElement orgnameSelectBtn;
	
	@FindBy(id="dtlview_Support Start Date")
	private WebElement actsupstrDateAfterSave;
	
	@FindBy(id="dtlview_Support End Date")
	private WebElement actsupendDateAfterSave;	
	
	public WebElement getActsupstrDateAfterSave() {
		return actsupstrDateAfterSave;
	}

	public WebElement getActsupendDateAfterSave() {
		return actsupendDateAfterSave;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSupstrDate() {
		return supstrDate;
	}

	public WebElement getSupendDate() {
		return supendDate;
	}

	@FindBy(name="support_start_date")
	private WebElement supstrDate;
	
	@FindBy(name="support_end_date")
	private WebElement supendDate;

	public WebElement getOrgnameSelectBtn() {
		return orgnameSelectBtn;
	}

	public WebElement getLastNameEdit() {
		return lastNameEdit;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
}
