package pagesPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilsPkg.ReusableUtility;

public class CompareProjectsPage extends ReusableUtility {

	WebDriver driver;

	public CompareProjectsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='checkbox-nyati-emerald']")
	private WebElement projectA;

	@FindBy(how = How.XPATH, using = "//input[@id='checkbox-kasturi-the-balmoral-riverside-tower-b-phase-3']")
	private WebElement projectB;

	@FindBy(how = How.XPATH, using = "//a[@id='compare-project-link']")
	private WebElement goToCompare;
	
	@FindBy(how = How.XPATH, using = "(//a[contains(text(), 'VIEW DETAIL')])[1]")
	private WebElement viewDetails;

	public void compareprojectA(String projectNameforComparison) {

		WebElement projectName = driver.findElement(By.xpath("//input[@id='" + projectNameforComparison + "']"));
		scrollIntoView(projectName);
		jsClick(projectName);

//		scrollIntoView(projectA);
//		jsClick(projectA);
	}

	public void compareprojectB() {
		scrollIntoView(projectB);
		jsClick(projectB);
	}

	public void goToComparePage() {
		jsClick(goToCompare);
		wait(5000);
	}
	
	public void viewDetails(){
		scrollIntoView(viewDetails);
		jsClick(viewDetails);
	}

}
