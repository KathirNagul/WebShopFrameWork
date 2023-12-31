package objectRepositery;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ComputerPage {
	
	
	public ComputerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(partialLinkText = "Desktops")
	private WebElement DesktopLink;
	
	

	public WebElement getDesktopLink() {
		return DesktopLink;
	}
	
	
	

}
