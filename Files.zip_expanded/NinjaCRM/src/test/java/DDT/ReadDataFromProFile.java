package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.module.Browser;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadDataFromProFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileInputStream f=new FileInputStream("./src\\test\\resources\\commonData.properties");
		Properties p=new Properties();
		p.load(f);
		
		String bro=p.getProperty("browser");
		String url=p.getProperty("url");
		String un=p.getProperty("username");
		String pwd=p.getProperty("password");
		
		WebDriver driver=null;
		
		if(bro.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		if(bro.equals("chrome"))
		{
			driver=new ChromeDriver();
		}		
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	}
}
