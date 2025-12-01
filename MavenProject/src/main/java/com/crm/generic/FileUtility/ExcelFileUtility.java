package com.crm.generic.FileUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {
	public String getDataFromExcel(String sheetName, int rownum, int cellnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./TestScriptData/Excel123.xlsx"); 
		Workbook wb=WorkbookFactory.create(fis);
		String data=wb.getSheet(sheetName).getRow(rownum).getCell(cellnum).toString();	
		wb.close();
		return data;				
	}

	public int getRowCount(String sheetName) throws EncryptedDocumentException, FileNotFoundException, IOException{
		Workbook wb=WorkbookFactory.create(new FileInputStream("./TestScriptData/Excel123.xlsx"));
		int data=wb.getSheet(sheetName).getLastRowNum();
		wb.close();
		return data;		
	}
	
	public void setDatatoExcel(String sheetName, int rownum, int cellnum, String cellvalue) throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		Workbook wb=WorkbookFactory.create(new FileInputStream("./TestScriptData/Excel123.xlsx"));
		wb.getSheet(sheetName).getRow(rownum).createCell(cellnum).setCellValue(cellvalue);
		FileOutputStream fos=new FileOutputStream("./TestScriptData/Excel123.xlsx");
		wb.write(fos);
		wb.close();		
	}
	
}
