package ListBox;

//Assignment : display all the options Text as an output in Alphabetical order in Facebook month field
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
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
public class SortDDinAlpahbOrder {

	public static void main(String[] args) {
		//Ques: WATS to display all the options Text as an output in Alphabetical order in Facebook month field
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();		
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Select dd=new Select (dropdown);
		List<WebElement> pp=dd.getOptions();
		
//		for(WebElement p:pp)
//		{
//			System.out.println(p.getText());
//		}
		
		List<String> ml = new ArrayList<>();
		for(WebElement p:pp)
		{			
			ml.add(p.getText());
		}
		
		Collections.sort(ml);
		
		for(String m:ml)
		{
			System.out.println(m);
		}
		
	}

}
