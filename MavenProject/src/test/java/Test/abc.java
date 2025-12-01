package Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class abc {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		System.setProperty("webdriver.edge.driver", "./SeleniumJarFiles/msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();

FileInputStream fis=new FileInputStream("D:\\OLDDATA\\BackUPCDrive\\SELENIUM\\TEKPyramid\\Excel.xlsx");
Workbook wb = WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("Org");
	Row row =sh.createRow(10); //creating row to enter data in 10th Row
		//Row row=sh.getRow(2);
			Cell c=row.createCell(1);
			c.setCellType(CellType.STRING);
			c.setCellValue("AAAAAAAAAAAA");
			FileOutputStream fos=new FileOutputStream("D:\\OLDDATA\\BackUPCDrive\\SELENIUM\\TEKPyramid\\Excel.xlsx");
			wb.write(fos);
			wb.close();
	}}
