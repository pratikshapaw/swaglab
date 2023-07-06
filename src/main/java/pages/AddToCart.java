package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddToCart {

	WebDriver driver;
	
	@FindBy(xpath="//*[@class='product_sort_container']") WebElement sortby;
	@FindBy(xpath="//*[@id='add-to-cart-test.allthethings()-t-shirt-(red)']") WebElement addtocartbutton;
	
	public AddToCart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	public void sortDropdown(String visible)
	{

		Select sel=new Select(sortby);
		sel.selectByVisibleText(visible);
	}
	
	public void addToCartItem()
	{
		addtocartbutton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
