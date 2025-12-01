package ListBox;
//Assignment : display players name with Runs as output in http://cricbuzz.com
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
public class CricPlayerRunsDisplay {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//img[@class='cb-view-all-ga']")).click();	
		driver.findElement(By.xpath("//div[text()='India A Women need 79 runs in 75 balls']")).click();
		driver.findElement(By.xpath("//a[text()='Scorecard']")).click();	
		List<WebElement> bb = driver.findElements(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[1]//a[@class='cb-text-link']"));
		List<WebElement> rr = driver.findElements(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[1]//a[@class='cb-text-link']/../..//div[@class='cb-col cb-col-8 text-right text-bold']"));
				
		System.out.println(bb.size());
		
		for (int i = 0; i <= bb.size()-1; i++) {
		    String name = bb.get(i).getText();
		    String runs = rr.get(i).getText();
		    System.out.println(name + " : " + runs);
		}
	}

}