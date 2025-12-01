package Popup;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Calendarpopup1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert a1=driver.switchTo().alert();
		System.out.println((a1.getText()));
		a1.dismiss();
		
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert a2=driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println((a2.getText()));
		a2.sendKeys("Testing only");
		Thread.sleep(3000);
	}

}
