package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	WebDriver ldriver;

	public void loginPages(WebDriver rdriver) {
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//div[@class= 'get_start_mobile']")
	WebElement mob;

	@FindBy(xpath = "//input[@class= 'PhoneInputInput']")
	WebElement mobNum;

	@FindBy(xpath = "//div[@class= 'submitButton']")
	WebElement submit;

	@FindBy(xpath = "//h6[@class= 'okayButton_v1']")
	WebElement popup;

	@FindBy(xpath = "//input[@aria-label= 'Please enter OTP character 1']")
	WebElement o1;

	@FindBy(xpath = "//input[@aria-label= 'Please enter OTP character 2']")
	WebElement o2;

	@FindBy(xpath = "//input[@aria-label= 'Please enter OTP character 3']")
	WebElement o3;

	@FindBy(xpath = "//input[@aria-label= 'Please enter OTP character 4']")
	WebElement o4;

	@FindBy(xpath = "//input[@aria-label= 'Please enter OTP character 5'")
	WebElement o5;

	@FindBy(xpath = "//input[@aria-label= 'Please enter OTP character 6']")
	WebElement o6;

	@FindBy(xpath = "//div[@class= 'submitButton']")
	WebElement okay;

	public void mobileNumber(String mobn) throws InterruptedException {
		Thread.sleep(3000);
		mob.click();
		mobNum.sendKeys(mobn);
		submit.click();
		okay.click();
	}

	public void otp(String a, String b, String c, String d, String e, String f) {
		o1.sendKeys(a);
		o2.sendKeys(b);
		o3.sendKeys(c);
		o4.sendKeys(d);
		o5.sendKeys(e);
		o6.sendKeys(f);
		okay.click();
	}

}
