package Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubeSearch {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.youtube.com/");
		Thread.sleep(4000);
		WebElement ele= driver.findElement(By.name("search_query"));
		ele.sendKeys("kannada songs");
		Thread.sleep(4000);
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(4000);
		driver.quit();
	}
}
