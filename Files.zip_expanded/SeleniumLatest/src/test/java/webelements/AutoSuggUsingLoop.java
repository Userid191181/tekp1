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
import org.openqa.selenium.firefox.FirefoxDriver;


//AssignQues: WATS to select any one of Autosuggestion option in google webpage

public class AutoSuggUsingLoop {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.get("https://www.google.com/");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Selenium");
	Thread.sleep(2000);
	List<WebElement> ele=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
	Thread.sleep(2000);
	System.out.println(ele.size());
	Thread.sleep(2000);
	String a="selenium testing";
	
	for(WebElement e : ele)
	{
		String b=e.getText();
		if(a.equals(b))
		{
			e.click();
		}
	}	
}
}
