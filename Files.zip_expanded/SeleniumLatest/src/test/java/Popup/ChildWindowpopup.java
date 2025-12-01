package Popup;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ChildWindowpopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://www.naukri.com/"); 
		driver.findElement(By.id("login_Layer")).click(); 
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//span[text()='Sign in with Google']")).click(); 		
		Thread.sleep(3000); 
		Set<String> s = driver.getWindowHandles(); 
		Iterator<String> itr = s.iterator(); 
		while(itr.hasNext()) 
		{ 
		String refid = itr.next(); 
		driver.switchTo().window(refid); 
		System.out.println(driver.getTitle()); 
		} 
		driver.quit();



	}

}
