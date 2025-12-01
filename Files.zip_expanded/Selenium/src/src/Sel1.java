package src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Sel1 {
	public static void main(String[] args) 
	{		
		  WebDriver driver = new EdgeDriver();
		  driver.get("https://iwanttss.com");
		  driver.getTitle();
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl());
		 
		} 		
	}
	

