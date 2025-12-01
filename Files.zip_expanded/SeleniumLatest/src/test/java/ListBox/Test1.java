package ListBox;
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
import org.openqa.selenium.support.ui.Select;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='birthday_year']"));
			
		
		Select dd=new Select(dropdown);

		List<WebElement> pp=dd.getOptions();
		
		for(WebElement p:pp)
		{
			System.out.println(p.getText());
		}

		
		
		
		
//		WebElement dropdown1 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
//		Select dd1=new Select(dropdown1);
//		dd1.selectByIndex(2);
//		
//		WebElement dropdown2 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
//		Select dd2=new Select(dropdown2);
//		dd2.selectByVisibleText("2000");
		
		
	
}
}