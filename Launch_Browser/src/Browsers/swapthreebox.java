package Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swapthreebox {
public static void main(String arg[]) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\DELL\\Desktop\\swapthreebox.html");
		WebElement ele1=driver.findElement(By.tagName("Input"));
		Thread.sleep(2000);
		ele1.sendKeys(Keys.CONTROL+"ax");// x is also for copy to reduce the code length we use ax instead of c
		//ele1.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(2000);
		ele1.sendKeys(Keys.DELETE);
		WebElement ele3=driver.findElement(By.id("c1"));
		ele3.sendKeys(Keys.CONTROL+"v");
		WebElement ele2=driver.findElement(By.id("b1"));
		Thread.sleep(2000);
		ele2.sendKeys(Keys.CONTROL+"ax");
		//ele2.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(2000);
		ele2.sendKeys(Keys.DELETE);
		WebElement ele=driver.findElement(By.tagName("Input"));
		ele.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		WebElement ele4=driver.findElement(By.id("c1"));
		ele4.sendKeys(Keys.CONTROL+"ax");
		//ele4.sendKeys(Keys.CONTROL+"c"); 
		Thread.sleep(2000);
		ele4.sendKeys(Keys.DELETE);
		WebElement ele5=driver.findElement(By.id("b1"));
		ele5.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
