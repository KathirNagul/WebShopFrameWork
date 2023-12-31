package objectRepositery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genricLibrary.FileUtility;

public class LoginPage {
	
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id = "Email")
	private WebElement emailteextfield;
	
	@FindBy(id="Password")
	private WebElement passwordtextfield;
	
	@FindBy(id="RemamberMe")
	private WebElement remembermecheckbox;
	
	@FindBy(linkText = "Forgot password?")
	private WebElement forgotpasswoedLink;
	
	@FindBy(css = "[value='Log in']")
	private WebElement loginButton;

	public WebElement getEmailteextfield() {
		return emailteextfield;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getRemembermecheckbox() {
		return remembermecheckbox;
	}

	public WebElement getForgotpasswoedLink() {
		return forgotpasswoedLink;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	/**
	 * This is used to login tha application
	 */
	public void login(WebDriver driver) {
		Homepage1 homepage=new Homepage1(driver);
		LoginPage login=new LoginPage(driver);
		
		homepage.getLoginLink().click();
		login.getEmailteextfield().sendKeys(FileUtility.getproperty("email"));
		login.getPasswordtextfield().sendKeys(FileUtility.getproperty("password"));
		login.getLoginButton().click();
		
	}
	
	/**
	 * This method is used to Log out the application
	 */
	public void LogOut(WebDriver driver) {
		Homepage1 homepage=new Homepage1(driver);
		homepage.getLogoutButton().click();
		}




}
