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

public class Alerts {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		String name = "Hari";
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.name("enter-name")).sendKeys(name);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println((driver.switchTo().alert().getText()));
		driver.switchTo().alert().accept(); // we are switching from driver mode to Alert mode by switchTo() method. and
											// clicking on OK button with accept() method
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println((driver.switchTo().alert().getText()));
		driver.switchTo().alert().dismiss();// we are switching from driver mode to Alert mode by switchTo() method. and
											// clicking on Cancel button with dismiss() method
	}
}
