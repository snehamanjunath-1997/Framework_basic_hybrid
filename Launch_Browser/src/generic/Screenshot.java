package generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshot
{
	public static void Screensht(WebDriver driver) throws IOException
	{
		String path ="./Photos/";
		Date d = new Date();
		String d1=d.toString();
		String date=d1.replaceAll(":","-");
		TakesScreenshot tss=(TakesScreenshot)driver;
		File scr=tss.getScreenshotAs(OutputType.FILE);
		//File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//File dst=new File("C:\\Users\\DELL\\Desktop\\Screenshot\\Test" +date+ ".jpg");
		File dst=new File(path +date+ ".jpg");
		FileHandler.copy(scr,dst);
	}
}

