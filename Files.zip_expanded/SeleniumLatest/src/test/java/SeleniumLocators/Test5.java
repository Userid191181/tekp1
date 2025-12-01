package SeleniumLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test5 {
public static void main(String[] args) {
	
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.saucedemo.com/v1/");
	driver.manage().window().maximize();
	
	By un= By.id("user-name");	
	WebElement ele= driver.findElement(un);
	ele.sendKeys("standard_user");
			
			
	By pwd= By.id("password");			
	WebElement ele1= driver.findElement(pwd);
	ele1.sendKeys("secret_sauce");			
					
	
	By button= By.id("login-button");					
	WebElement ele2= driver.findElement(button);
	ele1.click();	
	
}
}
