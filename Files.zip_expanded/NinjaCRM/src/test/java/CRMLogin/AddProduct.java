	
package CRMLogin;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddProduct {

	private static final WebDriver WebDriverwait = null;

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new EdgeDriver();
		driver.get("http://49.249.28.218:8098/");
		driver.manage().window().maximize();
		Random r=new Random();
		int rr=r.nextInt(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("rmgyantra");
		driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3);
		driver.findElement(By.xpath("//a[@href='/products']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		WebElement g=driver.findElement(By.name("productName"));
		g.sendKeys("Prodname"+rr);
		String ff=g.getText();
		System.out.println(ff);
		
		WebElement ele = driver.findElement(By.xpath("//select[@name='productCategory']"));
		Select s = new Select(ele);
		s.selectByValue("Electronics");
		
		WebElement dd=driver.findElement(By.name("quantity"));
		dd.clear();
		dd.sendKeys("100");
		
		Thread.sleep(3);
		WebElement dd1=driver.findElement(By.name("price"));
		dd1.clear();
		dd1.sendKeys("3.5");
		
		Thread.sleep(3);
		WebElement ele1 = driver.findElement(By.xpath("//select[@name='vendorId']"));
		Select s1 = new Select(ele1);
		s1.selectByIndex(2);
		Thread.sleep(3);
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		
		WebElement toast = driver.findElement(By.xpath("//div[@role='alert']"));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(toast));
		
		String a=toast.getText();

		if(a.contains("Prodname"+rr))		
		{
			System.out.println(a+"Product is created successfully");
		}
		else
		{
			System.out.println("Product is not created");
		}
		
		WebElement move=driver.findElement(By.xpath("//div[@class='user-icon']"));
		Actions act=new Actions(driver);
		act.moveToElement(move).click().perform();
		driver.findElement(By.xpath("//div[@class='dropdown-item logout']")).click();	
	}}





