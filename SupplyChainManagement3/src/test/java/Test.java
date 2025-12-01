import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./sw\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		//WebDriver driver=new ChromeDriver();
		
		

	}

}
