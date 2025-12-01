package webelements;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v127.indexeddb.model.Key;
import org.openqa.selenium.edge.EdgeDriver;


public class webelements5 {

		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");			
			WebElement sss = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));					
			Dimension size= sss.getSize();
			 System.out.println("Width: " + size.getWidth());
		     System.out.println("Height: " + size.getHeight());
			
			
			
			
//			driver.manage().window().maximize();
//			 List<WebElement> ele = driver.findElements(By.tagName("img"));
//			 
//			
//			for(WebElement imgText: ele)
//			{
//				String imgtxt = imgText.getAttribute("alt");
//				System.out.println(imgtxt);
//			}
			
//			 String ff = driver.findElement(By.xpath("//img[@class='_2puWtW _3a3qyb']")).getText();
//			 System.out.println(ff);
}
}