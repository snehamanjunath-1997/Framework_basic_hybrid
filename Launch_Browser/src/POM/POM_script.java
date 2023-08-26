package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_script {
	//declaration
	@FindBy(xpath="//input[@name='ctl00$ctl00$ctl00$ctl00$ContentPlaceHolderDefault$TopLoggedOut_3$txtTopLogin']")
	private WebElement un_txt;
	@FindBy(xpath="//input[@type='password']")
	private WebElement pass_txt;
	@FindBy(xpath="//input[@value='Login']")
	private WebElement login_txt;
	
	//initi
	public POM_script(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	//utili
	public WebElement UN_enter()
	{
		return un_txt;
	}
	public void pass_enter(String pas) //methods with parameter
	{
		pass_txt.sendKeys(pas);
	}
	public void login_click()
	{
		login_txt.clear();
	}

}
