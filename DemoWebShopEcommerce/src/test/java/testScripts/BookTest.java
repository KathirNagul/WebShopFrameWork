package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import genricLibrary.BaseClass;
import genricLibrary.WebDriverUtility;
import objectRepositery.BookPage;
import objectRepositery.Homepage1;

public class BookTest extends BaseClass {
	
	

	@Test
	public void VerifyBookpage_001() {
		
		
		Homepage1 homepage=new Homepage1(driver);
		BookPage bookpage=new BookPage(driver);
		
		homepage.getBooksLink().click();
		test.log(LogStatus.INFO, "clicked on books link");;
		
		String pageHaeding = bookpage.getBookpageHeading().getText();
		
		Assert.assertEquals(pageHaeding,"Books");
		
		test.log(LogStatus.PASS, "test case run");
		Reporter.log("Test case pass",true);
		
		
		
	}
	@Test
	public void Selectbyindex() {
		Homepage1 homepage=new Homepage1(driver);
		BookPage bookpage=new BookPage(driver);
		
		homepage.getBooksLink().click();
		
		WebDriverUtility.selectoptionByIndex(bookpage.getSortbyDropDown(), 2);
		//WebDriverUtility.selectoptionByvisibletext(bookpage.getSortbyDropDown(), "Created on");
		
		
	}

}
