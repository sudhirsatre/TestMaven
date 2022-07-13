package facebookPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPageObject {

	WebDriver driver;

	@FindBy(name = "email")
	WebElement name;

	@FindBy(name = "pass")
	WebElement pass;

	@FindBy(name = "login")
	WebElement loginButton;

	LoginPageObject(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this);
	}
	
	
	public void uname(String name)
	{
		this.name.sendKeys(name);
	}
	
	public void upass(String pass)
	{
		this.pass.sendKeys(pass);
	}
	
	public void clicklogin()
	{
		loginButton.click();
	}
	


}
