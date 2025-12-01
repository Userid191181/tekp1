package SupplyChainMgmtScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(3000);		
		
		List<WebElement> tablePagenum = driver.findElements(By.xpath("//ul[@id='pagination']/li"));				

		for (int i = 0; i <tablePagenum.size(); i++) {
		    WebElement page = tablePagenum.get(i);
		    page.click();
		    Thread.sleep(1000);
		    List<WebElement> tablerowtext = driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr/td[2]"));
		    for (int j = 0; j < tablerowtext.size(); j++) {
		        WebElement rowtext = tablerowtext.get(j);
		        String text = rowtext.getText();

		        if (text.equals("Router")) {
		            driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr[2]/td[4]/input")).click();
		            break;
		        }
		        
		    }
		}


	}

}
