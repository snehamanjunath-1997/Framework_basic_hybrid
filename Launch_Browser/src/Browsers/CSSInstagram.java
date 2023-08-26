package Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSInstagram {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.Instagram.com/");
		Thread.sleep(4000);
		WebElement ele= driver.findElement(By.cssSelector("Input[name='username']"));
		ele.sendKeys("sneha_manjunathh");
		Thread.sleep(4000);
		WebElement ele1= driver.findElement(By.cssSelector("Input[name='password']"));
		ele1.sendKeys("Chittu");
		Thread.sleep(7000);
		driver.findElement(By.cssSelector("button[class='_acan _acap _acas _aj1-']")).click();
		Thread.sleep(4000);
		driver.close();
		
	}

}
