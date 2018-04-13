package Test;

import org.testng.annotations.Test;

import pages.MainPage;
import pages.SentLetters;
import pages.UserProfile;
import pages.WrigthLetter;
import steps.MainPageSteps;
import steps.SentLetterSteps;
import steps.UserProfileSteps;
import steps.WrigthLetterSteps;
import webDriverInitializator.WebDriverInitializator;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class MailSendTest {
	private static final String URL = "https://mail.ru/";

	private UserProfile profile;

	@Test
	public void f() throws InterruptedException {
		Thread.sleep(2000);
		profile = new UserProfile();
		UserProfileSteps.wrigthUserLetter(profile);
		WrigthLetter letter = new WrigthLetter();
		String timeSend = WrigthLetterSteps.wrigthLetter(letter);
		UserProfileSteps.checkSentLetters(profile);
		SentLetters letters = new SentLetters();
		Thread.sleep(2000);
		boolean result = SentLetterSteps.checkLetter(letters, timeSend);
		Assert.assertTrue(result, "The letter was sent");
	}

	@BeforeClass
	public void beforeClass() {
		WebDriver driver = WebDriverInitializator.getDriver();
		driver.get(URL);
		MainPage main = new MainPage();
		MainPageSteps.createMainPageSteps(main);
	}

	@AfterClass
	public void afterClass() {
		UserProfileSteps.logoutFromUserProfile(profile);
		WebDriverInitializator.DestructWebDriver();
	}

}
