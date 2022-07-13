package Guru99BankHomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Asddsgsgds {
	
	public class AddCutomer {
		
	 WebDriver driver;
			
			@BeforeMethod
			public void base() throws Exception
			{
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("https://www.demo.guru99.com/V4/");
			}
			
			@Test(priority=1)
			public void AddCustomerGur99Bank() throws Exception
			{
				driver.findElement(By.name("uid")).sendKeys("mngr410625");
				driver.findElement(By.name("password")).sendKeys("UqabYrE");
				driver.findElement(By.name("btnLogin")).click();
				
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[text()='New Customer']")).click();
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@name='name']")).sendKeys("sudhir");
				driver.findElement(By.xpath("//input[@value='f']")).click();
			}
			
			@AfterMethod
			public void teardown()
			{
			//	driver.close();
			}
	}
}


