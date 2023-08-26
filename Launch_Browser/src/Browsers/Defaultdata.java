package Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Defaultdata {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\DELL\\Desktop\\Default.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.tagName("Input"));
		ele.clear();
		
	}


}
