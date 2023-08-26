package Extentreport;



import org.junit.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class generateReport {
	@Test
	public void reportt()
		
	{
	
	ExtentReports report = new ExtentReports("./extreport/ER.html");
	ExtentTest tests=report.startTest("TEST");
	tests.log(LogStatus.PASS,"pass");
	tests.log(LogStatus.FAIL,"fail");
	tests.log(LogStatus.SKIP,"skip");
	report.endTest(tests);
	report.flush();
	
	}

}
