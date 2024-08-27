package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import basePkg.BaseClass;
import pagesPkg.SearchbyParameters;

public class SearchbyProjectsTest extends BaseClass {

	//Search by Project name method
	@Test
	public void searchbyProjectName() {
		SearchbyParameters search1 = new SearchbyParameters(driver);
		search1.enterProjectA("Joyville", "Joyville Celestia Phase 1");
	
		// Verify the header title
	    String expectedTitle = "Joyville Celestia Phase 1";
	    boolean isTitleCorrect = search1.verifyHeaderTitle(expectedTitle);

    // Assert the result
    Assert.assertTrue(isTitleCorrect, "Header title is not as expected. Expected: " + expectedTitle);

	}

	//Search by Locality method
//	public void searchbyLocality() {
//		SearchbyParameters search2 = new SearchbyParameters(driver);
//		search2.enterLocality("Akurdi", "Akurdi");
//	}

	//Search by Developer name method
//	public void searchbyDeveloper() {
//		SearchbyParameters search3 = new SearchbyParameters(driver);
//		search3.enterDeveloper("Godrej", "Godrej Developers");
//	}

}
