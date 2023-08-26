package Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dimension {
	public static void main(String arg[]) throws InterruptedException{
		
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement ele=driver.findElement(By.id("email"));
	org.openqa.selenium.Dimension size=ele.getSize();
	System.out.println(size);
	int h=size.getHeight();
	System.out.println("h axis is" +h);
	int w=size.getWidth();
	System.out.println("w axiz is"+w);
	Thread.sleep(4000);
	driver.quit();
	}

}
