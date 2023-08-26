package Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		WebElement ele= driver.findElement(By.name("email"));
		ele.sendKeys("sneha_manjunathh");
		Thread.sleep(4000);
		WebElement ele1= driver.findElement(By.name("pass"));
		ele1.sendKeys("Chittu");
		Thread.sleep(7000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(4000);
		driver.close();
		
	}

}
