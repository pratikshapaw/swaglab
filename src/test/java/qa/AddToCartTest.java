package qa;

import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {

	@Test(priority=3)
	public void verifySort()
	{
		addtocart.sortDropdown("Price (low to high)");
	}
	
	@Test(priority=4)
	public void verifyAddToCart()
	{
		addtocart.addToCartItem();
	}
}
