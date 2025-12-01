package ListBox;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Test2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	WebElement ele=driver.findElement(By.name("birthday_day"));
	Select s=new Select(ele);
	s.selectByIndex(4);
	
	WebElement ele1=driver.findElement(By.name("birthday_month"));
	Select s1=new Select(ele1);
	s1.selectByValue("5");
	
	WebElement ele2=driver.findElement(By.name("birthday_year"));
	Select s2=new Select(ele2);
	s2.selectByVisibleText("1981");
}
}
