package testClasses;

import org.testng.annotations.Test;

import basePkg.BaseClass;
import pagesPkg.LoginPage;

public class LoginTest extends BaseClass {

	@Test
	public void logIn() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		login.clickonLogIn();
		// getting "org.openqa.selenium.ElementClickInterceptedException" on the line 13 
		
		login.enterPhonenumber("411");
		login.clickNextbtn();

	}

}
