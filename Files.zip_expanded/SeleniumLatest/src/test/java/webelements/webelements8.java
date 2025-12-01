package webelements;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v127.indexeddb.model.Key;
import org.openqa.selenium.edge.EdgeDriver;

public class webelements8 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.amazon.in/");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("puma");
		Thread.sleep(5000);
		 List<WebElement> ele = driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));

		System.out.println(ele.size());
		for(int i=0; i<ele.size(); i++)
		{
			WebElement a=ele.get(i);
			System.out.println(a.getText());
		}
		
		
//		for(WebElement e :ele)
//		{
//			System.out.println(e.getText());
//		}
//		
	//ul[@class='ngVsM u4RcUd']/li
		//ul[@class='G43f7e']/li

}
}