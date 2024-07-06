package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class profilePage {
	public WebDriver ldriver;

	public profilePage(WebDriver rdriver) {
		ldriver = rdriver;

		PageFactory.initElements(ldriver, this);
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/p")
	WebElement dailyReward;

	@FindBy(xpath = "//div/p[contains(text(), 'T')]")
	WebElement profile;

	@FindBy(xpath = "//div/span[contains(text(), 'My Stats')]")
	WebElement mystats;

	@FindBy(xpath = "//div/span[contains(text(), 'My Transactions')]")
	WebElement txns;

	@FindBy(xpath = "//div/span[contains(text(), 'Refer & Earn')]")
	WebElement refearn;

	@FindBy(xpath = "//div/span[contains(text(), 'Pending earnings')]\"")
	WebElement pendearn;

	@FindBy(xpath = "//div/span[contains(text(), 'Login Info')]")
	WebElement loginInfo;

	@FindBy(xpath = "//div/span[contains(text(), 'Logout')]")
	WebElement logout;

	public void dailyrwd() {
		dailyReward.click();
	}

	public void profilePage2() {
		profile.click();
	}

	public void stats() {
		mystats.click();
	}

	public void txnss() {
		txns.click();
	}

	public void refer() {
		refearn.click();
	}

	public void pending() {
		pendearn.click();
	}

	public void lginfo() {
		loginInfo.click();
	}

	public void lgout() {
		logout.click();
	}
	public void link() {
		String actURL2 = ldriver.getCurrentUrl();
		return;
	}

}
