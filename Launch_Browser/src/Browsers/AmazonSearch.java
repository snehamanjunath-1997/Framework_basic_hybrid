package Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.amazon.com/");
		Thread.sleep(4000);
		WebElement ele= driver.findElement(By.name("field-keywords"));
		ele.sendKeys("bags");
		Thread.sleep(4000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(4000);
		driver.quit();
		
	}


}
