package testClasses;

import org.testng.annotations.Test;

import basePkg.BaseClass;
import pagesPkg.FiltersPage;

public class FiltersTest extends BaseClass {

	@Test
	public void projectStatus() {

		FiltersPage filters = new FiltersPage(driver);
		filters.clickSearch();
		filters.openConfigs();
		filters.selectValueFromConfigList(
				"//button[text()='Configuration Type']/parent::h2/parent::div//a[@class='btn btn-outline-secondary me-2 mb-2 ']",
				"2 BHK");
		filters.openPossession();
		filters.selectValueFromPossessionList(
				"//button[text()='Possession Status']//parent::h2//parent::div//a[@class='btn btn-outline-secondary me-2 mb-2 ']",
				"In 6 months");
	}

}
