package step_Definition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.profilePage;
import utils.SessionManager;

public class profile {
	WebDriver driver;

	profilePage pp;

	String expURl = "https://qa.prorewards.io/earn";

//	@Given("Launch chrome browser")
//	public void launch_chrome_browser() {
//		EdgeOptions options = new EdgeOptions();
//		options.addArguments("--remote-allow-origins=*");
//
//		WebDriverManager.edgedriver().setup();
//		driver = new EdgeDriver(options);
//
//		pp = new profilePage(driver);
//
//	}
//
//	@Given("User logged in")
//	public void User_logged_in() throws InterruptedException {
//
//		driver.get("https://qa.prorewards.io/login");
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//
//	}

	@BeforeMethod
	public void setup() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		// landing page
		driver.get("https://qa.prorewards.io/");

		SessionManager sessionManager = new SessionManager(driver);
		sessionManager.usePreviousLoggedInSession("qa.prorewards");

	}

	@Given("User logged in")
	public void user_logged_in() throws InterruptedException {
		pp = new profilePage(driver);
		Thread.sleep(2000);
		String actURL = driver.getCurrentUrl();
		assertEquals(expURl, actURL);
	}

	@When("open profile page")
	public void open_profile_page() throws InterruptedException {
		Thread.sleep(2000);
		try {
			pp.dailyrwd();
		} catch (Exception e) {
			// TODO: handle exception
		}
		Thread.sleep(2000);
		pp.profilePage2();

	}

	@When("open mystats and go back")
	public void open_mystats_and_go_back() throws InterruptedException {
		Thread.sleep(2000);
		pp.stats();
		Thread.sleep(2000);
		driver.navigate().back();
	}

	@When("open transactions and go back")
	public void open_transactions_and_go_back() throws InterruptedException {
		Thread.sleep(2000);
		pp.txnss();
		Thread.sleep(2000);

	}

	@When("open refer & earn and go back")
	public void open_refer_and_earn_and_go_back() throws InterruptedException {
		Thread.sleep(2000);
		pp.refer();
		;
		Thread.sleep(2000);
	}

	@When("Open pending earning and go back")
	public void Open_pending_earning_and_go_back() throws InterruptedException {
		Thread.sleep(2000);
		pp.pending();
		Thread.sleep(2000);

	}

	@When("click on login info button")
	public void click_on_login_info_button() throws InterruptedException {
		Thread.sleep(2000);
		pp.lginfo();
		Thread.sleep(2000);
	}

	@When("click on logout button and logout")
	public void click_on_logout_button_and_logout() throws InterruptedException {
		Thread.sleep(2000);
		pp.lgout();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/h6[1]")).click();

	}

	@Then("close the browser22")
	public void close_the_browser22() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}

}