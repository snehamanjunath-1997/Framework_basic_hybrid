package Browsers;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notifictaion {
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		opt.addArguments("--incognito");
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver (opt);
		driver.get("https://www.redbus.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
	}

}
