package objectRepositery;

import java.text.RuleBasedCollator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Homepage1 {
	
	
	public Homepage1(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(partialLinkText  = "Computers")
	private WebElement ComputerLink;

	public WebElement getComputerLink() {
		return ComputerLink;
	}
	@FindBy(linkText = "Register")
	private WebElement RegisterLink;
	
	@FindBy(linkText = "Log in")
	private WebElement LoginLink;
	
	@FindBy(partialLinkText = "Shopping")
	private WebElement ShoppingCartLink;
	
	@FindBy(partialLinkText = "Wishlist")
	private WebElement WishlistLink;
	
	@FindBy(id = "small-searchterms")
	private WebElement SearchBar;
	
	
	@FindBy(css = "[value='Search']")
	private WebElement Searchbutton;
	
	@FindBy(partialLinkText = "BOOKS")
	private WebElement booksLink;

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	@FindBy(partialLinkText = "Log out")
	private WebElement logoutButton;
	
	public WebElement getRegisterLink() {
		return RegisterLink;
	}

	public WebElement getLoginLink() {
		return LoginLink;
	}

	public WebElement getShoppingCartLink() {
		return ShoppingCartLink;
	}

	public WebElement getWishlistLink() {
		return WishlistLink;
	}

	public WebElement getSearchBar() {
		return SearchBar;
	}

	public WebElement getSearchbutton() {
		return Searchbutton;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}


}
