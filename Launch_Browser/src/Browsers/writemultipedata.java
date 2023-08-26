package Browsers;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class writemultipedata {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.amazon.in/?language=en_US/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		int count =links.size();
		for(WebElement link : links)
		{
			String att=link.getAttribute("href");
			FileInputStream fis = new FileInputStream("./excel/TestData.xlsx");
			Workbook book = WorkbookFactory.create(fis);
			Sheet sh = book.getSheet("Sheet1");//book.creatsheet("sneha");
	
		for(int i=0;i<count;i++)
		{
		Row r = sh.createRow(i);
		Cell cell = r.createCell(0);
		cell.setCellValue(att);
		}
		
		//output the same file
		
		FileOutputStream fo = new FileOutputStream("./excel/TestData.xlsx");
		book.write(fo);
	}
	}

}
