package Browsers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alllinks {

	public static void main(String arg[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		List<WebElement> eles=driver.findElements(By.xpath("//a|//img|//input[@type='check']|//input[@type='radio']"));
		int count=eles.size();
		System.out.println(count);
		Thread.sleep(2000);
		driver.quit();
		
	}
}
