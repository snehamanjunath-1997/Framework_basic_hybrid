package Browsers;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Takescsht {
	
	public static void main(String[] args) throws IOException, InterruptedException
	
	{
		Date d = new Date();
		String d1=d.toString();
		String date=d1.replace(":","-");
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		TakesScreenshot tss=(TakesScreenshot)driver;
		File scr=tss.getScreenshotAs(OutputType.FILE);
		//File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//File dst=new File("C:\\Users\\DELL\\Desktop\\Screenshot\\Test" +date+ ".jpg");
		File dst=new File("./Photos/" +date+ ".jpg");
		FileHandler.copy(scr,dst);
		Thread.sleep(4000);
		driver.quit();
		
		
		
}
	
}
