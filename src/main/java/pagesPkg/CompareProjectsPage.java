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

public class CompareProjectsPage extends ReusableUtility {

	WebDriver driver;
	String projectNameAforComparison = "";
	String projectNameBforComparison = "";

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

	@FindBy(how = How.CSS, using = "div[class='tabcontent rounded-8 plp-card mb-3'] div[class='compare-btn text-end position-relative ']")
	private List<WebElement> getComppareButton;
	@FindBy(how = How.CSS, using = "div[class='tabcontent rounded-8 plp-card mb-3'] h2[class='plpcard-name m-0']")
	private List<WebElement> getProjectName;

	public String compareprojectA() {
		int selectProject = 1;
		waitUntilClickable(getComppareButton.get(selectProject - 1)).click();
		return getProjectName.get(selectProject - 1).getText().trim();
//		scrollIntoView(projectA);
//		jsClick(projectA);
	}

	public String compareprojectB() {
		int selectProject = 1;
		scrollIntoView(getComppareButton.get(selectProject));
		waitUntilClickable(getComppareButton.get(selectProject - 1)).click();
		return getProjectName.get(selectProject).getText().trim();
//		scrollIntoView(projectB);
//		jsClick(projectB);
	}

	public void goToComparePage() {
		jsClick(goToCompare);
		wait(5000);
	}

	public void viewDetails() {
		scrollIntoView(viewDetails);
		jsClick(viewDetails);
	}

	public void verifyRedirectedPageProjectValues(String project1, String project2) {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String ary[] = project1.toLowerCase().split(" ");
		String ary2[] = project2.toLowerCase().split(" ");
		projectNameAforComparison = ary[ary.length - 2] + "-" + ary[ary.length - 1];
		projectNameBforComparison = ary2[ary2.length - 2] + "-" + ary2[ary2.length - 1];
		System.out.println("A >> " + projectNameAforComparison);

		System.out.println("B >> " + projectNameBforComparison);

		Assert.assertEquals(currentUrl, "https://www.beyondwalls.com/projects/comparison/?projects="
				+ projectNameAforComparison + "," + projectNameBforComparison + "",
				"Not redirected to the expected URL");
	}

}
