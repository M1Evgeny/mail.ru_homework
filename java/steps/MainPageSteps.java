package steps;

import pages.MainPage;

public class MainPageSteps {

	private static final String USER_LOGIN = "TATHTP";
	private static final String USER_PASS = "Klopik123";

	public static void createMainPageSteps(MainPage main) {

		main.getLogin().sendKeys(USER_LOGIN);
		main.getPass().sendKeys(USER_PASS);
		main.getSubmit().click();
	}

}
