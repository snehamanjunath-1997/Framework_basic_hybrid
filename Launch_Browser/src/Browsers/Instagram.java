package Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.instagram.com/");
		Thread.sleep(4000);
		WebElement ele= driver.findElement(By.name("username"));
		ele.sendKeys("sneha_manjunathh");
		Thread.sleep(4000);
		WebElement ele1= driver.findElement(By.name("password"));
		ele1.sendKeys("Chittu@123");
		Thread.sleep(2000);
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(9000);
		driver.quit();
		
	}

}
