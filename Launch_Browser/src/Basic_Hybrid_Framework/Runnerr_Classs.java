package Basic_Hybrid_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Runnerr_Classs extends Basee_Classs {
@Test
public void Ecom() throws InterruptedException 
{
WebElement ele=driver.findElement(By.xpath("//a[text()='Login']"));
ele.click();
POMM p=new POMM(driver);
p.UN_enterr().sendKeys("sandeepp");
Thread.sleep(2000);
p.pass_enterr().sendKeys("test123");
Thread.sleep(2000);
p.login_clickk();
}

}
