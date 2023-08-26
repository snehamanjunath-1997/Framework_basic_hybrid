package Basic_Hybrid_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMM {
	//declaration
		@FindBy(xpath="//input[@name='ctl00$ctl00$ctl00$ctl00$ContentPlaceHolderDefault$TopLoggedOut_3$txtTopLogin']")
		private WebElement un_txtt;
		@FindBy(xpath="//input[@type='password']")
		private WebElement pass_txtt;
		@FindBy(xpath="//input[@value='Login']")
		private WebElement login_txtt;
		
		//initi
		public POMM(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
			
		}
		//utili
		public WebElement UN_enterr()
		{
			return un_txtt;
		}
		public WebElement pass_enterr()
		{
			return pass_txtt;
		}
		public void login_clickk()
		{
			login_txtt.click();
		}

	}


