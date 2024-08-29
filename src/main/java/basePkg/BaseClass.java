package basePkg;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;
	public float[] pixels;

	@BeforeMethod
	public void steup() {
		pixels = getCurrentScreenPixels();
		ChromeOptions options = new ChromeOptions();
		// ================ Zoom =================
		options.addArguments("force-device-scale-factor=" + (pixels[1] / pixels[0]));
		options.addArguments("high-dpi-support=" + (pixels[1] / pixels[0]));
		// ================Add Extension==========
		// options.addExtensions(new File(System.getProperty("user.dir") +
		// "/Extensions/AdBlock.crx"));
		// ================To disable Automation name==========
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		// ================To disble notification popup========
		options.addArguments("--disable-notifications");
		options.addArguments("--start-maximized");
		options.addArguments("--disable-web-security");
		options.addArguments("--no-proxy-server");
		Map<String, Object> p = new HashMap<String, Object>();
		p.put("credentials_enable_service", false);
		p.put("profile.password_manager_enabled", false);
		// ================Set Download Location Config ================
		p.put("profile.default_content_settings.popups", 0);
		p.put("download.prompt_for_download", "true");
		// p.put("download.default_directory", System.getProperty("user.dir") + "\\" +
		// prop("DownloadLocation"));
		options.setExperimentalOption("prefs", p);
		// =================Dark Mode =========================
		options.addArguments("--force-dark-mode");
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Rajat/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.beyondwalls.com/");
		driver.getTitle();

	}

	public float[] getCurrentScreenPixels() {
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();

		// width will store the width of the screen
		float width = (float) size.getWidth();

		// height will store the height of the screen
		float height = (float) size.getHeight();

		System.out.println("Current Screen resolution : " + "width : " + width + " height : " + height);
		float ary[] = { width, height };
		return ary;
	}

//	@AfterMethod
//	public void tearDown() {
//		if (driver != null) {
//			driver.quit();
//		}
//	}

}
