package SeleniumLocators;
//WATS to verify search field is enabled or not i amazon.in app
	import java.util.Arrays;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;

	public class Webelement2 {
		public static void main(String[] args) {
			WebDriver driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			boolean ele=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).isEnabled();
			
			if(ele)
			{
				System.out.println("Search field is Enabled as expected");
			}
			else
			{
				System.err.println("Search field is NOT enabled");
			}
				
			
			
			
			
			
		
	}

}
