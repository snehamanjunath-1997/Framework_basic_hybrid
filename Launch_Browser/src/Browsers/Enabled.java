package Browsers;

	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Enabled {
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
			WebDriver driver = new ChromeDriver ();
			driver.get("https://www.facebook.com/");
			Thread.sleep(4000);
			WebElement ele= driver.findElement(By.id("email"));
			boolean b=ele.isEnabled();
			if(b)
			{
				System.out.println("Enabled");
			}
			else
			{
				System.out.println("not Enaled");
			}
			driver.quit();
		}
		
}



