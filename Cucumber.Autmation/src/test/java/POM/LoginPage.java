package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage {

	public static WebDriver driver;
	
	
	@FindBy(id = "email")
	WebElement email;

	@FindBy(id = "pass")
	WebElement password;

	@FindBy(name = "login")
	WebElement loginbutton;

	public LoginPage(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this);

	}

	public void enterusername() {

		this.email.sendKeys("sudhirssatre7");
	}

	public void enteruserpassword() {

		password.sendKeys("sudhirs-123");
	}

	public void clickloginbutton() {

		loginbutton.click();
	}

	public void navigatehomepage() {

		System.out.println("********Navigate to Home Page************");
	}

	public void verifyhomepage() {

		String ele = driver.getTitle();

		if (ele.equals("Facebook")) {
			System.out.println("*************Test case pass***********");
		} else {
			System.out.println("**********Test case not pass*************");
		}
	}

	
}
