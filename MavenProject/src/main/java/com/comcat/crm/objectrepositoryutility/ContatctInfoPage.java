package com.comcat.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContatctInfoPage {
	
	WebDriver driver;
	public ContatctInfoPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement headerContactname;
	
	@FindBy(xpath="//td[normalize-space(text())='Organization Name']/following-sibling::td[@class='dvtCellInfo' and @id='mouseArea_Organization Name']")
	private WebElement actOrgnameAfterSave;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getActOrgnameAfterSave() {
		return actOrgnameAfterSave;
	}

	public WebElement getHeaderContactname() {
		return headerContactname;
	}

	public WebElement getLastNameAfterSave() {
		return lastNameAfterSave;
	}

	@FindBy(xpath="//span[@id='dtlview_Last Name']")
	private WebElement lastNameAfterSave;

}
