package com.comcat.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.generic.WebDriverUtility.WebDriverUtility;

public class CreateNewOrganizationPage {
	
	private WebDriver driver;


	public CreateNewOrganizationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="accountname")
	private WebElement orgnameedit;	

	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveBtn;
	
	@FindBy(name="industry")
	private WebElement orgIndustry;

	@FindBy(name="accounttype")
	private WebElement orgType;
	
	@FindBy(id="phone")
	private WebElement orgPhone;
	
	
	public WebElement getOrgnameedit() {
		return orgnameedit;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getOrgIndustry() {
		return orgIndustry;
	}

	public WebElement getOrgType() {
		return orgType;
	}
	
	public WebElement getOrgPhone() {
		return orgPhone;
	}
	
}
