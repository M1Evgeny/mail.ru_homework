package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import webDriverInitializator.WebDriverInitializator;

public class SentLetters {
	private static final String SENT_TIME = "//*[@id='b-letters']//*[@class='b-datalist__item__date']/span";
	WebDriver driver;
	WebDriverWait wait;

	public SentLetters() {
		driver = WebDriverInitializator.getDriver();
		wait = new WebDriverWait(driver, 10);
	}
	
	public List<WebElement> getSentTime(){
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(SENT_TIME)));
	}
}
