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

public class ValidUserIDInvalidPassword {
	
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;
	public static Alert alert;
	
	@BeforeMethod
	public void base2()
	{
		
		extent=Guruextentreportmanager.sudhir();
	    test=extent.createTest("Valid UserID Invalid Password Test Case");
		
		
	System.setProperty("webdriver.chrome.driver","D:\\software\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	test.log(Status.INFO,"Launch Browser");
	driver.get("https://www.demo.guru99.com/V4/");
	
	}
	
	@Test
	@Parameters({"validuid","invapass"})
	public void ValuisInVpass(String vaid,String ipas) throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.name("uid")).sendKeys(vaid);
		driver.findElement(By.name("password")).sendKeys(ipas);
		driver.findElement(By.name("btnLogin")).click();
		test.log(Status.INFO,"Valid User Id and Invalid Password Test Case.");
		test.log(Status.INFO,"Third Test Case Pass");
		
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
