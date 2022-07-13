package a;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class FaceExtent {

	public static WebDriver driver;
	ExtentReports extent;
	ExtentSparkReporter spark;
	ExtentTest test;

	@BeforeMethod
	public void setup() throws Exception

	{
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("C:\\Users\\SUDHIR\\eclipse-workspace\\GuruBank\\extreport\\facebook.html");
		spark.config().setDocumentTitle("Facebook Login");
		spark.config().setTheme(Theme.DARK);
		extent.attachReporter(spark);
		test = extent.createTest("Facebook Login Test");
		
		

		//ChromeOptions option = new ChromeOptions();
		//option.addArguments("--disable-notifications");

		System.setProperty("webdriver.gecko.driver", "D:\\software\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		test.log(Status.INFO,"Launch FaceBook URL");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@Test(priority = 1)
	public void Login() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("sudhirsatre7");
		test.log(Status.INFO,"Enter Login ID");
		driver.findElement(By.name("pass")).clear();
		driver.findElement(By.name("pass")).sendKeys("sudhir-123");
		test.log(Status.INFO,"Enter Password");
		driver.findElement(By.name("login")).click();
		test.log(Status.INFO,"Enter Login Button");
		test.log(Status.PASS,"Login Test Pass");
	}

	@AfterMethod
	public void teardown() {
		extent.flush();
		//driver.quit();
	}

}
