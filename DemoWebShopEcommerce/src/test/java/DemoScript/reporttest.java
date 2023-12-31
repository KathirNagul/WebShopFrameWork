package DemoScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class reporttest {
	
	ExtentReports report=new ExtentReports("./Report/report.html");
	ExtentTest test=report.startTest("login test");
	@Test
    public void Demo1() {
		
		WebDriver driver=new ChromeDriver();
		
		test.log(LogStatus.INFO, "browser lanched");
		
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "browser maximized");
		
		test.log(LogStatus.PASS, "Browser Maximized");
		
		report.endTest(test);
		report.flush();
		driver.quit();
		
		
		
    	
	}

}
