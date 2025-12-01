package webelements;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practise4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.fatcowhosting.com/");
		WebElement mmm=driver.findElement(By.xpath("//a[@class='mainnav' and @ href='/fatcow/fatcow.bml?ref=tn']"));
		
		Actions f=new Actions(driver);
		
		f.moveToElement(mmm).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@href='/fatcow/about.bml'])[1]")).click();
		
	}

}
