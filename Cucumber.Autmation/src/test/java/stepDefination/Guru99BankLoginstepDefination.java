package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import POM.Guru99BankLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Guru99BankLoginstepDefination{
	
	public WebDriver driver;
	public Guru99BankLoginPage gb;

	
	@Given("user open the Guru99Bank Url")
	public void user_open_the_guru99bank_url() {
		
	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://demo.guru99.com/V4/");
		gb=new Guru99BankLoginPage(driver);
	
	   
	}

	@Given("user enter the user name")
	public void user_enter_the_user_name() {
		
		gb.uname();
	
	    
	}
	
	@Given("User enter the user password")
	public void user_enter_the_user_password() {
		
		gb.upass();
	
	    
	}
	
	@When("User click login button")
	public void user_click_login_button() {
		
		gb.cliclbutton();
	
	   
	}
	
	@When("User navigate to home page")
	public void user_navigate_to_home_page() {
		
		System.out.println("Open the Home Page of Guru 99 Bank");
	
	}

	@Then("verify the home page")
	public void verify_the_home_page() {
		
		gb.verifyhomepage();
	
	   
	}
	
}
