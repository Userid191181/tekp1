package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasket {

		public static void main(String[] args) {
			

			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.bigbasket.com/");
			driver.findElement(By.id("headlessui-menu-button-:Ramkj6:")).click();
			
			List<WebElement> categorylist = driver.findElements(By.xpath(
					"//button[@id='headlessui-menu-button-:Ramkj6:']/following-sibling::div[@role='menu']/descendant::li[@class='jsx-1259984711' and @role='none']"));

		try {

				for (WebElement eachcat : categorylist) {
					Actions act = new Actions(driver);
					act.moveToElement(eachcat).perform();
					System.out.println(eachcat.getText());
					List<WebElement> subCat = driver.findElements(By.xpath(
							"//div[@id='headlessui-menu-items-:Rimkj6:']/nav[@class='jsx-1259984711 flex text-medium']/descendant::ul[@class='jsx-1259984711 w-56 px-2.5 bg-silverSurfer-200 text-darkOnyx-800 max-h-120 overflow-y-auto scroll-smooth']/li"));
					for (WebElement eachsubCat : subCat) {
						Actions act1 = new Actions(driver);
						act1.moveToElement(eachsubCat).perform();
						System.out.println("\t" + eachsubCat.getText());
						List<WebElement> names = driver.findElements(By.xpath(
								"//div[@id='headlessui-menu-items-:Rimkj6:']/nav[@class='jsx-1259984711 flex text-medium']/descendant::ul[@class='jsx-1259984711 w-56 px-2.5 bg-white text-darkOnyx-800 rounded-r-xs max-h-120 overflow-y-auto scroll-smooth']"));
						for (WebElement eachname : names) {
							System.out.println("\t\t" + eachname.getText());
						}
					}
				}
			} catch (Exception e) 
				{
			}
		}
}