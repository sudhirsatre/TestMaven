package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"C:\\Users\\SUDHIR\\eclipse-workspace\\Cucumber.Autmation\\src\\test\\java\\Features\\Guru99Login.feature"},
		dryRun = false,
		monochrome = true,
		glue = {"stepDefination"},
		tags = "@loginguru"

		)

public class Guru99BankRunner{
	


}
