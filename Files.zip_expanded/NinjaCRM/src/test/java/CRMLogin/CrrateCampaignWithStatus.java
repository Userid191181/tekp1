package CRMLogin;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CrrateCampaignWithStatus {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://49.249.28.218:8098/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("rmgyantra");
		driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Random rv=new Random();
		int rv1=rv.nextInt(2500);
		Thread.sleep(2);
		driver.findElement(By.xpath("//span[text()='Create Campaign']")).click();
		driver.findElement(By.xpath("//input[@name='campaignName']")).sendKeys("TestcampI"+rv1);
		WebElement TS=driver.findElement(By.xpath("//input[@name='targetSize']"));
		TS.clear();
		TS.sendKeys("10");
		driver.findElement(By.xpath("//button[text()='Create Campaign']")).click();
		WebElement toast = driver.findElement(By.xpath("//div[@role='alert']"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(toast));
		String a=toast.getText();
		if(a.contains("TestcampI"))
		{
			System.out.println("Campaing is created successfully");
		}
		else
		{
			System.out.println("Campaing is not created");
		}
		WebElement move=driver.findElement(By.xpath("//div[@class='user-icon']"));
		Actions act=new Actions(driver);
		act.moveToElement(move).click().perform();
		driver.findElement(By.xpath("//div[@class='dropdown-item logout']")).click();		
		
	}

}
