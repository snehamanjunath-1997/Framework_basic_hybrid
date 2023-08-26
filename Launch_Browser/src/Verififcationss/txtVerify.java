package Verififcationss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class txtVerify {
	@Test
	public void facebookk() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.google.com/");
		WebElement ele=driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
		String txt=ele.getText();
		System.out.println(txt);
		Assert.assertEquals(txt, "ಕನ್ನಡ");
		System.out.println("Verified");
        Thread.sleep(1000);
        ele.click();
        Thread.sleep(6000);
		driver.quit();
	}

}
