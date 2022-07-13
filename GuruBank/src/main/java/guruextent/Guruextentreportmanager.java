package guruextent;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Guruextentreportmanager {

	
	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;
	
	public static ExtentReports sudhir()
	{
		if(extent==null)
		{
	
		extent=new ExtentReports();
		spark=new ExtentSparkReporter("C:\\Users\\SUDHIR\\eclipse-workspace\\GuruBank\\extreport\\Guru99.html");
		spark.config().setReportName("Guru 99 Bank Project");
		spark.config().setDocumentTitle("Login Functionality");
		spark.config().setTheme(Theme.DARK);
		spark.config().setEncoding("utf-8");
		extent.attachReporter(spark);
	
		}return extent;
		}
}
