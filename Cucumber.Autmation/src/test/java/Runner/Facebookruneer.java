package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@io.cucumber.testng.CucumberOptions
//@CucumberOptions(
			(
			features=".//Features//Facebooklogin.feature",
			glue = "stepDefination",
			dryRun = false,
			monochrome = true,
			plugin = {"pretty", "html:target/cucumberreports.html" }
		
		)

public class Facebookruneer extends AbstractTestNGCucumberTests {

}
