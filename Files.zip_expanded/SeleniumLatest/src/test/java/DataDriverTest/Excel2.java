package DataDriverTest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
public class Excel2 {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		//creating new sheet, row, cell and fetching the new entry.
//		Workbook b=WorkbookFactory.create(new FileInputStream("src/test/resources/Excel.xlsx"));
//		Sheet s=b.createSheet("Testing");
//		Row r1=s.createRow(2);
//		Cell c1=r1.createCell(0);
//		c1.setCellValue("Second");
//		FileOutputStream out = new FileOutputStream("src/test/resources/Excel.xlsx");
//		b.write(out);
//		
//		
//		System.out.println(c1.getStringCellValue());
		
		
		
		
		Workbook b1=WorkbookFactory.create(new FileInputStream("src/test/resources/Excel.xlsx"));
		Sheet s1=b1.createSheet("Mandatory");
		Row r2=s1.createRow(4);
		Cell c2=r2.createCell(2);
		c2.setCellValue("abcdef");
		
		FileOutputStream out=new FileOutputStream("src/test/resources/Excel.xlsx");
		b1.write(out);
		System.out.println(c2.getStringCellValue());
		
		
		
		
		
		
		
		

	}

}
