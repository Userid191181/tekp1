package com.comcat.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignInfoPage {
	
	WebDriver driver;
	public CampaignInfoPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement campaignHeaderInfo;
	
	@FindBy(xpath="//span[@id='dtlview_Campaign Name']")
	private WebElement campaignNameAfterSave;

	@FindBy(xpath="//span[@id='dtlview_Campaign Type']")
	private WebElement campaignTypeAfterSave;
	
	@FindBy(xpath="//span[@id='dtlview_Campaign Status']")
	private WebElement campaignStatusAfterSave;

	public WebElement getCampaignHeaderInfo() {
		return campaignHeaderInfo;
	}

	public WebElement getCampaignNameAfterSave() {
		return campaignNameAfterSave;
	}

	public WebElement getCampaignTypeAfterSave() {
		return campaignTypeAfterSave;
	}

	public WebElement getCampaignStatusAfterSave() {
		return campaignStatusAfterSave;
	}
	
}
