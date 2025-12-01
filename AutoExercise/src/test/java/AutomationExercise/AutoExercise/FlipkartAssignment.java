package AutomationExercise.AutoExercise;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FlipkartAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("lgtv");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//WebElement drag = driver.findElement(By.xpath("//div[@class='PYKUdo']"));
		WebElement drag = driver.findElement(By.xpath("//div[@style='transform: translateX(0px);']")); 
		WebElement drop = driver.findElement(By.xpath("(//div[@style='width: 39.4683px;'])[3]"));		
		Actions a=new Actions(driver);
		a.clickAndHold(drag).perform();
		a.release(drop).perform();
		
		//a.dragAndDrop(drag, drop).perform();
		
//		WebElement startRange=driver.findElement(By.xpath("(//select[@class='Gn+jFg'])[1]"));
//		Select sel=new Select(startRange);
//		sel.selectByVisibleText("₹30000");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("(//div[@class='DOjaWF gdgoEp']/div)[4]//descendant::a[@class='CGtC98']")).click();
//		Thread.sleep(3000);	
		
//		Set<String> p=driver.getWindowHandles();
//		Iterator<String>  ll=p.iterator();
//		while(ll.hasNext())
//		{
//			String kl=ll.next();
//			driver.switchTo().window(kl);
//		}		
//		
//		String tvAmt=driver.findElement(By.xpath("//div[@class='hl05eU']/div")).getText();
//		System.out.println("Price of the TV is: " +tvAmt);
//		Thread.sleep(5000);
//		String description=driver.findElement(By.xpath("//div[@class='_4gvKMe']/div/p")).getText();
//		System.out.println("Description of TV is: " +description);
//		driver.quit();
		
	}
}
