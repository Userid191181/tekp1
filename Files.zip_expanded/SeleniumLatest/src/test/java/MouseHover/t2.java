package MouseHover;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v127.indexeddb.model.Key;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class t2 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
	WebElement drag=driver.findElement(By.id("draggable"));
	WebElement drop = driver.findElement(By.id("droppable"));
	Actions a=new Actions(driver);
	a.dragAndDrop(drag, drop).perform();

	

	
//	driver.get("https://www.facebook.com/");
//	WebElement ele=driver.findElement(By.id("email"));	
//	Actions a=new Actions(driver);	
//	a.keyDown(Keys.SHIFT).perform();
//	a.sendKeys(ele,"n").perform();
//	a.keyUp(Keys.SHIFT).perform();
//	a.sendKeys(ele,"a").perform();
//	a.keyDown(Keys.SHIFT).perform();
//	a.sendKeys(ele,"r").perform();
//	a.keyUp(Keys.SHIFT).perform();
//	a.sendKeys(ele,"e").perform();
//	a.keyDown(Keys.SHIFT).perform();
//	a.sendKeys(ele,"s").perform();
//	a.keyUp(Keys.SHIFT).perform();
//	a.sendKeys(ele,"h").perform();
}
}
