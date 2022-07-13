package guruextentreport;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import guruextent.Guruextentreportmanager;

public class InvalidUserIdValidPassword {
	
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;
	public static Alert alert;
	
	@BeforeMethod
	public void base1()
	{
		
		extent=Guruextentreportmanager.sudhir();
	   test=extent.createTest("Invalid UserId Valid Password Test Case");
		
		
	System.setProperty("webdriver.chrome.driver","D:\\software\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	test.log(Status.INFO,"Launch Browser");
	driver.get("https://www.demo.guru99.com/V4/");
		
	}
	
	@Test
	@Parameters({"inuid","valpass"})
	public void InvUisValPass(String inid,String valpas) throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.name("uid")).sendKeys(inid);
		driver.findElement(By.name("password")).sendKeys(valpas);
		driver.findElement(By.name("btnLogin")).click();
		test.log(Status.INFO,"Invalid User Id and Valid Password Test Case.");
		test.log(Status.INFO,"Secound Test Case Pass");
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	}
	
	@AfterMethod
	public void teardown()
	{
		extent.flush();
		driver.close();
	}



}
