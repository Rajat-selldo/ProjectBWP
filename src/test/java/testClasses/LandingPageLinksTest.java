package testClasses;

import org.testng.annotations.Test;

import basePkg.BaseClass;
import pagesPkg.LandingPageLinks;

public class LandingPageLinksTest extends BaseClass {

	@Test
	public void ViewMoreProjects() {
		LandingPageLinks view = new LandingPageLinks(driver);
//		view.clickOnTopProjects();
//		view.viewProject("Sukhwani");		
//		view.hotSellingSection();
		view.affordableHomesSection();
	}
	
	@Test
	public void ExploreMore() {
		LandingPageLinks view = new LandingPageLinks(driver);
//		view.localitiesInPune();
//		view.localityListSelection("Balewadi");
		view.readyMoveInSection();
	}

}
