package Mock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class abc {

	@DataProvider(name="logindata")
	public Object [][] logindata()
	{
		Object[][] rv=new Object[1][2];
		rv[0][0]="username123";
		rv[0][1]="password123";
		return rv;
	}
	
	
	@Test(dataProvider = "logindata")
	public void loginTest(String un, String pwd)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys(un);
		driver.findElement(By.name("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
		
	}	
}
