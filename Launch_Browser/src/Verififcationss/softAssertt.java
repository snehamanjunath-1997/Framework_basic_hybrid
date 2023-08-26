package Verififcationss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertt {
	@Test
	public void facebookk() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://uat.eurofinsgenomics.com/en/home.aspx?forcerecommendation=false");
		String title=driver.getTitle();
		SoftAssert as=new SoftAssert();
		as.assertEquals(title, "Eurofins");
		System.out.println("Execution continues");
		Thread.sleep(1000);
		driver.findElement(By.className("search-field")).sendKeys("Hii");
		Thread.sleep(1000);
		as.assertAll();
		driver.quit();
	}

}
