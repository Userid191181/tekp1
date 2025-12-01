package webelements;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise3 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/OLDDATA/BackUPCDrive/SELENIUM/QSpider-Selenium/table.html");
	List<WebElement> ele=driver.findElements(By.xpath("//tr/td[3]"));
	int sum=0;
	
	for(int i=0; i<ele.size()-1; i++)
	{
		WebElement a=ele.get(i);
		int b=Integer.parseInt(a.getText());
		sum=sum+b;
	}
	WebElement j=driver.findElement(By.xpath("//tr[7]/td[3]"));
	
	int l=Integer.parseInt(j.getText());
	
	if(l==sum)
	{
		System.out.println("yes");
	}
	
}
}
