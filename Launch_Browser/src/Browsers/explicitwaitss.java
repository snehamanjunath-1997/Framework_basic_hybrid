package Browsers;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwaitss {
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.instagram.com/?hl=en");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlContains("instagram"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement un=driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		wait.until(ExpectedConditions.visibilityOf(un)).sendKeys("instagram");
		
	}

}
