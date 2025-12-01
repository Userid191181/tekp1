package webelements;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise {
public static void main(String[] args) {
	
//	6.	getSize(): gets the height and width of the component as an output.
//	7.	getLocation(): gets the location of the component, return type is Point.
//	8.	getRect(): capture the size and location of a WebElement. Return type is Rectangle [class in selenium]
//	9.	getCssvalue: gets the Css value i.e font-family (it gives the font name, font size of the element).
//	10.	Clear(): this removes the text from text field.
//	11.	getText(): it gets the text in the field.
//	12.	getTagName(): it will get the element HTML TagName as output, return type is String. IT get ‘a’ from the below Example.
//	13.	getAttribute():it will get the Attributevalue of the component as output, return type is String. IT gets “abc” for the Attribute ‘id’.
//	Ex:<a href=”sdfsdf.com” id=’abc’ >
//	14.	getAriaRole(): display the type of element in a webpage as output. Like, example Link or button or Text field and so on.

	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Dimension ele = driver.findElement(By.cssSelector("img[title='Flipkart']")).getSize();
	System.out.println(ele);
	Point ele1 = driver.findElement(By.xpath("//input[contains(@title,'Search for Products')]")).getLocation();
	System.out.println(ele1);
	Rectangle ele2 = driver.findElement(By.xpath("//input[contains(@title,'Search for Products')]")).getRect();
	System.out.println(ele2);
	Object ele3 = driver.findElement(By.cssSelector("img[title='Flipkart']")).getCssValue("font");
	System.out.println(ele3);
	@Nullable
	String ele4 = driver.findElement(By.cssSelector("img[title='Flipkart']")).getAttribute("width");
	System.out.println(ele4);
	


}
	
}
