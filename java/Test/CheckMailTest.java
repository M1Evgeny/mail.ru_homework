package Test;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.MailLetter;
import pages.MainPage;
import pages.UserProfile;
import pages.WrigthLetter;
import steps.MailLetterSteps;
import steps.MainPageSteps;
import steps.UserProfileSteps;
import steps.WrigthLetterSteps;
import webDriverInitializator.WebDriverInitializator;

public class CheckMailTest {
	private static final String URL = "https://mail.ru/";
	private static final String FROM = "Светлана Захаренко";
	//private static final String FROM = "qaq959 qaq";

	private UserProfile profile;

	@Test
	public void f() throws InterruptedException {
		profile = new UserProfile();
		List<WebElement> list = UserProfileSteps.checkUnreadLetters(profile);
		for (WebElement e : list) {
			if (e.getText().equals(FROM)) {
				e.click();
				MailLetter mail = new MailLetter();
				MailLetterSteps.clickReply(mail);
				WrigthLetter letter = new WrigthLetter();
				WrigthLetterSteps.wrigthResponseLetter(letter);
			}
		}
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
