package Basic_Hybrid_Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basee_Classs {
	public static WebDriver driver;
	@BeforeMethod
	public void open_App()
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://uat.eurofinsgenomics.com/en/home.aspx?forcerecommendation=false#");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void close_App()
	{
		driver.close();
	}

}
