package DataDriverTest;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {		
		//assignment to enter the id and pwd from excel
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();				
//		String f="src/test/resources/Excel.xlsx";
//		FileInputStream path=new FileInputStream(f);
		//Above 2 lines are combined to a single line below (line26)
//		Workbook book=WorkbookFactory.create(new FileInputStream("src/test/resources/Excel.xlsx"));		
//		Row Tr = book.getSheet("Sheet1").getRow(1);
//		String u=  Tr.getCell(0).toString();
//		String p = Tr.getCell(1).toString();
	
		
		
		Workbook o=WorkbookFactory.create(new FileInputStream("./src/wer/sdd/s.xlsx"));
		 Row sh = o.getSheet("Sample").getRow(0);
		 String uw=sh.getCell(0).toString();
	
		
//		driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]")).sendKeys(u);
//		driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]")).sendKeys(p);
//		driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();		
		
		
		
	}
}
