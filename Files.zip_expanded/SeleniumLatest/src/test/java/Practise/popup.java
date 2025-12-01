package Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class popup {

	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.get("https://the-internet.herokuapp.com/upload");
//		WebElement ele = driver.findElement(By.xpath("//input[@id='file-upload']"));
//		ele.sendKeys("C:\\Users\\Naresh\\sssss.txt");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@value='Upload']")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		WebDriverWait l=new WebDriverWait(driver, Duration.ofSeconds(10));
//		l.until(ExpectedCondition.titleContains("Login"));
		
		
		 
		        WebDriver driver = new FirefoxDriver();
		        driver.get("https://www.google.com/");
		        driver.manage().window().maximize();

		        // Create explicit wait object
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		        // Wait for search box to be visible
		        WebElement searchBox = wait.until(
		            ExpectedConditions.visibilityOfElementLocated(By.name("q"))
		        );

		        // Enter text into the search box
		        searchBox.sendKeys("Selenium WebDriver");

		        // Wait for the search button to be clickable
		        WebElement searchBtn = wait.until(
		            ExpectedConditions.elementToBeClickable(By.name("btnK"))
		        );

		        searchBtn.click();


	}

}
