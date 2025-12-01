package com.comcat.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInfoPage {
	WebDriver driver;
	public OrganizationInfoPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement orgheaderinfo;
	
	@FindBy(xpath="//span[@id='dtlview_Organization Name']")
	private WebElement actOrgAfterSave;

	@FindBy(xpath="//span[@id='dtlview_Industry']")
	private WebElement actIndAfterSave;

	@FindBy(xpath="//span[@id='dtlview_Type']")
	private WebElement actTypeAfterSave;
	
	@FindBy(xpath="//span[@id='dtlview_Phone']")
	private WebElement actPhoneAfterSave;
	
	public WebElement getActIndAfterSave() {
		return actIndAfterSave;
	}

	public WebElement getActTypeAfterSave() {
		return actTypeAfterSave;
	}

	public WebElement getActOrgAfterSave() {
		return actOrgAfterSave;
	}

	public WebElement getOrgheaderinfo() {
		return orgheaderinfo;
	}

	public WebElement getActPhoneAfterSave() {
		return actPhoneAfterSave;
	}
	
	
	
	
}
