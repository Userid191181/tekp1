package webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Autosuggestions
public class Practise2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys("puma");
	Thread.sleep(2000);
	List<WebElement> ele=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
	Thread.sleep(3000);
	System.out.println((ele.size()));
	Thread.sleep(3000);
	String s="puma india";
	Thread.sleep(3000);
	for(int i=0; i<ele.size(); i++)
	{
		WebElement n=ele.get(i);
		System.out.println(n.getText());
		Thread.sleep(1000);
		if(s.equals(n.getText()))
		{
			n.click();
			break;
		}
	}		
	
	
	
}
}
