package ImplementationOfProperiesAndExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipleDataFromXcel {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {

		Workbook book = WorkbookFactory.create(new FileInputStream("./src\\test\\resources\\Excel.xlsx"));
		Sheet sh = book.getSheet("ProductDetails");
		int cellcount = sh.getLastRowNum();
		System.out.println(cellcount);
		for (int i = 1; i <= cellcount; i++) 
		{
			String ProductCategory = sh.getRow(i).getCell(0).getStringCellValue();
			String ProductName = sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(ProductCategory + "==" + ProductName);			
		}
	}
}