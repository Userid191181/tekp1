package SeleniumLocators;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v127.indexeddb.model.Key;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatrosPractise {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("Pke_EE")).sendKeys("REDMI 9 Activ (Coral Green, 64 GB)");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		String s=driver.findElement(By.xpath("//div[text()='REDMI 9 Activ (Coral Green, 64 GB)']/../..//div[@class='Nx9bqj _4b5DiR']")).getText();
		
		System.out.println(s);
		
	}

}
