package objectRepositery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	
	
	
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id="add-to-cart-button-72")
	private WebDriver addtocartbutton;

	public WebDriver getAddtocartbutton() {
		return addtocartbutton;
	}

}
