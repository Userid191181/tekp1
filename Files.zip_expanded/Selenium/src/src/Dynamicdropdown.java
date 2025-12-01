package src;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dynamicdropdown {
	public static void main(String[] args) throws InterruptedException {		
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicitly waits for 5 seconds
	driver.navigate().to(("https://rahulshettyacademy.com/dropdownsPractise/"));
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	//Here the second dropdown populates only when the first dropdown is selected
	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA']")).click(); //parent->child traversing
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();//second dropdown.parent->child traversing index notrequired
	
	}
}
