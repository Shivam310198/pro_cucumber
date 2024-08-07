package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	public WebDriver ldriver;

	public loginPage(WebDriver rdriver) {
		ldriver = rdriver;

		PageFactory.initElements(ldriver, this);
	}

	@FindBy(xpath = "//input[@class= 'PhoneInputInput']")
	WebElement mob;

	@FindBy(xpath = "//input[@class= 'PhoneInputInput']")
	WebElement mobNum;

	@FindBy(xpath = "//div[@class= 'submitButton']")
	WebElement submit;

	@FindBy(xpath = "//div/h6[@class= 'okayButton_v1']") // xpath = "//h6[@class= 'okayButton_v1']"
	WebElement popup;

	@FindBy(xpath = "//input[@aria-label= 'Please enter OTP character 1']")
	WebElement o1;

	@FindBy(xpath = "//input[@aria-label= 'Please enter OTP character 2']")
	WebElement o2;

	@FindBy(xpath = "//input[@aria-label= 'Please enter OTP character 3']")
	WebElement o3;

	@FindBy(xpath = "//input[@aria-label= 'Please enter OTP character 4']")
	WebElement o4;

	@FindBy(xpath = "//input[@aria-label= 'Please enter OTP character 5']")
	WebElement o5;

	@FindBy(xpath = "//input[@aria-label= 'Please enter OTP character 6']")
	WebElement o6;

	@FindBy(xpath = "//div[@class= 'submitButton']")
	WebElement okay1;

	public void mobileNumber(String m){
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mob.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mobNum.sendKeys(m);
		submit.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		okay.click();
		Actions actions = new Actions(ldriver);
		actions.moveToElement(popup).click().build().perform();
	}

	public void otp(String a, String b, String c, String d, String e, String f){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		o1.sendKeys(a);
		o2.sendKeys(b);
		o3.sendKeys(c);
		o4.sendKeys(d);
		o5.sendKeys(e);
		o6.sendKeys(f);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Actions actions = new Actions(ldriver);
		actions.moveToElement(okay1).click().build().perform();
//		okay1.click();
	}
	
//	public String url() {
//		return ldriver.getCurrentUrl();
//	}
}
