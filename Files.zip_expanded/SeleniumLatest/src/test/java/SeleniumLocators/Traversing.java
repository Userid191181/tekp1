package SeleniumLocators;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//Day18- 22nd July:
public class Traversing {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.amazon.in/");
	driver.navigate().back();
	Thread.sleep(3000);
	//driver.navigate().forward();
	driver.manage().window().maximize();
//	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("xiaomi 15");
//	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
//	String str=driver.findElement(By.xpath("//div[contains(text(), 'REDMI 9 Activ (Coral Green, 64 GB)')]/../div/span[2]/span[1]")).getText();
//	System.out.println(str);	
	
//	String str=driver.findElement(By.xpath("//div[contains(text(), 'REDMI 9 Activ (Coral Green, 64 GB)')]/../..//div/div/div[1]/div")).getText();
//	System.out.println(str);	

	String str=driver.findElement(By.xpath("//span[contains(text(),'Xiaomi 15 (White, 12GB/512GB)| 50 MP Leica Triple Camera')]/../../../..//span[@class='a-price-whole']")).getText();
	System.out.println(str);	

	//3210 4G | All-New Classic Keypad Phone with Dual SIM, YouTube, Scan &amp; Pay UPI, Rear Camera, Wireless FM Radio, MP3 Player, Bluetooth &amp; USB Type C | Grunge Black
	}

}





	
