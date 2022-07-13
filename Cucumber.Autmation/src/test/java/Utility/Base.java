package Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Base {
	
	public void ext()
	{
		ExtentReports extent=new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter("C:\\Users\\SUDHIR\\eclipse-workspace\\Cucumber.Autmation\\extentreport\\gurulogin.html");
		spark.config().setDocumentTitle("Guru99bank Login Test");
		spark.config().setReportName("Guru login Test");
		spark.config().setTheme(Theme.DARK);
		extent.attachReporter(spark);
		ExtentTest test=extent.createTest("Guru 99 Bank Login Test");

	}
	
}
