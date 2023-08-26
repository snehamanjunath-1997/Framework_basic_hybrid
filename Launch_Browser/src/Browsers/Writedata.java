package Browsers;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Writedata {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		//steps to fetch single data
		FileInputStream fis = new FileInputStream("./excel/TestData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		//Sheet sh = book.getSheet("Sheet1");
		Sheet sh = book.createSheet("sneha");
		Row r = sh.createRow(0);
		Cell cell = r.createCell(0);
		cell.setCellValue("Snehamanjunath@eurofins.com");
		
		
		//output the same file
		
		FileOutputStream fo = new FileOutputStream("./excel/TestData.xlsx");
		book.write(fo);
	}	

}
