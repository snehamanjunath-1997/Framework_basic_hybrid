package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class testRunner {
	@Test
	public void Face() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://uat.eurofinsgenomics.com/en/home.aspx?forcerecommendation=false#");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele=driver.findElement(By.xpath("//a[text()='Login']"));
		ele.click();
		POM_script p=new POM_script(driver);
		p.UN_enter().sendKeys("sandeepp");
		Thread.sleep(2000);
		p.pass_enter("test123");
		Thread.sleep(2000);
		p.login_click();
		
		
		
		
		
		/*p.UN_enter().sendKeys("Hello");
		Thread.sleep(6000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(2000);
		p.UN_enter().sendKeys("world");
		Thread.sleep(4000);*/
		//driver.quit();
		
	}
}
