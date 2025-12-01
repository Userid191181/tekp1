package ListBox;
//display P  W   L   and PTS points as an output for haryana stealers as output
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

public class ProKabsStandings {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.prokabaddi.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='https://www.prokabaddi.com/standings']")).click();	
		String Team=driver.findElement(By.xpath("//p[text()='Haryana Steelers']")).getText();
		String Points=driver.findElement(By.xpath("//p[text()='Haryana Steelers']/../../../..//div[@class='table-data matches-play']")).getText();
		String Won=driver.findElement(By.xpath("//p[text()='Haryana Steelers']/../../../..//div[@class='table-data matches-won']")).getText();
		String Lost=driver.findElement(By.xpath("//p[text()='Haryana Steelers']/../../../..//div[@class='table-data matches-lost']")).getText();
		String PTS=driver.findElement(By.xpath("//p[text()='Haryana Steelers']/../../../..//div[@class='table-data points']//p")).getText();
		System.out.println("Team is "+Team);
		System.out.println("Points is "+Points);
		System.out.println("Matches Won are " +Won);
		System.out.println("Matches lost are " +Lost);
		System.out.println("Total points are " +PTS);
		
		
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com/");
//		driver.manage().window().maximize();
//		List<WebElement> gg = driver.findElements(By.tagName("a"));
//		for(WebElement g : gg)
//		{
//			String h = g.getText();
//			System.out.println(h);
//		}
	}

}
