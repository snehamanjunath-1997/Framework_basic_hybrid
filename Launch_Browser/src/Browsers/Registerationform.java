package Browsers;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registerationform {
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Sneha");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Manjunath");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("sneha@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='gender-radio-2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("1234567890");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		ele.click();
		WebElement ele1=driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		ele.click();
		Select s=new Select(ele1);
		s.selectByValue("2");
		Thread.sleep(1000);
		WebElement ele2=driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		ele2.click();
		Select s1=new Select(ele2);
		s1.selectByValue("1997");
		Thread.sleep(1000);
		WebElement ele3=driver.findElement(By.xpath("//div[text()='3']"));
		ele3.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("C:\\Users\\DELL\\Desktop\\snehap1.jpg");//shift +right click +copy as path
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id='currentAddress']]")).sendKeys("testing");
		Thread.sleep(3000);
        driver.quit();
		
		
	}

}
