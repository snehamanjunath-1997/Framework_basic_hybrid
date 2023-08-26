package Browsers;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.Reporter;

public class Annotationnn {
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
