package Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {
	
	public static void main(String arg[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.facebook.com/");
		WebElement ele=driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
		Rectangle loc=ele.getRect(); ///getLoction can be used
		System.out.println(loc);
		int x=loc.getX();
		System.out.println("x axis is"+x);
		int y =loc.getY();
		System.out.println("y axiz is"+y);
		Thread.sleep(4000);
		driver.quit();
		
		
		
	}

}
