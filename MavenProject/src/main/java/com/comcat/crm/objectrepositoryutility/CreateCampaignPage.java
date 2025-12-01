package com.comcat.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignPage {
	
	WebDriver driver;
	public CreateCampaignPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="campaignname")
	private WebElement campaignEdit;
	
	@FindBy(name="campaigntype")
	private WebElement campaigntypeListbox;

	@FindBy(name="campaignstatus")
	private WebElement campaignstatusListbox;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveBtn;

	@FindBy(name="closingdate")
	private WebElement expClosedate;
	
	public WebElement getExpClosedate() {
		return expClosedate;
	}
	
	public WebElement getCampaignEdit() {
		return campaignEdit;
	}

	public WebElement getCampaigntypeListbox() {
		return campaigntypeListbox;
	}

	public WebElement getCampaignstatusListbox() {
		return campaignstatusListbox;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	
}
