package GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String TogetDataFromExcelFile(String sheetname, int Rownum, int cell)throws EncryptedDocumentException, IOException {
		Workbook wb = WorkbookFactory.create(new FileInputStream("./src\\test\\resources\\Excel.xlsx"));
		Sheet sh = wb.getSheet(sheetname);
		String data = sh.getRow(Rownum).getCell(cell).getStringCellValue();
		wb.close();
		return data;
	}

	public int TogetLastRow(String sheetname, int Rownum) throws EncryptedDocumentException, IOException {
		Workbook wb = WorkbookFactory.create(new FileInputStream("./src\\test\\resources\\Excel.xlsx"));
		int LastRowNum = wb.getSheet(sheetname).getLastRowNum();
		wb.close();
		return LastRowNum;
	}

}
