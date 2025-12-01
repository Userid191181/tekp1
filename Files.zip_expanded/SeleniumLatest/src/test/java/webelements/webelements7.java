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
//getting the link name for tagname "a"in google.com and printing it using findWebelements
public class webelements7 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		List<WebElement> ele = driver.findElements(By.tagName("a"));
		System.out.println(ele.size());
		
		
		for(int a=0; a<ele.size(); a++)
		{
			System.out.println(ele);
		}
		
//		for(Object e : ele)
//		{
//			System.out.println(e);
//		}
	}


}
