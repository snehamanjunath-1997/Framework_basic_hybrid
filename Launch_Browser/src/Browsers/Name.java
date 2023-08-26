package Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {

   public static void main(String args[]) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("C:\\Users\\DELL\\Desktop\\Name.html");
			Thread.sleep(2000);
			driver.findElement(By.name("n1")).click();
			
		}


}
