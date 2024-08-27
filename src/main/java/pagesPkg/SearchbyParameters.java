package pagesPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilsPkg.ReusableUtility;

public class SearchbyParameters extends ReusableUtility {

	WebDriver driver;

	public SearchbyParameters(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//textarea[@type='search']")
	private WebElement enterParameter;

	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Search')]")
	private WebElement clickOnSearch;

	public void enterProjectA(String ProjectNameA, String SelectProject) {
		scrollIntoView(enterParameter);
		waitUntilVisibility(enterParameter).sendKeys(ProjectNameA);
		wait(5000);
		WebElement selectProject = driver.findElement(By.xpath("//li[contains(text(), '" + SelectProject + "')]"));
		waitUntilClickable(selectProject).click();
		wait(5000);
	}
	
	public void enterLocality(String localityName, String SelectLocality) {
		scrollIntoView(enterParameter);
		waitUntilVisibility(enterParameter).sendKeys(localityName);
		wait(5000);
		WebElement selectLocality = driver.findElement(By.xpath("//li[contains(text(), '" + SelectLocality + "')]"));
		waitUntilClickable(selectLocality).click();
		wait(5000);
	}
	
	public void enterDeveloper(String developerName, String SelectDeveloper) {
		scrollIntoView(enterParameter);
		waitUntilVisibility(enterParameter).sendKeys(developerName);
		wait(5000);
		WebElement selectDeveloper = driver.findElement(By.xpath("//li[contains(text(), '" + SelectDeveloper + "')]"));
		waitUntilClickable(selectDeveloper).click();
		wait(5000);
	}
	
	public void clickOnSearch() {
		waitUntilClickable(clickOnSearch).click();
	}

		public String getHeaderTitle() {
		        // Assuming the header title is in an <h1> tag
		        WebElement header = driver.findElement(By.tagName("h1"));
		        return header.getText();
		    }

	    // Method to verify the header title
	    public boolean verifyHeaderTitle(String expectedTitle) {
	        String actualTitle = getHeaderTitle();
	        return actualTitle.equals(expectedTitle);
	    	}
	    
}
