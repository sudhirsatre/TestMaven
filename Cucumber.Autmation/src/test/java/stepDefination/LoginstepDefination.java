package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import POM.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginstepDefination {

	public WebDriver driver;
	public LoginPage lp;
	
	

	@Given("user open the facebook url")
	public void user_open_the_facebook_url() {

		System.setProperty("webdriver.chrome.driver", "D:\\software\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		lp = new LoginPage(driver);

	}

	@Given("user enter username")
	public void user_enter_username() {

		lp.enterusername();

	}

	@Given("user enter password")
	public void user_enter_password() {

		lp.enteruserpassword();

	}

	@When("user click login button")
	public void user_click_login_button() {

		lp.clickloginbutton();

	}

	@Then("user navigate to home page")
	public void user_navigate_to_home_page() {

		lp.navigatehomepage();

	}

	@Then("verify home page")
	public void verify_home_page() {

		lp.verifyhomepage();
	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
