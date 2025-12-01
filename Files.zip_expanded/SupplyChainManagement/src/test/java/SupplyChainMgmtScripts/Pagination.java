package SupplyChainMgmtScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {

	private static Object elseif;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(3000);
		
		List<WebElement> rows = driver.findElements(By.xpath("//div[@class='table-container']/table[@id='productTable']/tbody/tr"));

		
		for (int i = 0; i < rows.size(); i++) {		
			
		    List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
		    String productName = cells.get(1).getText();

		    if (productName.equals("Router")) {
		        WebElement checkbox = cells.get(3).findElement(By.tagName("input"));
		        checkbox.click();
		        break;  
		    }
		    	else if(productName.equals("Router")) {
		    	{
		    		driver.findElement(By.xpath("//div[@class='table-container']/ul/li[2]")).click();
		    		
		    		
		    	}
		    		
		}
		
		
		
		
		
		
		
		
		
		
		
		
//		List<WebElement> IDs=driver.findElements(By.xpath("//div[@class='table-container']/table/tbody/tr/td[2]"));
//		//WebElement Checkbox=driver.findElement(By.xpath("//div[@class='table-container']/table/tbody/tr/td/input"));
//		
//		for (int i = 0; i < IDs.size(); i++) {
//		    WebElement d = IDs.get(i);
//		    String name = d.getText();
//		    System.out.println(name);
//				 if(name.equals("Laptop"))
//				 {
//					driver.findElement(By.xpath("//div[@class='table-container']//input")).click();
//				 	//driver.findElement(By.xpath("//div[@class='table-container']/table/tbody/tr/td[2]|//div[@class='table-container']/table/tbody/tr/td[4]/input")).click();
//				 	//Checkbox.click();
//				 }
//		}
				
		
//		driver.findElement(By.xpath("//h2[text()='Pagination Web Table']/../div/div//tbody/tr[3]/td[4]/input")).click();
//		driver.findElement((By.xpath("(//ul)[2]/li[3]/a"))).click();
//		driver.findElement(By.xpath("//h2[text()='Pagination Web Table']/../div/div//tbody/tr[2]/td[4]/input")).click();
				

	}
	}
}
