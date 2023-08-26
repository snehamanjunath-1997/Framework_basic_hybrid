package Verififcationss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
@Test
public void facebook()
{
	
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver = new ChromeDriver ();
	driver.get("https://uat.eurofinsgenomics.com/en/home.aspx?forcerecommendation=false");
	String title=driver.getTitle();
	//Assert.assertEquals(title, "Eurofins Genomics"); //case 1 
	Assert.assertEquals(title, "Eurofins"); //case 2
	System.out.println("Verified");
	driver.findElement(By.className("search-field")).sendKeys("Hii");
	driver.quit();
}

}
