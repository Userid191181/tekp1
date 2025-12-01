package Test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExcelFile_ReadMultiplData {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
//FileInputStream fis=new FileInputStream("./src/test/resources/Excel.xlsx");
//Workbook wb = WorkbookFactory.create(fis);
	//OR below
Workbook wb=WorkbookFactory.create(new FileInputStream("./src/test/resources/Excel.xlsx"));

Sheet sh=wb.getSheet("MultipleData");
int mm = sh.getLastRowNum();
for(int i=1; i<=mm; i++)
{
Row row=sh.getRow(i);
Cell d = row.getCell(0);
String data=d.toString();
System.out.println(data);
}}}