package com.comcat.crm.objectrepositoryutility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationTabPageInContact {
	WebDriver driver;
	public OrganizationTabPageInContact(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="search_txt")
	private WebElement orgsearchtxtBox;
	
	@FindBy(name="search")
	private WebElement serchBtn;
	
	@FindBy(xpath="//a[@href='javascript:window.close();']")
	private WebElement orgNameTab;


	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getOrgNameTab() {
		return orgNameTab;
	}

	public WebElement getOrgsearchtxtBox() {
		return orgsearchtxtBox;
	}

	public WebElement getSerchBtn() {
		return serchBtn;
	}
	
	
}
