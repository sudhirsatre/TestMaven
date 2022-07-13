package guruextent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestBase {
	
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;
	public static Alert alert;
	
	public static void  base()
	{
	
	System.setProperty("webdriver.chrome.driver","D:\\software\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
//	test.log(Status.INFO,"Launch Browser");
	driver.get("https://www.demo.guru99.com/V4/");
	
	}
}
