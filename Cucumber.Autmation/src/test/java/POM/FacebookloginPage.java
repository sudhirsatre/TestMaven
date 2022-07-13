package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookloginPage {
	
	public WebDriver driver;
	
	public FacebookloginPage(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy(id = "email")
	WebElement uemail;
	
	@FindBy(id = "pass")
	WebElement upass;
	
	@FindBy(name = "login")
	WebElement lbutton;
	
	
	
	public void useremail(String email)
	{
		uemail.sendKeys(email);
	}
	
	public void userpass(String pass)
	{
		upass.sendKeys(pass);
	}
	
	public void loginbutton()
	{
		lbutton.click();
	}
	

}
