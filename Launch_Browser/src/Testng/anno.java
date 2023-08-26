package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class anno {
	@Test
	public void apple()
	{
		Reporter.log("apple",true);
	}
	@Test(dependsOnMethods="apple")
	public void lion()
	{
		Reporter.log("lion",true);
		//Assert.fail();
	}
	@Test
	public void aanake()
	{
		Reporter.log("snake",true);
	}
	

}
