package objectRepositery;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JewelleryPage {
	
	@FindBy(partialLinkText = "Jewelry\r\n")
	private WebElement jewelryLink;

}
