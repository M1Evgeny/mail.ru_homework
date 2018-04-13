package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import webDriverInitializator.WebDriverInitializator;

public class MailLetter {

	private static final String REPLY_TO_LETTER = "//*[@id='b-toolbar__right']/div[3]/div[1]/div/div[2]/div[2]/div/div[1]/span";

	WebDriver driver;
	WebDriverWait wait;

	public MailLetter() {
		driver = WebDriverInitializator.getDriver();
		wait = new WebDriverWait(driver, 10);
	}

	public WebElement getReplyToLetter() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(REPLY_TO_LETTER)));
	}

}
