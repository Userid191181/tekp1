package com.comcat.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationHomePage {
	WebDriver driver;
	public OrganizationHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath="//img[@title='Create Organization...']")
	WebElement createOrganizationBtn;

	public WebElement getCreateOrganizationBtn() {
		return createOrganizationBtn;
	}

}
