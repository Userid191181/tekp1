package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().window().minimize();
	driver.get("https://facebook.com/");
	Dimension size=driver.manage().window().getSize();
	System.out.println(size);
	System.out.println(size.getHeight());
	System.out.println(size.getWidth());	
	
	driver.manage().window().setSize(new Dimension (300,300));
	System.out.println(size);
	
	//get position
	Point position=driver.manage().window().getPosition();
	System.out.println(position);
	System.out.println("X cordinate=" +position.getX());
	System.out.println("X cordinate=" +position.getY());
	
	//set position
	driver.manage().window().setPosition(new Point(500,900));
	Point position1=driver.manage().window().getPosition();
	System.out.println(position);
	System.out.println("X cordinate=" +position1.getX());
	System.out.println("X cordinate=" +position1.getY());
	driver.manage().window().fullscreen();	
}
}