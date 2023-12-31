package genricLibrary;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;


import objectRepositery.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseClass extends WebDriverUtility {
	public WebDriver driver;
	LoginPage loginpage=new LoginPage(driver);
	WebDriverUtility web=new WebDriverUtility();
 
  @BeforeMethod
  public void beforeMethod() {
	 // String methodname=method.getName();
	// web.test=report.startTest(methodname);
	  Reporter.log("Login");
	 LoginPage in=new LoginPage(driver);
	  in.login(driver);
	
	   }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("Log out");
	 LoginPage out=new LoginPage(driver);
	 out.LogOut(driver);
	web. report.endTest(test);
			 }

  @BeforeClass
  public void beforeClass() {
	  
	  Reporter.log("Before Class",true);
	  String browser = FileUtility.getproperty("browser");
	  String url = FileUtility.getproperty("url");
	  if (browser.equalsIgnoreCase("chrome")) {
		  driver=new ChromeDriver();
		}
	  else if (browser.equalsIgnoreCase("edge")) {
		  driver=new EdgeDriver();
		}
	  else if (browser.equalsIgnoreCase("Firefox")) {
		  driver=new FirefoxDriver();
		}
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get(url);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("After Class",true);
	  driver.quit();
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("Before  test",true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("After  test",true);
  }

  @BeforeSuite
  public void beforeSuite() {
	   
	 web.report=new ExtentReports(REPORT_PATH);
  }

  @AfterSuite
  public void afterSuite() {
	 web. report.flush();
	  Reporter.log("Close Connection to DataBase",true);
  }

}
