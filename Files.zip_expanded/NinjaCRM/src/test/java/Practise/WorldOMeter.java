package Practise;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WorldOMeter {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.bigbasket.com/");
		driver.findElement(By.xpath("//div[@class='grid grid-flow-col place-content-start gap-x-6 lg:py-1 xl:pb-2 xl:pt-3']//div[@class='relative h-full']")).click();
		List<WebElement> ele=driver.findElements(By.xpath("//div[@class='grid grid-flow-col place-content-start gap-x-6 lg:py-1 xl:pb-2 xl:pt-3']//div[@class='relative h-full']//ul[@class='jsx-1259984711 w-56 px-2.5 bg-darkOnyx-800 text-silverSurfer-100 rounded-l-xs max-h-120 overflow-y-auto scroll-smooth']"));
		System.out.println(ele.size());
		
		for (int i = 0; i < ele.size(); i++) {
		    WebElement e = ele.get(i);
		    String m = e.getText();
		    System.out.println(m);
		   Actions a=new Actions(driver);
		   WebElement ele1=driver.findElement(By.xpath("(//ul[@class='jsx-1259984711 w-56 px-2.5 bg-silverSurfer-200 text-darkOnyx-800 max-h-120 overflow-y-auto scroll-smooth'])[1]"));
		   	a.moveToElement(ele1).perform();
//		   		for(WebElement e1:ele1)
//		   		{
//		   			
//		   		}
		
		
		
		
		
		
		
		
		
		}
		
	
	}

}
