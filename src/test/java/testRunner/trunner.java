package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\ANIRUDHO\\eclipse-workspace\\BBBaby\\src\\test\\resources\\LC2",
		glue     = "stnddDef",
		dryRun=false,
		monochrome=true
		)
public class trunner {
	
}
