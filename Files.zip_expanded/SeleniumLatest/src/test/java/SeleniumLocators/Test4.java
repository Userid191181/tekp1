package SeleniumLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test4 {
public static void main(String[] args) {	
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
	String str=driver.getTitle();
	String actualTitle="OrangeHRM";
	if(str.equals(actualTitle))
	{
		System.out.println("Orange website is successfully opened");
	}
	else
	{
		System.out.println("Orange website is not opened");
	}
	}
}
