package Browsers;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amzjavscriptexct {
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.amazon.in/?language=en_US/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//a[text()='Facebook']"));
		Point p=ele.getLocation();
		System.out.println(p);
		int x=p.getX();
		System.out.println(x);
		int y=p.getY();
		System.out.println(y);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+x+","+y+")");
		ele.click();
		Thread.sleep(2000);
		driver.quit();
	
	}

}
