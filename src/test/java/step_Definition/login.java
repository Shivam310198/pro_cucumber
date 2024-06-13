package step_Definition;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.loginPage;

public class login {
	WebDriver driver;

	loginPage l;

	String expURl = "https://prorewards.io/";

	@Given("Launch chrome browser")
	public void launch_chrome_browser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);

		l = new loginPage();

	}

	@Given("open URL")
	public void open_url() throws InterruptedException {

		driver.get(expURl);
		driver.manage().window().maximize();
		Thread.sleep(3000);

	}

	@When("enter mobile number and submit")
	public void enter_mobile_number_and_submit() throws InterruptedException {
		Thread.sleep(3000);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter phone number:-");
		String a = sc.nextLine();
		l.mobileNumber(a);

	}

	@When("enter OTP and submit")
	public void enter_otp_and_submit() throws InterruptedException {
		Thread.sleep(3000);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter OTP 1:- ");
		String o1 = sc.nextLine();
		System.out.print("Enter OTP 2:- ");
		String o2 = sc.nextLine();
		System.out.print("Enter OTP 3:- ");
		String o3 = sc.nextLine();
		System.out.print("Enter OTP 4:- ");
		String o4 = sc.nextLine();
		System.out.print("Enter OTP 5:- ");
		String o5 = sc.nextLine();
		System.out.print("Enter OTP 6:- ");
		String o6 = sc.nextLine();

		l.otp(o1, o2, o3, o4, o5, o6);

	}

	@Then("user land on earn page")
	public void user_land_on_earn_page() throws InterruptedException {
		Thread.sleep(2000);
		String actURL = driver.getCurrentUrl();

		if (expURl.equals(actURL)) {
			System.out.println("Test Passed");
		}

	}

	@Then("close the browser")
	public void close_the_browser() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();

	}

}
