package Browsers;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Popupchilds {
	

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement kan = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
		Actions act = new Actions(driver);
		act.contextClick(kan).perform();
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(2000);
		String pid=driver.getWindowHandle();
		Set<String> allid=driver.getWindowHandles();
		allid.remove(pid);
		for(String id:allid)
		{
			driver.switchTo().window(id);
			Thread.sleep(2000);
		    WebElement ele = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		    ele.sendKeys("amazon");
		    ele.sendKeys(Keys.ENTER);
		    Thread.sleep(2000);
		    driver.quit();
			
			
			
		}
		
	}

}
