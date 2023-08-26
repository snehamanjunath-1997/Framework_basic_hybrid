package Browsers;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitwaits {
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.instagram.com/?hl=en");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("Hii");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("Hello");
		driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
	}
	

}
