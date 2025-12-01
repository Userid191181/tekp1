package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fff = new FileInputStream("./src\\test\\resources\\Excel.xlsx");
		Workbook w = WorkbookFactory.create(fff);
		Sheet s = w.getSheet("Sample");
		Row r = s.getRow(1);
		Cell c = r.getCell(2);
		Cell c1=r.getCell(3);
		String data = c.getStringCellValue();
		String data1 = c1.getStringCellValue();
		System.out.println(data+ " " +data1);
		w.close();
	}
}
