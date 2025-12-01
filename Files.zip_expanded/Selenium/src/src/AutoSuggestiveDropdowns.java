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

public class AutoSuggestiveDropdowns {

	public static void main(String[] args) throws InterruptedException {		
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicitly waits for 5 seconds
	driver.navigate().to(("https://rahulshettyacademy.com/dropdownsPractise/"));
	driver.findElement(By.id("autosuggest")).sendKeys("In");
	Thread.sleep(2000);
	List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	for (int i = 0; i < options.size(); i++) {
	    WebElement option = options.get(i);
	    if (option.getText().equalsIgnoreCase("India")) {
	        option.click();
	    }
	}
	System.out.println(driver.findElement(By.id("autosuggest")).getText());
		
	}
}

