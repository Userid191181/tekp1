package AutomationExercise.AutoExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddReviewProduct {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),' Products')]")).click();
		Thread.sleep(3000);
		String protitle=driver.getTitle();
		System.out.println(protitle);	
		String exppro="Automation Exercise - All Products";
		WebElement allpro=driver.findElement(By.xpath("//h2[text()='All Products']"));
		if(protitle.equals(exppro) && allpro.isDisplayed())
		{
			System.out.println("Products Page is successfully displayed");			
		}
		else
		{
			System.out.println("Products page is not loaded");
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='choose']")).click();
		Thread.sleep(3000);
		WebElement review=driver.findElement(By.xpath("//a[text()='Write Your Review']"));
		if(review.isDisplayed())
		{
			System.out.println("Write Your Review is visible");
		}
		else
		{
			System.out.println("Write Your Review is notvisible");
		}
		
		driver.findElement(By.id("name")).sendKeys("Hari");
		driver.findElement(By.id("email")).sendKeys("hari.1@gmail.com");
		driver.findElement(By.id("review")).sendKeys("This is for testing purpose only");
		Thread.sleep(3000);
		driver.findElement(By.id("button-review")).click();		
	}
}
