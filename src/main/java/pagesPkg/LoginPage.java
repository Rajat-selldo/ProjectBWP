package pagesPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilsPkg.ReusableUtility;

public class LoginPage extends ReusableUtility {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/header[1]/div/div/div/div/a[2]/span")
	private WebElement clickonLogIn;

	@FindBy(how = How.XPATH, using = "(//input[@id='floatingEmail11'])[1]")
	private WebElement enterPhone;

	@FindBy(how = How.XPATH, using = "")
	private WebElement clickNext;

	public void clickonLogIn() {
		waitUntilVisibility(clickonLogIn).click();
	}

	public void enterPhonenumber(String Phone) throws InterruptedException {
		waitUntilVisibility(enterPhone).sendKeys(Phone);
	}

	public void clickNextbtn() throws InterruptedException {
		waitUntilClickable(clickNext).click();
	}

}
