package POMClasses;

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
	
	@FindBy(name="campaignName")
	private WebElement campaignname;
	
	@FindBy(name="campaignStatus")
	private WebElement campaignstatus;
	
	@FindBy(name="targetSize")
	private WebElement targetsize;
	
	@FindBy(name="expectedCloseDate")
	private WebElement expectedCloseDate;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement createCampaignbtn;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCampaignname() {
		return campaignname;
	}

	public WebElement getCampaignstatus() {
		return campaignstatus;
	}

	public WebElement getTargetsize() {
		return targetsize;
	}

	public WebElement getExpectedCloseDate() {
		return expectedCloseDate;
	}

	public WebElement getCreateCampaignbtn() {
		return createCampaignbtn;
	}
	
	
	
	
}
