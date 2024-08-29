package testClasses;

import org.testng.annotations.Test;

import basePkg.BaseClass;
import pagesPkg.LoginPage;

public class LoginTest extends BaseClass {

	@Test
	public void logIn() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		login.clickonLogIn();		
		login.enterPhonenumber("788");
		login.clickNextbtn();

	}

}
