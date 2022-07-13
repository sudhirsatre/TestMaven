package a;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {

	@BeforeSuite
	public void a()
	{
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void c()
	{
		System.out.println("Before Test");
	}
	
	@BeforeClass(enabled = true )
	public void d()
	{
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void e()
	{
		System.out.println("Before Method");
	}
	
	
	@Test
	public void b()
	{
		System.out.println("Test Method");
	}
	
	@AfterClass
	public void ss()
	{
		System.out.println("After class");
	}
	
	
}
