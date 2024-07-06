package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = ".//Features/profile.feature", glue = "step_Definition", dryRun = false, monochrome = false, plugin = {
		"pretty", "html:target/Cucumber-report/profile-report1.html" })

public class profile_runner {

}
