package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='user-name']") WebElement username;
	@FindBy(xpath="//*[@id='password']") WebElement password;
	@FindBy(xpath="//*[@ class='error-button']") WebElement errorbutton;
	@FindBy(xpath="//*[@id='login-button']") WebElement loginbutton;
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	public void enterCredentials() throws InterruptedException
	{
		username.sendKeys("standard_user");
		Thread.sleep(2000);
		password.sendKeys("secret_sauce");
		
	}
	
	public void verifyLoginButton() 
	{
		//errorbutton.click();
		//Thread.sleep(2000);
		loginbutton.click();
	}
	

}
