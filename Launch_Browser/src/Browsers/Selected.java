package Browsers;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Selected {
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
			WebDriver driver = new ChromeDriver ();
			driver.get("C:\\Users\\DELL\\Desktop\\Demo.html");
			Thread.sleep(4000);
			WebElement ele= driver.findElement(By.xpath("//Input[@type='checkbox']"));
			boolean b=ele.isSelected();
			if(b)
			{
				System.out.println("Selected");
			}
			else
			{
				System.out.println("not Selected");
			}
			driver.quit();
		}

}
