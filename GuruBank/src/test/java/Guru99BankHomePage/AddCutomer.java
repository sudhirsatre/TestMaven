package Guru99BankHomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;



public class AddCutomer {
	
public static WebDriver driver;
	ExtentTest test;
	ExtentReports extent ;
	ExtentSparkReporter spark;
	
	@BeforeMethod
//	@Parameters({"uid","pass"})
	public void base() throws Exception
	{
		extent=new ExtentReports();
		spark=new ExtentSparkReporter("C:\\Users\\SUDHIR\\eclipse-workspace\\GuruBank\\extreport\\cutomer.html");
		test=extent.createTest("Add Customer");
		
		spark.config().setDocumentTitle("Guru Add Customer");
		spark.config().setReportName("Guru Customer");
		spark.config().setTheme(Theme.DARK);
		extent.attachReporter(spark);
		test.log(Status.INFO,"hi");
		
		
	/*	ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");*/
		
		//System.setProperty("webdriver.gecko.driver","D:\\software\\Driver\\geckodriver.exe");
		
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		test.log(Status.INFO,"Launch Browser");
		driver.get("https://www.demo.guru99.com/V4/");
		
	
		//test.log(Status.INFO,"Valid User Id and Invalid Password Test Case.");
		//test.log(Status.INFO,"Third Test Case Pass");
	
	}
	
	@Test(priority=1)
//	@Parameters({"cname","rdbtn"})

	public void AddCustomerGur99Bank() throws Exception
	{
		driver.findElement(By.name("uid")).sendKeys("mngr410625");
		driver.findElement(By.name("password")).sendKeys("UqabYrE");
		driver.findElement(By.name("btnLogin")).click();
		test.log(Status.INFO,"Login Successful");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='New Customer']")).click();
		test.log(Status.INFO,"Click New Customer Button");
		Thread.sleep(3000);
	
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("sudhir");
		driver.findElement(By.xpath("//input[@value='f']")).click();
		
		test.log(Status.INFO,"Add Customer Test Case Successful");
	
	
	}
	
	@AfterMethod
	public void teardown()
	{
	//	driver.close();
		
		extent.flush();
	}

}
