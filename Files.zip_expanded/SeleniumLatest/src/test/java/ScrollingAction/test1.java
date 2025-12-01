package ScrollingAction;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v127.indexeddb.model.Key;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

//javascriptExecutor

public class test1 {
	public static void main(String[] args) throws InterruptedException {
		//WATS to enter email and pwd and click on login button in FBap using JS
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		//Thread.sleep(3000);
		js.executeScript("document.getElementById('email').value='admin'");
		js.executeScript("document.getElementById('pass').value='password123'");
		
		WebElement g=driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click();",g);
		
	}
	

}
