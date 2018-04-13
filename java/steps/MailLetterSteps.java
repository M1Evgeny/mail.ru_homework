package steps;

import pages.MailLetter;

public class MailLetterSteps {

	public static void clickReply(MailLetter mail) {
		mail.getReplyToLetter().click();
	}

}
