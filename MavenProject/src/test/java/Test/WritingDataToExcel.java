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

public class WritingDataToExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//FileInputStream fis=new FileInputStream("D:\\OLDDATA\\BackUPCDrive\\SELENIUM\\TEKPyramid\\Excel.xlsx");
//Workbook wb = WorkbookFactory.create(fis);
//Sheet sh=wb.getSheet("Org");
//Row row=sh.getRow(1);
//Row row1 = sh.createRow(7);
//Cell c=row1.createCell(4);
//c.setCellType(CellType.STRING);
//c.setCellValue("ddddddd");
//FileOutputStream fos=new FileOutputStream("D:\\OLDDATA\\BackUPCDrive\\SELENIUM\\TEKPyramid\\Excel.xlsx");
//wb.write(fos);
//wb.close();

		
		Workbook wb=WorkbookFactory.create(new FileInputStream("D:\\OLDDATA\\BackUPCDrive\\SELENIUM\\TEKPyramid\\Excel.xlsx"));
		Sheet sh=wb.getSheet("Org");
		sh.createRow(5);
		Row r=sh.getRow(5);
		Cell c=r.createCell(5);
		c.setCellType(CellType.STRING);
		c.setCellValue(9);
		FileOutputStream fos=new FileOutputStream("D:\\OLDDATA\\BackUPCDrive\\SELENIUM\\TEKPyramid\\Excel.xlsx");
		wb.write(fos);
		wb.close();		
		Row k=sh.getRow(5);
		String p=k.getCell(5).toString();
		System.out.println(p);
		
		

	}

}
