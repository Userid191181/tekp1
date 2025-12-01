package webelements;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v127.indexeddb.model.Key;
import org.openqa.selenium.edge.EdgeDriver;
//Autosuggestion
//AssignQues: WATS to select any one of Autosuggestion option in google webpage

public class AutoSuggestion {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	Thread.sleep(1000);
	driver.findElement(By.id("autocomplete")).sendKeys("Am");
	Thread.sleep(1000);
	List<WebElement> ele = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
	
	System.out.println(ele.size());
	
	for(int i=0; i<ele.size(); i++)
	{
		WebElement p=ele.get(i);
		System.out.println(p.getText());
	}
	
	Thread.sleep(5000);
	
	
	
	
}
}
