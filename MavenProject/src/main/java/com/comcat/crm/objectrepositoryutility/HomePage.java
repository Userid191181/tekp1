package com.comcat.crm.objectrepositoryutility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath = "//a[@href='index.php?module=Accounts&action=index' and text()='Organizations']")
	private WebElement organizationsLink;
	
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contactsLink;
	
	@FindBy(xpath = "//a[@href='index.php?module=Products&action=index' and text()='Products']")
	private WebElement productsLink;
	
	@FindBy(xpath="//table[@class='hdrTabBg']//a[text()='More']")
	private WebElement moreLink;
	
	@FindBy(name="Campaigns")
	private WebElement campaignsLink;

	
	public WebElement getOrganizationsLink() {
		return organizationsLink;
	}

	public WebElement getContactsLink() {
		return contactsLink;
	}

	public WebElement getProductsLink() {
		return productsLink;
	}

	public WebElement getMoreLink() {
		return moreLink;
	}

	public WebElement getCampaignsLink() {
		return campaignsLink;
	}
	
	//Business logic to click on CampaignLink
	public void clickOnCampaignLink()
	{
		moreLink.click();
		campaignsLink.click();
	}
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement signOutbtn;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSignOutbtn() {
		return signOutbtn;
	}

	public void logout()
	{
		signOutbtn.click();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}
}