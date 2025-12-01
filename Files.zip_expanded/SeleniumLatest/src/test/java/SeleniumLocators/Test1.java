package SeleniumLocators;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.edge.EdgeDriver; 
import org.openqa.selenium.firefox.FirefoxDriver; 
public class Test1 {		 
			WebDriver driver;  
			public void browser(String browsername)  
			{   if(browsername.equals("Firefox"))   
				{    
					driver = new FirefoxDriver();   	}   
				else if(browsername.equals("Chrome"))   				{    
					driver = new ChromeDriver();  				}  
				else   
				{    					driver = new EdgeDriver(); 				}   
				driver.get("https://www.facebook.com/");  
				driver.close();  				} 		 
		 public static void main(String[] args)   
		 	{   
			 Test1 rv = new Test1();   
			 rv.browser("Firefox");   
			 rv.browser("Chrome");   
			 rv.browser("Edge");     
			 } 			}
	