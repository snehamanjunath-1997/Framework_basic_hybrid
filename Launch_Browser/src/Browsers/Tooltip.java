package Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {
	public static void main(String arg[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.facebook.com/");
		WebElement ele=driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
		String tooltip=ele.getAttribute("title");
		System.out.println(tooltip);
		Thread.sleep(4000);
		driver.quit();
		
		
		
	}

}
