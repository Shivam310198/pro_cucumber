package step_Definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.loginPage;

public class login {
	WebDriver driver;

	loginPage l;

	String expURl = "https://qa.prorewards.io/fut";

	@Given("Launch chrome browser")
	public void launch_chrome_browser() {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver(options);

		l = new loginPage(driver);

	}

	@Given("open URL")
	public void open_url() throws InterruptedException {

		driver.get("https://qa.prorewards.io/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);

	}

	@When("enter mobile number and submit")
	public void enter_mobile_number_and_submit() throws InterruptedException {
//		Thread.sleep(3000);
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter phone number:-");
//		String a = sc.nextLine();
		l.mobileNumber("8816829617");

	}

	@When("enter OTP and submit")
	public void enter_otp_and_submit() throws InterruptedException {
//		Thread.sleep(3000);
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter OTP 1:- ");
//		String o1 = sc.nextLine();
//		System.out.print("Enter OTP 2:- ");
//		String o2 = sc.nextLine();
//		System.out.print("Enter OTP 3:- ");
//		String o3 = sc.nextLine();
//		System.out.print("Enter OTP 4:- ");
//		String o4 = sc.nextLine();
//		System.out.print("Enter OTP 5:- ");
//		String o5 = sc.nextLine();
//		System.out.print("Enter OTP 6:- ");
//		String o6 = sc.nextLine();

		l.otp("1", "2", "3", "4", "5", "6");

	}

	@Then("user land on earn page")
	public void user_land_on_earn_page() throws InterruptedException {
		Thread.sleep(4000);
//		String r = l.url();
		expURl.equals(l.url());
		

	}

	@Then("close the browser")
	public void close_the_browser() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();

	}

}
