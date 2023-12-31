package testScripts;

import java.awt.Desktop;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genricLibrary.BaseClass;
import objectRepositery.AddToCartPage;
import objectRepositery.ComputerPage;
import objectRepositery.DesktopPage;
import objectRepositery.Homepage1;

public class BuyProduct extends BaseClass{
	@Test
	public void Purchase_Computer() {
		
		Homepage1 home=new Homepage1(driver);
		ComputerPage computer=new ComputerPage(driver);
		DesktopPage desktop=new DesktopPage(driver);
		AddToCartPage add=new AddToCartPage(driver);
		
		home.getComputerLink().click();
		computer.getDesktopLink().click();
		desktop.getProductLink().click();
		driver.findElement(By.id("add-to-cart-button-72")).click();
		
		
		
	}

}
