package Browsers;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {	
	public static void main(String args[]) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("C:\\Users\\DELL\\Desktop\\Id.html");
			Thread.sleep(2000);
			driver.findElement(By.id("a1")).click();
			
		}

	}



