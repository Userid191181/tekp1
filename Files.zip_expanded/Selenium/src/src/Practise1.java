package src;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Practise1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Hari Prasad");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("nnn@bbb@gmail.com");
		driver.findElement(By.cssSelector("input[id='exampleInputPassword1']")).sendKeys("Abcdef123!");
		driver.findElement(By.id("exampleCheck1")).click();
		driver.findElement(By.id("exampleFormControlSelect1")).sendKeys("Fem");
		
		WebElement dd=driver.findElement(By.id("exampleFormControlSelect1"));
		Select dd1=new Select(dd);
		dd1.selectByIndex(1);
		driver.findElement(By.name("bday")).sendKeys("19111981");
		driver.findElement(By.cssSelector("input[class='btn btn-success']")).click();		
		//System.out.println(driver.findElement(By.partialLinkText("alert-dismissible")));
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
				
	}

}
