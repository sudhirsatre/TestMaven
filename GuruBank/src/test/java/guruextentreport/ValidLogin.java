package guruextentreport;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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



public class ValidLogin {
	
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;
	public static Alert alert;
	
	@BeforeMethod
	public void base()
	{
		extent=Guruextentreportmanager.sudhir();
		test=extent.createTest("Valid Userid & Valid Password Test Case");
		
		
	System.setProperty("webdriver.chrome.driver","D:\\software\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	test.log(Status.INFO,"Launch Browser");
	driver.get("https://www.demo.guru99.com/V4/");
	
	
		
	}
	
	@Test
	@Parameters({"uid","pass"})
	public void ValuidValpass(String uid1,String pass) throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.name("uid")).sendKeys(uid1);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.name("btnLogin")).click();

		String ele=driver.getTitle();
		if(ele.equals("Guru99 Bank Manager HomePage"))
		{
			test.log(Status.INFO,"Verify the Title of Home Page.");
			test.log(Status.INFO,"Valid User Id and Valid Password Test Case.");
			test.log(Status.PASS,"First Test Case Pass");
			
			
		}else
		{
			test.log(Status.INFO,"Title is not matched.");
		}	
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		driver.switchTo().alert().dismiss();
	}
	
	
	@AfterMethod
	public void teardown()
	{
		extent.flush();
		driver.close();
	}

}
