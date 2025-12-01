package SeleniumLocators;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Webelement1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("//input[@value='1']")).click();
		boolean el=driver.findElement(By.xpath("//input[@value='1']")).isSelected();
		if(el)
		{
			System.out.println("FeMale gender is selected and working fine as expecetd");
		}
		else
		{
			System.out.println("FeMale gender is NOT selected");
		}
		driver.findElement(By.xpath("//input[@value='2']")).click();
		boolean ele=driver.findElement(By.xpath("//input[@value='1']")).isSelected();
		if(!ele)
		{
			System.out.println("Female gender NOT selecetd which is expected");
		}
		else
		{
			System.out.println("Female gender should is selected which is wrong");
		}
		
		boolean eleM=driver.findElement(By.xpath("//input[@value='2']")).isSelected();				
		
		
		if(eleM)
		{
			System.out.println("Male gender is selected and working fine as expecetd");
		}
		else
		{
			System.out.println("Male gender is NOT selected");
		}
		
		
		
		//WATS to perform the below:
				//open browser
				//navigate to facebook app
				//select gender option and verify wether it is selected or not.
				//select other option and verify wheter previous option is deselecetd and selectd option is highlightd or not.
}
}