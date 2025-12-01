package SeleniumLocators;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class xpath {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver=new EdgeDriver();
//		driver.get("https://www.actitime.com/free-online-trial");
//		driver.manage().window().maximize();
//		Thread.sleep(5);
//		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Hari");
//		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Ram");
//		Thread.sleep(3);
//		driver.findElement(By.xpath("//input[@id='EmailName']")).sendKeys("Hari.ram@gmail.com.");
//		driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("ABC Company");
		//driver.close();
		//WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(3);
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
//		Thread.sleep(3);
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
//		Thread.sleep(3);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
//		driver.get("https://www.abhibus.com/");
//		Thread.sleep(3);
//		String str=driver.findElement(By.xpath("//span[text()='Login/SignUp']")).getText();
//		System.out.println(str);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3);
		driver.findElement(By.id("email")).sendKeys("abd@1.com");
		driver.findElement(By.id("pass")).sendKeys("pass");
		Thread.sleep(5);
		driver.findElement(By.id("u_0_5_Lq")).click();
		
		 //tagname[text()='text/value']
	}

}
