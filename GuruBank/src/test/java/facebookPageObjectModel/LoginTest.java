package facebookPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LoginTest   {

	
	@Test
	public void logintest() throws Exception
	{
		
		ExtentReports extent =new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter("C:\\Users\\SUDHIR\\eclipse-workspace\\GuruBank\\extreport\\FacebookPOM.html");
		
		spark.config().setDocumentTitle("Facebook Login Test");
		spark.config().setReportName("Facebook Login Test");
		spark.config().setTheme(Theme.DARK);
		
		extent.attachReporter(spark);
		
		ExtentTest test=extent.createTest("Facebook Login With POM");
		
		System.setProperty("webdriver.chrome.driver","D:\\software\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		test.log(Status.INFO,"Launch Chrome Browser");
		driver.get("https://www.facebook.com/");
		test.log(Status.INFO,"Open FaceBook URL");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		LoginPageObject lp=new LoginPageObject(driver);
		
		lp.uname("sudhirsatre7");
		lp.upass("sudhir-123"); 
		lp.clicklogin();
		test.log(Status.PASS,"Login Test Case Pass Using POM");
		
		extent.flush();
		driver.close();
		
	}
	
}
