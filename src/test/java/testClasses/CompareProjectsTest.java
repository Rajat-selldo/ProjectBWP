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
		String pro1 =test.compareprojectA();
		String pro2 =test.compareprojectB();
		System.out.println(pro1 +" "+pro2);
		test.goToComparePage();
		test.verifyRedirectedPageProjectValues(pro1,pro2);
		
	}
}