

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SCMLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./sw\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://49.249.28.218:8081/TestServer/Build/Supply_Management_System/");
		driver.findElement(By.id("login:username")).sendKeys("admin");
		driver.findElement(By.id("login:password")).sendKeys("admin123");
		
		WebElement ele=driver.findElement(By.id("login:type"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("Admin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
