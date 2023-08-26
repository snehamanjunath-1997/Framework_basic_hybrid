package Browsers;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Displayed {
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
			WebDriver driver = new ChromeDriver ();
			driver.get("https://www.facebook.com/");
			Thread.sleep(4000);
			WebElement ele= driver.findElement(By.id("email"));
			boolean b=ele.isDisplayed();
			if(b)
			{
				System.out.println("Displayed");
			}
			else
			{
				System.out.println("not Displayed");
			}
			driver.quit();
		}
		
}
