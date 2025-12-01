package MouseHover;

import java.awt.AWTException;
import java.awt.Robot;
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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class t3 {
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.manage().window().maximize();
	WebElement f=driver.findElement(By.xpath("//a[@aria-label='Menu. more. has sub menu']"));

	
	 
	
	
//	Actions a= new Actions(driver);
//	a.moveToElement(f).perform();
//	Thread.sleep(5000);
//	WebElement c=driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]"));
//	a.moveToElement(f).click().build().perform();
//	
	
	
	//contextClick() : mouse rightclick.
	//WebElement ele1=driver.findElement(By.xpath("(//a[contains(text(),'Gift')])[1]"));
	//a.contextClick(ele1).perform();
	

	
}
}
