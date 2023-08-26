package Browsers;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launching {
	
	public static void main(String[] args) {
	
		/*
		 * System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		 * ChromeDriver driver = new ChromeDriver(); Thread.sleep(9000); driver.quit()
		 */;
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
	System.out.println("FireFox run successfully");
	}

}
