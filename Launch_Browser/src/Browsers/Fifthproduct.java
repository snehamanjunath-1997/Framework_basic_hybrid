package Browsers;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fifthproduct {
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("myntra.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement kan = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
		
	}
	

}
