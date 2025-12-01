package webelements;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v127.indexeddb.model.Key;
import org.openqa.selenium.edge.EdgeDriver;

public class weblements6 
{

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("puma");
			List<WebElement> ele = driver.findElements(By.xpath("//div[@class='left-pane-results-container']"));
			System.out.println(ele.size());
			Thread.sleep(3000);
			for (int i = 0; i < ele.size(); i++) {
			    System.out.println(ele.get(i).getText());
			}
			
//			for(int i=0; i<ele.size(); i++)
//			{
//				System.out.println(ele);
//				
//			}
}
}
