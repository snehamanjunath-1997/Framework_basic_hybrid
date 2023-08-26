package Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrameing {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("C:\\Users\\DELL\\Desktop\\Primary.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("u1")).sendKeys("hiii");
		Thread.sleep(2000);
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("i1");
		WebElement frm = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frm);
		driver.findElement(By.id("p1")).sendKeys("world");
		Thread.sleep(4000);
		driver.quit();
		
		
		
	}
	
}
