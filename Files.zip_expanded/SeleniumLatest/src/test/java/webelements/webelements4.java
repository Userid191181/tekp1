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
public class webelements4 {

		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			List<WebElement> ele = driver.findElements(By.tagName("a"));
			
			for(WebElement link : ele)
			{
				String linkText=link.getAttribute("href");
				System.out.println(linkText);
			}
			

	}

}
