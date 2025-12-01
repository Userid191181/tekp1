package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Add Products']")
	private WebElement addProducts;

	@FindBy(xpath = "//a[text()='Add Retailers']")
	private WebElement addRetailers;

	@FindBy(xpath = "//a[text()='Add Manufacturer']")
	private WebElement addManufacturer;

	@FindBy(xpath = "//a[text()='Add Distributor']")
	private WebElement addDistributor;

	@FindBy(xpath = "//a[text()='Manage Unit']")
	private WebElement manageUnit;

	@FindBy(xpath = "//a[text()='Manage Category']")
	private WebElement manageCategory;

	@FindBy(xpath = "//a[text()='Manage Area']")
	private WebElement manageArea;

	@FindBy(xpath = "//a[text()='Change Password']")
	private WebElement changePassword;

	@FindBy(xpath = "//a[text()='Home']")
	private WebElement home;

	@FindBy(xpath = "//input[@value='Add Retailer']")
	private WebElement retailers;

	@FindBy(xpath = "//a[text()='Manufacturers']")
	private WebElement manufacturers;

	@FindBy(xpath = "//a[text()='Distributors']")
	private WebElement distributors;

	@FindBy(xpath = "//a[text()='Products']")
	private WebElement products;

	@FindBy(xpath = "//a[text()='Orders']")
	private WebElement orders;

	@FindBy(xpath = "//a[text()='Invoice']")
	private WebElement invoice;

	@FindBy(xpath = "//input[@class='submit_button']")
	private WebElement logoutbtn;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getAddProducts() {
		return addProducts;
	}

	public WebElement getAddRetailers() {
		return addRetailers;
	}

	public WebElement getAddManufacturer() {
		return addManufacturer;
	}

	public WebElement getAddDistributor() {
		return addDistributor;
	}

	public WebElement getManageUnit() {
		return manageUnit;
	}

	public WebElement getManageCategory() {
		return manageCategory;
	}

	public WebElement getManageArea() {
		return manageArea;
	}

	public WebElement getChangePassword() {
		return changePassword;
	}

	public WebElement getHome() {
		return home;
	}

	public WebElement getRetailers() {
		return retailers;
	}

	public WebElement getManufacturers() {
		return manufacturers;
	}

	public WebElement getDistributors() {
		return distributors;
	}

	public WebElement getProducts() {
		return products;
	}

	public WebElement getOrders() {
		return orders;
	}

	public WebElement getInvoice() {
		return invoice;
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}

}
