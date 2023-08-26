package Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement src = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		WebElement trgt= driver.findElement(By.id("BANK"));
		Actions act = new Actions(driver);
		act.dragAndDrop(src, trgt).perform();
		Thread.sleep(5000);
		WebElement src1 = driver.findElement(By.xpath("//a[text()=\" 5000 \"] "));
		WebElement trgt1= driver.findElement(By.id("amt7"));
		Actions act1 = new Actions(driver);
		act.dragAndDrop(src1, trgt1).perform();
		Thread.sleep(5000);
		driver.quit();
	}

}
