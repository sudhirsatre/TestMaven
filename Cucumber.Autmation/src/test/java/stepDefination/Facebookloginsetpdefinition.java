package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import POM.FacebookloginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebookloginsetpdefinition {
	
	
	public WebDriver driver;
	public FacebookloginPage fl;
	
	
	@Given("User should be open {string}")
	public void user_should_be_open(String url) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		fl=new FacebookloginPage(driver);
	   
	}

	@Given("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String email, String pass) {
		
		fl.useremail(email);
		fl.userpass(pass);
	   
	}

	@When("User click LoginButton")
	public void user_click_login_button() {
		
		fl.loginbutton();
		
	}

	@Then("User enter the Home Page")
	public void user_enter_the_home_page() {
	   
		String acutualresult="Facebook";
		String expectedresult=driver.getTitle();
			
		if(acutualresult.equals(expectedresult))
		{
			//Assert.assertTrue(true);
			System.out.println("Test Pass");
		}
		else
		{
			//Assert.assertTrue(false);
			System.out.println("Test fail");
		}
   }
	
	@Then("Browser close")
	public void browser_close() {
	    
		driver.quit();
	}
}
