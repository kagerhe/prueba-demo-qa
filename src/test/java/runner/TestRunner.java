package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/features", 
    		glue = {"stepDefinition", "utility"},
    plugin = {"pretty", "html:target/cucumber-report","json:cucumber.json"} )
public class TestRunner {
	
}
