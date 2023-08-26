package Browsers;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parentbrowser {
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text()='New Window']")).click();
		Thread.sleep(4000);
		String pid=driver.getWindowHandle();
		System.out.println("parent id"+pid);
		driver.quit();
	}

}
