package testClasses;

import org.testng.annotations.Test;

import basePkg.BaseClass;
import pagesPkg.LoginPage;

public class LoginTest extends BaseClass {

	@Test
	public void logIn() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		login.clickonLogIn();		
		login.enterPhonenumber("8956920329");
		login.clickNextbtn();
		
		login.enterOtp();
		login.clickContinue();

	}

}
