package com.guru99.gurubank.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.guru99.gurubank.pages.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest   {

	public static WebDriver driver;
	@Test
	public void logindifftypes()
	{
	
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V4/");
		
		LoginPage gl=new LoginPage(driver);
		
		gl.useername("mngr410625");
		gl.userpass("UqabYrE");
		gl.loginbuttonclick();
	}
	
	
}
