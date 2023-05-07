package runnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features ={".\\src\\test\\java\\FeatureFiles\\Login.feature"},
		glue = {"stepDefination"},
		monochrome = true,
		plugin = {"pretty","html:vtigerExecutionReport.html"},
		dryRun = false //true will not launch the browser but will generate the
		               //step definition for feature file loaded.
		)


public class RunnerIO extends AbstractTestNGCucumberTests{

}
