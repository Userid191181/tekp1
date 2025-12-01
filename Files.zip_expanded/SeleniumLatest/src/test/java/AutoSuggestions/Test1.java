package AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();   

		driver.get("https://www.google.com/");   
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");   
		Thread.sleep(3000);   
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));   
		System.out.println(list.size());
		
//		for(int i=0; i<list.size(); i++)
//		{
//			WebElement dd = list.get(i);
//			System.out.println(dd.getText());
//		}
		
		for(WebElement i : list)
		{
			System.out.println(i.getText());
		}

	}

}
