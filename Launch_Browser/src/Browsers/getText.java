package Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {
	public static void main(String arg[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.selenium.dev/");
		WebElement ele=driver.findElement(By.xpath("//a[@href='/downloads']"));
		String text=ele.getText();
		System.out.println(text);
		Thread.sleep(4000);
		driver.quit();
		
		
		
	}

}
