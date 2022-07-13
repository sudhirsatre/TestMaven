package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;



@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"C:\\Users\\SUDHIR\\eclipse-workspace\\Cucumber.Autmation\\src\\test\\java\\Features\\Login.feature"},
		monochrome = true,
		plugin = {"pretty","html:target/HTMLREPORT"},
		glue = {"stepDefination"},
		tags = "@login",
		dryRun = false
		
		)
public class LoginRunner  {

}
