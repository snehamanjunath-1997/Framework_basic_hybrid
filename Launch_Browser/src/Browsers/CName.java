package Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CName {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\DELL\\Desktop\\Classname.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.className("c1"));
		ele.click();
		
		
		
	
	}
}
