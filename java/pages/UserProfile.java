package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import webDriverInitializator.WebDriverInitializator;

public class UserProfile {
	private static final String USER_PROFILE = "//*[@id='PH_user-email']";
	private static final String LOGOUT = "//*[@id='PH_logoutLink']";
	private static final String WRIGTH_LETTER = "//*[@id=\"b-toolbar__left\"]//div[@class='b-toolbar__item']//span";
	private static final String SENT_LETTERS = "//*[@id='b-nav_folders']/div/div[2]/a/span";
	private static final String LETTER_FROM = "//div[@class='b-datalist__item__addr']";
	private static final String UNREAD_LETTERS = "//*[@id='b-toolbar__right']/div[2]/div/div[1]/div[2]/div/div[1]/i";

	WebDriver driver;
	WebDriverWait wait;

	public UserProfile() {
		driver = WebDriverInitializator.getDriver();
		wait = new WebDriverWait(driver, 10);
	}

	public WebElement getUserProfile() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(USER_PROFILE)));
	}

	public WebElement getLogout() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LOGOUT)));
	}

	public WebElement getWrigthLetter() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(WRIGTH_LETTER)));
	}

	public WebElement getSentLetters() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(SENT_LETTERS)));
	}

	public List<WebElement> getLettersFrom() {
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(WRIGTH_LETTER)));
	}
	
	public WebElement getUnreadLetters() {
		//return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(UNREAD_LETTERS)));
		return driver.findElement(By.xpath(UNREAD_LETTERS));
	}
	
	public List<WebElement> getUnreadLettersFrom() {
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(LETTER_FROM)));
	}

}
