package pagesPkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilsPkg.ReusableUtility;

public class FiltersPage extends ReusableUtility {
	WebDriver driver;

	public FiltersPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Search')]")
	private WebElement clickSearch;

	@FindBy(how = How.XPATH, using = "//button[contains(text(), 'Project Status')]")
	private WebElement filterProjectStatus;

	@FindBy(how = How.XPATH, using = "(//a[contains(text(), 'New Project')])[1]")
	private WebElement selectNewProject;

	@FindBy(how = How.XPATH, using = "(//a[contains(text(), 'Under Construction')])[1]")
	private WebElement selectUnderConstruction;

	@FindBy(how = How.XPATH, using = "(//a[contains(text(), 'Ready To Move')])[1]")
	private WebElement selectReadytoMove;

	@FindBy(how = How.XPATH, using = "//button[contains(text(), 'Configuration Type')]")
	private WebElement filterConfigurationType;

	@FindBy(how = How.XPATH, using = "//button[text()='Possession Status']")
	private WebElement filterPossessionStatus;

	@FindBy(how = How.XPATH, using = "//button[text()='Budget']")
	private WebElement filterBudget;

	@FindBy(how = How.XPATH, using = "//button[text()='Carpet Area (Sq.Ft.)']")
	private WebElement filterCarpetArea;

	@FindBy(how = How.XPATH, using = "(//div[@class='rc-slider-handle rc-slider-handle-1'])[1]")
	private WebElement budgetminSlider;

	@FindBy(how = How.XPATH, using = "(//div[@class='rc-slider-handle rc-slider-handle-2'])[1]")
	private WebElement budgetmaxSlider;

	@FindBy(how = How.XPATH, using = "(//div[@class='rc-slider-handle rc-slider-handle-1'])[2]")
	private WebElement carpetAreaminSlider;

	@FindBy(how = How.XPATH, using = "(//div[@class='rc-slider-handle rc-slider-handle-2'])[2]")
	private WebElement carpetAreamaxSlider;

	@FindBy(how = How.XPATH, using = "(//button[text()='Clear All'])[1]")
	private WebElement clearAllbtn;

	public void clickSearch() {
		waitUntilClickable(clickSearch).click();
	}

	public void openProjectStatus() {
		waitUntilClickable(filterProjectStatus).click();
	}

	public void selectUnderConstruction() {
		waitUntilClickable(selectUnderConstruction).click();
	}

	public void selectReadytoMove() {
		waitUntilClickable(selectReadytoMove).click();
	}

	public void openConfigs() {
		waitUntilClickable(filterConfigurationType).click();
	}

	// Method to select a value from the list based on user input
	public void selectValueFromConfigList(String locator, String bhk) {
		List<WebElement> bhkTypes = driver.findElements(By.xpath(locator));
		for (WebElement element : bhkTypes) {
			System.out.println(element.getText());
			if (element.getText().equalsIgnoreCase(bhk)) {
				element.click();
				break;
			}
		}
	}

	public void openPossession() {
		waitUntilClickable(filterPossessionStatus).click();
	}

	// Method to select a value from the list based on user input
	public void selectValueFromPossessionList(String locator, String possessionValue) {
		List<WebElement> possessionDate = driver.findElements(By.xpath(locator));
		for (WebElement element : possessionDate) {
			System.out.println(element.getText());
			if (element.getText().equalsIgnoreCase(possessionValue)) {
				element.click();
				break;
			}
		}
	}

	public void openBudget() {
		waitUntilClickable(filterBudget).click();
		wait(3000);
	}

	public void budgetSliders() {
		Actions budgetActions = new Actions(driver);
		budgetActions.clickAndHold(budgetminSlider).moveByOffset(100, 0).release().perform();
		budgetActions.clickAndHold(budgetmaxSlider).moveByOffset(-100, 0).release().perform();
	}

	public void openCarpetArea() {
		waitUntilClickable(filterCarpetArea).click();
	}

	public void carpetAreaSliders() {
		Actions carpetActions = new Actions(driver);
		carpetActions.clickAndHold(carpetAreaminSlider).moveByOffset(100, 0).release().perform();
		carpetActions.clickAndHold(carpetAreamaxSlider).moveByOffset(-100, 0).release().perform();
	}

	public void clearAllFilters() {
		wait(3000);
		waitUntilClickable(clearAllbtn).click();
	}

}
