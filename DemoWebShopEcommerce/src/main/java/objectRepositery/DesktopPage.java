package objectRepositery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopPage {
	
	
	public DesktopPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getProductLink() {
		return productLink;
	}

	@FindBy(partialLinkText = "Build your own cheap computer")
	private WebElement productLink;

}
