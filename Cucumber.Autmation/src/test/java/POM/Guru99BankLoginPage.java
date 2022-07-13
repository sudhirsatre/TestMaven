package POM;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Guru99BankLoginPage {
	
	public WebDriver driver;
	
	@FindBy(name = "uid")
	WebElement uname;
	
	@FindBy(name = "password")
	WebElement upass;
	
	@FindBy(name = "btnLogin")
	WebElement loginbutton;
	
	public Guru99BankLoginPage(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	

	public void uname()
	{
		uname.sendKeys("sudhir");
	}
	
	public void upass()
	{
		upass.sendKeys("satre");
	}
	
	public void cliclbutton()
	{
		loginbutton.click();
	}
	
	public void verifyhomepage()
	{
		driver.switchTo().alert().accept();
		String a="Guru99 Bank Home Page";
		assertEquals(a,driver.getTitle());
		System.out.println("User Name and Password Wrong");
	}

}
