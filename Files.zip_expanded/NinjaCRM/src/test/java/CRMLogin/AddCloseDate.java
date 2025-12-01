package CRMLogin;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCloseDate {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://49.249.28.218:8098/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("rmgyantra");
		driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2);
		Random r=new Random();
		int rr = r.nextInt(2000);
		driver.findElement(By.xpath("//span[text()='Create Campaign']")).click();
		driver.findElement(By.xpath("//input[@name='campaignName']")).sendKeys("TestcampI");
		WebElement TS=driver.findElement(By.xpath("//input[@name='targetSize']"));
		TS.clear();
		TS.sendKeys("10");
		
		Date date = new Date();
		SimpleDateFormat sim=new SimpleDateFormat("dd-MM-yyyy");
		String Reqdate = sim.format(date);
		
		Calendar cal=sim.getCalendar();
		cal.add(cal.DAY_OF_MONTH, 30);
		String ReqDate = sim.format(cal.getTime());
		
		driver.findElement(By.name("expectedCloseDate")).sendKeys(ReqDate);
		
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


