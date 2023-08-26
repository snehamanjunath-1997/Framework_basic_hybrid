package Browsers;

import java.io.FileInputStream;
import java.io.IOException;

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

public class Fetechdata {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		//steps to fetch single data
		FileInputStream fis = new FileInputStream("./excel/TestData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		Row r = sh.getRow(2);
		Cell cell = r.getCell(1);
		String value = cell.toString();
		System.out.println(value);
		
		// steps to enter fetch data into text field
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://uat.eurofinsgenomics.com/en/home.aspx?forcerecommendation=false#");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement ele=driver.findElement(By.xpath("//input[@class='search-field']"));
		ele.sendKeys(value);
		Thread.sleep(2000);
		driver.quit();
	}
	

}
