package pagesPkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilsPkg.ReusableUtility;

public class LoginPage extends ReusableUtility {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.CSS, using = "div[class='custompadding'] a[class='btn btn-primary sc login-btn d-767-none-i overlay-button text-nowrap btn-login']")
	private List<WebElement> clickonLogIn;

	@FindBy(how = How.XPATH, using = "(//input[@id='floatingEmail11'])[1]")
	private WebElement enterPhone;

	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Next')]")
	private WebElement clickNext;

	public void clickonLogIn() throws InterruptedException {
		Thread.sleep(6000);
		jsClick(clickonLogIn.get(1));
	}

	public void enterPhonenumber(String Phone) throws InterruptedException {
		waitUntilVisibility(enterPhone).sendKeys(Phone);
	}

	public void clickNextbtn() throws InterruptedException {
		jsClick(clickNext);	
		
		 // Locate the error message element
        WebElement errorMessageElement = driver.findElement(By.xpath("//div[@class='text-danger error-msg']"));

        // Verify that the error message is displayed
        Assert.assertTrue(errorMessageElement.isDisplayed(), "Error message is not displayed.");

        // Verify that the error message text matches the expected value
        String actualErrorMessage = errorMessageElement.getText();
        String expectedErrorMessage = "Invalid phone number format";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message text does not match.");

	}
}
