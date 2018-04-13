/**
 * 
 */
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import webDriverInitializator.WebDriverInitializator;

/**
 * @author user
 *
 */
public class MainPage {

	private static final String lOGIN = "//*[@id='mailbox:login']";
	private static final String PASS = "//*[@id='mailbox:password']";
	private static final String SUBMIT = "//*[@id='mailbox:submit']";

	private WebDriverWait wait;
	private WebDriver driver;

	public MainPage() {
		driver = WebDriverInitializator.getDriver();
		wait = new WebDriverWait(driver, 10);
	}

	public WebElement getLogin() {
		return wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath(lOGIN)));
	}

	public WebElement getPass() {
		return wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath(PASS)));
	}

	public WebElement getSubmit() {
		return wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath(SUBMIT)));
	}
}
