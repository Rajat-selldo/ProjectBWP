package pagesPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilsPkg.ReusableUtility;

public class LandingPageLinks extends ReusableUtility {

	WebDriver driver;

	public LandingPageLinks(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "// a[contains(text(), 'View More')]")
	private WebElement topProjectsinPune;
	
	@FindBy(how = How.XPATH, using = "//div[@class='localbgbox']//img[@class='img-fluid']")
	private WebElement knowYourLocality;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/section[3]/div/div/div[1]/a")
	private WebElement exploreMore1;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/section[5]/div/div/div/div[2]/a")
	private WebElement exploreMore2;
	
	@FindBy(how = How.XPATH, using = "//div[@class='ceobox']//a[@href='https://corporate.beyondwalls.com/']")
	private WebElement exploreMore3;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/blog/what-are-the-financial-benefits-of-owning-a-home']")
	private WebElement exploreMore4;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/blog/property-tax-in-india']")
	private WebElement exploreMore5;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/blog/first-home-buying-guide']")
	private WebElement exploreMore6;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/blog/rera-everything-first-time-homebuyers-need-to-know']")
	private WebElement exploreMore7;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/blog/home-buying-checklist']")
	private WebElement exploreMore8;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/blog/top-localities-in-pune-to-buy-home']")
	private WebElement exploreMore9;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/projects?is_ready_to_move=true']/div/div//img[@class='img-fluid']")
	private WebElement readyToMoveIn;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/projects?is_great_view=true']/div/div//img[@class='img-fluid']")
	private WebElement whatAView;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/projects?is_new_in_town=true']/div/div//img[@class='img-fluid']")
	private WebElement newInTown;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/projects?is_hot_selling=true']/div/div//img[@class='img-fluid']")
	private WebElement hotSelling;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/projects?is_affordable=true']/div/div//img[@class='img-fluid']")
	private WebElement affordableHomes;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/projects?is_live_in_sky=true']/div/div//img[@class='img-fluid']")
	private WebElement liveIntheSky;
	

	public void clickOnTopProjects() {
//		scrollIntoView(topProjectsinPune);
//		waitUntilClickable(topProjectsinPune).click();
		
		jsClick(topProjectsinPune);
		wait(2000);
	}
	
	public void knowYourLocality() {
		scrollIntoView(knowYourLocality);
		waitUntilClickable(knowYourLocality).click();
		wait(2000);
	}
	
	public WebElement localityListSelection(String localityName) {
		String localityName2 = "(//ul[@class='locality-list-wrap mt-4 position-relative']//a[contains(text(), '" + localityName + "')])[1]";
		wait(5000);
		return driver.findElement(By.xpath(localityName2));
	}
	
	public WebElement viewProject(String projectText) {
		String projectName2 = "//h3[contains(text(),'" + projectText + "')]";
		wait(2000);
	    return driver.findElement(By.xpath(projectName2));
	}
	
	public void localitiesInPune() {
		scrollIntoView(exploreMore1);
		waitUntilClickable(exploreMore1).click();
		wait(2000);
	}
	
	public void compareSection() {
		scrollIntoView(exploreMore2);
		waitUntilClickable(exploreMore2).click();
		wait(2000);
	}
	
	public void corporateBw() {
		scrollIntoView(exploreMore3);
		waitUntilClickable(exploreMore3);
		wait(2000);
	}
	
	public void financialBenefit() {
		scrollIntoView(exploreMore4);
		waitUntilClickable(exploreMore4);
		wait(2000);
	}
	
	public void taxInIndia() {
		scrollIntoView(exploreMore5);
		waitUntilClickable(exploreMore5);
		wait(2000);
	}
	
	public void homeBuyingGuide() {
		scrollIntoView(exploreMore6);
		waitUntilClickable(exploreMore6);
		wait(2000);
	}
	
	public void reraDetails() {
		scrollIntoView(exploreMore7);
		waitUntilClickable(exploreMore7);
		wait(2000);
	}
	
	public void homeBuyingChecklist() {
		scrollIntoView(exploreMore8);
		waitUntilClickable(exploreMore8);
		wait(2000);
	}
	
	public void topLocalitiesinPune() {
		scrollIntoView(exploreMore9);
		waitUntilClickable(exploreMore9);
		wait(2000);
	}
	
	public void readyMoveInSection() {
		scrollIntoView(readyToMoveIn);
		jsClick(readyToMoveIn);
		wait(2000);
	}
	
	public void whatAViewSection() {
		scrollIntoView(whatAView);
		jsClick(whatAView);
		wait(2000);
	}
	
	public void newinTownSection() {
		scrollIntoView(newInTown);
		jsClick(newInTown);
		wait(2000);
	}
	
	public void hotSellingSection() {
		scrollIntoView(hotSelling);
		jsClick(hotSelling);
		wait(2000);
	}
	
	public void affordableHomesSection() {
		scrollIntoView(affordableHomes);
		jsClick(affordableHomes);
		wait(2000);
	}
	
	public void liveIntheSkySection() {
		scrollIntoView(liveIntheSky);
		jsClick(liveIntheSky);
		wait(2000);
	}
	
	

}
