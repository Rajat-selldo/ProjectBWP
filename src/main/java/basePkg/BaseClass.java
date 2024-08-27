package basePkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;

	@BeforeMethod
	public void steup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Rajat/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.beyondwalls.com/");
		driver.getTitle();

	}

//	@AfterMethod
//	public void tearDown() {
//		if (driver != null) {
//			driver.quit();
//		}
//	}

}
