package com.guru99.gurubank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class LoginPage {

	static WebDriver driver;

	@FindBy(name = "uid")
	WebElement uname;

	@FindBy(name = "password")
	WebElement upass;

	@FindBy(name = "btnLogin")
	WebElement btnlogin;

 public LoginPage(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this);
	}

	public void useername(String uname) {
		this.uname.sendKeys(uname);
	}

	public void userpass(String upass) {
		this.upass.sendKeys(upass);
	}

	public void loginbuttonclick() {
		this.btnlogin.click();
	}

}
