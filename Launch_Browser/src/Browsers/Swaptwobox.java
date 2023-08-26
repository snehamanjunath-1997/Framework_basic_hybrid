package Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swaptwobox {

	public static void main(String arg[]) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\DELL\\Desktop\\swapbox.html");
		WebElement ele=driver.findElement(By.tagName("Input"));
		Thread.sleep(2000);
		ele.sendKeys(Keys.CONTROL+"a");
		ele.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(2000);
		ele.sendKeys(Keys.DELETE);
		WebElement ele1=driver.findElement(By.id("b1"));
		ele1.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		driver.quit();
		
	}
		
}
