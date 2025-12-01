package Popup;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://the-internet.herokuapp.com/upload");
//		WebElement ele=driver.findElement(By.id("file-upload"));
//		ele.sendKeys("C:\\OLDDATA\\Pendrive_NareshResume\\Sharana\\Sharana\\DummyFolder\\Dummyfile.txt");
//		driver.findElement(By.xpath("//input[@value='Upload']")).click();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		List<WebElement> ele=driver.findElements(By.tagName("a"));
//		for(WebElement e : ele)
//		{
//			System.out.println(e.getText());
//		}
		for(int i=0; i<ele.size(); i++)
		{
			WebElement r=ele.get(i);			
			System.out.println(r.getText());
		}
		
	}

}
