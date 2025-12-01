package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProductPage {
	WebDriver driver;
	public CreateProductPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy(xpath="//span[text()='Add Product']")
	@FindBy(xpath="//span[text()='Add Product']")
	private WebElement addproduct;
	
	@FindBy(name="productName")
	private WebElement productname;
	
	@FindBy(name="productCategory")
	private WebElement productCategory;
	
	@FindBy(name="quantity")
	private WebElement quantity;
	
	@FindBy(name="price")
	private WebElement price;
	
	@FindBy(name="vendorId")
	private WebElement vendorId;
	
	@FindBy(xpath="//button[text()='Add']")
	private WebElement addproductbtn;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getAddproduct() {
		return addproduct;
	}

	public WebElement getProductname() {
		return productname;
	}

	public WebElement getProductCategory() {
		return productCategory;
	}

	public WebElement getQuantity() {
		return quantity;
	}	
	
	public WebElement getAddproductbtn() {
		return addproductbtn;
	}

	
	public WebElement getPrice() {
		return price;
	}

	public void setPrice(WebElement price) {
		this.price = price;
	}

	public WebElement getVendorId() {
		return vendorId;
	}

		
	
	
}
