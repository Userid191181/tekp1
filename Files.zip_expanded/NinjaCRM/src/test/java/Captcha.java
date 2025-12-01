import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Captcha {

	public static void main(String[] args) throws TesseractException, IOException {
		ChromeOptions setting=new ChromeOptions();
		setting.addArguments("--disable--notification");
		WebDriver driver=new ChromeDriver(setting);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.xpath("//a[text()=' LOGIN ']")).click();
		WebElement capatcha = driver.findElement(By.xpath("//img[@class='captcha-img']"));

		File src= capatcha.getScreenshotAs(OutputType.FILE);
		File desc=new File("./screenshot/capatcha.png");
		FileHandler.copy(src, desc);
		
		Tesseract tss=new Tesseract();
		tss.setDatapath("C:\\Users\\Naresh\\Downloads\\Tess4J\\tessdata");
		String st = tss.doOCR(desc);
		String img = st.replace(" ", "");
		System.out.println(img); 
		
		
		
		
		
		
		
		
	}

}
