package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng;

@RunWith(Cucumber.class)

@CucumberOptions(features = ".//Features/register.feature", glue = "step_Definition", dryRun = false, monochrome = false, plugin = {
		"pretty", "html:target/Cucumber-report/report5s.html" })

// the cucumber file will always be empty
public class run {

}