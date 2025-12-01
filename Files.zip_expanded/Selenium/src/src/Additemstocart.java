package src;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Additemstocart {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();

		String [] itemsNeeded= {"Brocolli", "Cucumber", "Beetroot"}; 
		//declaring Array to iterate and make the selection using for loop
		//check whether name extracted is present in arraylist or not
		//convert itemsNeeded in to ArrayList b.coz it has contains.
		//converting the Array to ArrayList
		
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> Products=driver.findElements(By.cssSelector("h4.product-name")); 
	//storing all the "product-name" elements to Products variable using return type which is WebElement and we are receiving the list of the vegetables to need to store in List.
		
		for(int i=0;i<Products.size();i++) //iterating the contents in Productvariable
		{
			//format to get actual vegetable name
			//we need to trim the blank space also
			String[] name=Products.get(i).getText().split("-");         //getting text of all the Products in Veggie variable
			String formattedname=name[0].trim();
			List itemsfinalised = Arrays.asList(itemsNeeded);
			int count=0;
			if(itemsfinalised.contains(formattedname)) //matching the cucumber and getting in to if condition
			{
				count++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click(); //clicking on ADD to Cart by matching the xpathfor the matched product
				if(count==3)
					break;
			}
		}
	}

}
