package steps;

import java.util.List;

import org.openqa.selenium.WebElement;

import pages.UserProfile;

public class UserProfileSteps {

	public static String createUserProfileSteps(UserProfile profile) {
		return profile.getUserProfile().getText();
	}

	public static void wrigthUserLetter(UserProfile profile) {
		profile.getWrigthLetter().click();
	}

	public static void checkSentLetters(UserProfile profile) {
		profile.getSentLetters().click();
	}

	public static List<WebElement> checkUnreadLetters(UserProfile profile) throws InterruptedException {
		Thread.sleep(2000);
		profile.getUnreadLetters().click();
		Thread.sleep(2000);
		List<WebElement> list = profile.getUnreadLettersFrom();
		return list;
	}

	public static void logoutFromUserProfile(UserProfile profile) {
		profile.getLogout().click();
	}

}
