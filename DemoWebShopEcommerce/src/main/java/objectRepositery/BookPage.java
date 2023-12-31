package objectRepositery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class BookPage {
	
	
	public BookPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='page-title']//h1")
	private WebElement bookpageHeading;
	
	@FindBy(id="products-orderby")
	private WebElement sortbyDropDown;
	
	@FindBy(id="products-pagesize")
	private WebElement DisplayDropDown;

	public WebElement getSortbyDropDown() {
		return sortbyDropDown;
	}

	public WebElement getDisplayDropDown() {
		return DisplayDropDown;
	}

	public WebElement getBookpageHeading() {
		return bookpageHeading;
	}

	
}
