package com.guru99.gurubank.pages;

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



public class LoginVerification {
	
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;
	public static Alert alert;
	
	@BeforeMethod
	public void base()
	{
		
/*	extent=new ExtentReports();
	spark=new ExtentSparkReporter("C:\\Users\\SUDHIR\\eclipse-workspace\\GuruBank\\extreport");
	spark.config().setReportName("Guru 99 Bank Project");
	spark.config().setDocumentTitle("Login Functionality");
	spark.config().setTheme(Theme.DARK);
	spark.config().setEncoding("utf-8");
	extent.attachReporter(spark);*/
		extent=Guruextentreportmanager.sudhir();
	test=extent.createTest("Differnt Types of Login Verification");
		
		
	System.setProperty("webdriver.chrome.driver","D:\\software\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	test.log(Status.INFO,"Launch Browser");
	driver.get("https://www.demo.guru99.com/V4/");
	
	
		
	}
	
	@Test(priority=1)
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
			test=extent.createTest("1");
			
			
		}else
		{
			test.log(Status.INFO,"Title is not matched.");
		}	
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		driver.switchTo().alert().dismiss();
	}
	
	@Test(priority=2)
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
		test=extent.createTest("2");
		
	}
	
	@Test(priority=3)
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
		test=extent.createTest("3");
		
	}
	
	@Test(priority=4)
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
		test=extent.createTest("4");
	
	}
	
	@AfterMethod
	public void teardown()
	{
		extent.flush();
		driver.close();
	}

}
