package SeleniumLocators;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("input[name='email']")).sendKeys("9379845225");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("FaceBook191181!");
	driver.findElement(By.cssSelector("button[name='login']")).click();
	
	String s1="base";
	String s2="sabe";

	char[] c1=s1.toCharArray();
	char[] c2=s2.toCharArray();
	
		Arrays.sort(c1);
		Arrays.sort(c2);

		if(c1.equals(c2))
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("no tanagram");
		}

	
	
	
}
}
