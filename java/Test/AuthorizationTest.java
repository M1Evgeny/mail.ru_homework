package Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import pages.MainPage;
import pages.UserProfile;
import steps.MainPageSteps;
import steps.UserProfileSteps;
import webDriverInitializator.WebDriverInitializator;

public class AuthorizationTest {
	private static final String URL = "https://mail.ru/";
	private static final String USER_PROFILE_NAME = "tathtp@mail.ru";
	private UserProfile profile;

	@BeforeClass
	public void beforeClass() {
		WebDriver driver = WebDriverInitializator.getDriver();
		driver.get(URL);
	}

	@Test
	public void f() throws InterruptedException {
		MainPage main = new MainPage();
		MainPageSteps.createMainPageSteps(main);
		profile = new UserProfile();
		String userName = UserProfileSteps.createUserProfileSteps(profile);
		Assert.assertEquals(USER_PROFILE_NAME, userName);
	}

	@AfterClass
	public void afterClass() {
		UserProfileSteps.logoutFromUserProfile(profile);
		WebDriverInitializator.DestructWebDriver();
	}

}

