package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProductPage {
	WebDriver driver;

	public AddProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "product:name")
	private WebElement productname;

	@FindBy(id = "product:price")
	private WebElement productprice;

	@FindBy(id = "product:unit")
	private WebElement productunit;

	@FindBy(id = "product:category")
	private WebElement productcategory;

	@FindBy(xpath = "(//input[@type='radio'])[1]")
	private WebElement stkmgmtenable;

	@FindBy(xpath = "(//input[@type='radio'])[2]")
	private WebElement stkmgmtdisble;

	@FindBy(id = "product:description")
	private WebElement prodescription;

	@FindBy(xpath = "//input[@value='Add Product']")
	private WebElement addProbtn;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getProductname() {
		return productname;
	}

	public WebElement getProductprice() {
		return productprice;
	}

	public WebElement getProductunit() {
		return productunit;
	}

	public WebElement getProductcategory() {
		return productcategory;
	}

	public WebElement getStkmgmtenable() {
		return stkmgmtenable;
	}

	public WebElement getStkmgmtdisble() {
		return stkmgmtdisble;
	}

	public WebElement getProdescription() {
		return prodescription;
	}

	public WebElement getAddProbtn() {
		return addProbtn;
	}

}
