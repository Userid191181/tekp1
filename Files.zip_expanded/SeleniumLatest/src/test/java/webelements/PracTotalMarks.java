package webelements;

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

public class PracTotalMarks {
	public static void main(String[] args) {	
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/OLDDATA/BackUPCDrive/SELENIUM/QSpider-Selenium/table.html");
	List<WebElement> ele=driver.findElements(By.xpath("//tr/td[3]"));
	int sum=0;
	
	for(int i=0; i<ele.size()-1;i++)
	{
		WebElement d=ele.get(i);
		int a=Integer.parseInt(d.getText());
		sum=sum+a;
	}
	
	String s=driver.findElement(By.xpath("//tr[7]/td[3]")).getText();
	
	int b=Integer.parseInt(s);
	
	if(sum==b)
	{
	System.out.println("Yes");
	}
	
}
}
