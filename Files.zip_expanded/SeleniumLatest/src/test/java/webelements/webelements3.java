package webelements;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v127.indexeddb.model.Key;
import org.openqa.selenium.edge.EdgeDriver;

public class webelements3 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		String txt=driver.findElement(By.className("Pke_EE")).getAttribute("title");
		System.out.println(txt);
		String txt1="Search for Products, Brands and More";
		if(txt.equals(txt1))
		{
			System.out.println("Defaut text is displayed in the flipkart website");
		}
		else
			System.err.println("Defaut text is not displayed in the flipkart website");
}
}
