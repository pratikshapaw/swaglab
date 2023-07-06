package qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pages.AddToCart;
import pages.Login;

public class BaseTest {
	
	WebDriver driver;
	Login login;
	AddToCart addtocart;
	
	@BeforeSuite
	public void initBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		
	}
	
	@BeforeClass
	public void createObject()
	{
		login=new Login(driver);
		addtocart=new AddToCart(driver);
	}

}
