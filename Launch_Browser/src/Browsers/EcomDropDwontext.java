package Browsers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EcomDropDwontext {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://uat.eurofinsgenomics.com/en/home.aspx?forcerecommendation=false");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		WebElement ele=driver.findElement(By.id("ContentPlaceHolderDefault_subContent_MainContent_Content_Register_10_ddlIndustryType"));
		Select sel= new Select(ele);
		List<WebElement> opts = sel.getOptions();
		for (WebElement opt : opts) 
		{
			String txt=opt.getText();
			System.out.println(txt);
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
