package qa;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	@Test(priority=1)
	public void verifyLoginCredentials() throws InterruptedException
	{
		login.enterCredentials();
	}
	
	@Test(priority=2)
	public void verifyLoginButtonFun()
	{
		login.verifyLoginButton();
	}

}
