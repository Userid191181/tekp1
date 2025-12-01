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

public class webelements9 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.get("https://www.amazon.in/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("")).sendKeys("");
	Thread.sleep(5000);
	List<WebElement> ele = driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
	
}
}
