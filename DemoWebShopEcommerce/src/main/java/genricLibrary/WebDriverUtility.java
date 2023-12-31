package genricLibrary;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;






public class WebDriverUtility implements FrameWorkConstants{
	
	public static ExtentReports report;
	public static ExtentTest test;


	
	public static void selectoptionByIndex(WebElement dropdown,int index) {
		Select select=new Select(dropdown);
		select.selectByIndex(index);
		
	}
	
	public static void selectoptionByvalue(WebElement dropdown,String value) {
		Select select=new Select(dropdown);
		select.selectByValue(value);
		
	}
	
	public static void selectoptionByvisibletext(WebElement dropdown,String text) {
		Select select=new Select(dropdown);
		select.selectByValue(text);
		
	}
	
	//Switch to Windows using titile
	public static void SwitchToWindowByTitle(WebDriver driver,String title) {
		
		Set<String> allWindow=driver.getWindowHandles();
		for (String Window : allWindow) {
			driver.switchTo().window(Window);
			if (driver.getTitle().contains(title)) {
				break;
				
				}
		}
	}
	
	//Switch to Windows using url
	public static void SwitchToWindowByUrl(WebDriver driver,String url) {
		Set<String> allWindow=driver.getWindowHandles();
		for (String Window : allWindow) {
			driver.switchTo().window(Window);
			if (driver.getCurrentUrl().contains(url)) {
				break;
				
			}
		}
	}
	
	
	//Switch to frame using index
	public static void SwitchToFrameByIndex(WebDriver driver,int Index) {
		driver.switchTo().frame(Index);
		
	}
	
	//Switch to frame using Name or ID
	public static void SwitchToFrameByNameorID(WebDriver driver,String NameorID) {
		driver.switchTo().frame(NameorID);
	}
	
	//Switch to frame using WebElement
	public static void SwitchToFrameByWebElement(WebDriver driver,WebElement freamElement) {
		driver.switchTo().frame(freamElement);
	}
	
	//All WebDriver Mathods
	public static void ClickElement(WebElement element) {
		element.click();
	}
	
	public static void EnterText(WebElement element,String Text) {
		element.sendKeys(Text);
	}
	
	//Get system Date and Time
	public static String getSystemData() {
		return LocalDateTime.now().toString().replace(":", "_").replace("-","_");
	}
	
	//Take a ScreenShort on WebPage
	public static void getScreenShortOnWebpage(WebDriver driver) {
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm=new File(SCREENSHOT_PATH+getSystemData()+".png");
		try {
			FileHandler.copy(temp, perm);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	// Take Screen Short on WebElament
	public static void getScrrenshotofWebElement (WebElement element) {
		File temp = element.getScreenshotAs(OutputType.FILE);
		File perm=new File(SCREENSHOT_PATH+getSystemData()+".png");
		try {
			FileHandler.copy(temp, perm);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
	}
	
	
	//method to Handle Alert
	public static void switchToAlertAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public static void switchToAlertAndDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	public static void switchToAlertAndGetText(WebDriver driver) {
		driver.switchTo().alert().getText();
	}
	
	
	public static void switchToAlertAndSendText(WebDriver driver,String text) {
		driver.switchTo().alert().sendKeys(text);
	}
	
	
	//Method to handle Mouse Action
	public static void  MouseHover(WebDriver driver,WebElement element) {
		Actions action=new Actions(driver);
		action.click(element).perform();
	}
	
	public static void  rightclick(WebDriver driver,WebElement element) {
		Actions action=new Actions(driver);
		action.contextClick(element).perform();
	}
	
	/**
	 * Method to Handle  Hidden or Disabled button
	 */
	public static void ClickonHiddenorDisabledElament(WebDriver driver,WebElement element) {
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("Arguments[0].click();",element);
		
	}
	
	/**
	 * Method to Handle  Hidden or Disabled text Field
	 */
	public static void EnterTexttoHiddenorDisabledElament(WebDriver driver,WebElement element,String value) {
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("Arguments[0].value='"+ value+"';",element);
		
	}
	
	/**
	 *
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
