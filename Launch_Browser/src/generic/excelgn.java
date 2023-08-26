package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelgn {
	
	public static String Testdat(String sheet,int r,int c)
	{
		String val="";
		try {
			FileInputStream fis = new FileInputStream("./excel/TestData.xlsx");
			Workbook book = WorkbookFactory.create(fis);
			Sheet sh = book.getSheet(sheet);
			Row rn = sh.getRow(r);
			Cell cn = rn.getCell(c);
			val = cn.toString();
			
		}
		catch(Exception e)
		{
			System.out.println("unable to fetch data");
		}
		return val;
		
	}

}
