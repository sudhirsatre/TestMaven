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


public class InvalidUserIdInvalidPassword {
	
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;
	public static Alert alert;
	
	@BeforeMethod
	public void base3()
	{
		
		extent=Guruextentreportmanager.sudhir();
	    test=extent.createTest("Invalid UserId Invalid Password Test Case");
	    
		//TestBase.base();
		System.setProperty("webdriver.chrome.driver","D:\\software\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		test.log(Status.INFO,"Launch Browser");
		driver.get("https://www.demo.guru99.com/V4/");
	
	}
	@Test
	@Parameters({"ini","inp"})
	public void InvuidInvpass(String iuiid,String ipasssss) throws Exception
	{ 
		Thread.sleep(2000);
		driver.findElement(By.name("uid")).sendKeys(iuiid);
		driver.findElement(By.name("password")).sendKeys(ipasssss);
		driver.findElement(By.name("btnLogin")).click();
		test.log(Status.INFO,"Invalid User Id and Invalid Password Test Case.");
		test.log(Status.INFO,"Fourth Test Case Pass");
		
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
