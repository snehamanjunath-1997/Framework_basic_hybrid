package Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehoveraction {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.myntra.com/");
		Thread.sleep(4000);
		WebElement ele= driver.findElement(By.xpath("//a[contains(text(),'Men')]"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		driver.quit();
	}

}
