package Browsers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Checkbox {
	
	public static void main(String arg[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DELL/Desktop/Checkbox.html");
		List<WebElement> eles= driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement ele:eles)
		{
			
			ele.click();
		}
		
		int count = eles.size();
		for(int i=count-1;i>=0;i--)
		{
			WebElement ele=eles.get(i);
			ele.click();
		}
		
		Thread.sleep(4000);
		driver.quit();
	}
}
