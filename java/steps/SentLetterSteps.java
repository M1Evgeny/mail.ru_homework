package steps;

import java.util.List;

import org.openqa.selenium.WebElement;

import pages.SentLetters;

public class SentLetterSteps {

	public static boolean checkLetter(SentLetters page, String time) {
		boolean result = false;
		List<WebElement> list = page.getSentTime();
		for (WebElement e : list) {
			if (e.getText().equals(time)) {
				result = true;
			}
		}
		return result;
	}

}
