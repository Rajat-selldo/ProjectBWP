package utilsPkg;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableUtility {

	private WebDriver driver;

	private static int zoom;

	private final static int waitingTime_Sec = 5;

	public ReusableUtility(WebDriver driver) {

		this.driver = driver;

	}

	protected WebElement waitUntilVisibility(WebElement we) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitingTime_Sec));

		wait.until(ExpectedConditions.visibilityOf(we));

		Square(we);

		return we;

	}

	protected WebElement waitUntilClickable(WebElement we) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitingTime_Sec));

		wait.until(ExpectedConditions.elementToBeClickable(we));

		System.out.println("Clicked Element -> " + we.getText().trim());

		Square(we);

		return we;

	}

	protected WebElement Square(WebElement we) {

		// wait(500);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		zoom = 80;

		// js.executeScript("document.body.style.zoom='"+(zoom+0.10)+"%'");

		js.executeScript("arguments[0].style.border='5px solid Green'", we);

		return we;

	}

	protected void wait(int value) {

		try {

			Thread.sleep(value);

		} catch (InterruptedException e) {

			e.printStackTrace();

		}

	}

	protected void scrollIntoView(WebElement we) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true);", we);

		scrollBy(-1000);

		wait(3000);

		Square(we);

	}

	protected void scrollBy(int scroll) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0," + scroll + ")", "");

	}
	
	// JavaScript click method
    public void jsClick(WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", element);
    }

}
