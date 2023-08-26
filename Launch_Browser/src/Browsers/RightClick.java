package Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(4000);
		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		Actions act= new Actions(driver);
		act.contextClick(ele).perform();
		Thread.sleep(5000);
		driver.quit();
	}


}
