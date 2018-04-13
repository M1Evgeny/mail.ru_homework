package steps;

import java.text.SimpleDateFormat;
import java.util.Date;

import pages.WrigthLetter;

public class WrigthLetterSteps {
	private static final String EMAIL = "tathtp@mail.ru";
	private static final String TOPIC = "Test letter";

	public static String wrigthLetter(WrigthLetter page) {
		page.getTo().sendKeys(EMAIL);
		page.getTopic().sendKeys(TOPIC);
		page.switchFrame();
		page.getTextArea().sendKeys(TOPIC);
		page.switchBack();
		page.getSend().click();
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("HH:mm");
		return format.format(date);
	}
	
	public static void wrigthResponseLetter(WrigthLetter page) {
		page.switchFrame();
		page.getTextArea().sendKeys(TOPIC);
		page.switchBack();
		page.getSend().click();
	}

}
