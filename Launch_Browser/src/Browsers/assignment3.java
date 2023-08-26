package Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment3 {
	public static void main(String arg[]) throws InterruptedException
	{
			
			System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@rel='async']")).click();
			Thread.sleep(2000);
			WebElement  ele=driver.findElement(By.xpath("//select[@id='day']"));
		
	}
}
