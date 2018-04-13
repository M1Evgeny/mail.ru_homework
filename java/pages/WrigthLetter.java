package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import webDriverInitializator.WebDriverInitializator;

public class WrigthLetter {
	private static final String TO = "//*[@class='compose-head__content js-collapsed-off']//textarea[@class='js-input compose__labels__input']";
	private static final String TOPIC = "//*[@class='compose-head__row-wrapper compose-head__row-wrapper_subject js-row']//*[@class='b-input']";
	private static final String FRAME = "//*[@class='mceLayout']//iframe";
	private static final String TEXT_AREA = "//*[@id='tinymce']";
	private static final String SEND = "//*[@id='b-toolbar__right']//div[@class='b-toolbar__item b-toolbar__item_ b-toolbar__item_false']//span";

	WebDriver driver;
	WebDriverWait wait;

	public WrigthLetter() {
		driver = WebDriverInitializator.getDriver();
		wait = new WebDriverWait(driver, 10);
	}

	public WebElement getTo() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(TO)));
	}

	public WebElement getTopic() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(TOPIC)));
	}

	public WebElement getTextArea() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(TEXT_AREA)));
	}

	public void switchFrame() {
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(FRAME)));
	}
	
	public void switchBack() {
		driver.switchTo().defaultContent();
	}
	
	public WebElement getSend() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(SEND)));
	}

}
