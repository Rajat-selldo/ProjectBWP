package testClasses;

import org.testng.annotations.Test;

import basePkg.BaseClass;
import pagesPkg.CompareProjectsPage;
import pagesPkg.SearchbyParameters;

public class CompareProjectsTest extends BaseClass {

	@Test
	public void compareProjects() {
		SearchbyParameters test1 = new SearchbyParameters(driver);
		test1.enterLocality("Baner", "Baner");
		CompareProjectsPage test = new CompareProjectsPage(driver);
		test.compareprojectA("checkbox-zenistry-b");
		test.compareprojectB();
		test.goToComparePage();
	}
}
