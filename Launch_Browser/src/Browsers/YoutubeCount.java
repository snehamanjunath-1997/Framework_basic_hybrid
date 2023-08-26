package Browsers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeCount {
public static void main(String arg[]) throws InterruptedException
{
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		WebElement ele= driver.findElement(By.name("search_query"));
		ele.sendKeys("Neenaade Naa Video Song -Yuvarathnaa (Kannada) | Puneeth Rajkumar| Santhosh Ananddram| Hombale Films");
		Thread.sleep(2000);
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@title='Neenaade Naa Video Song -Yuvarathnaa (Kannada) | Puneeth Rajkumar| Santhosh Ananddram| Hombale Films']")).click();
		WebElement ele1=driver.findElement(By.xpath("//span[text()='Share']/../../../../../ytd-segmented-like-dislike-button-renderer/yt-smartimation//span]"));
		System.out.println(ele1);
		Thread.sleep(8000);
		driver.quit();
		
}


}
