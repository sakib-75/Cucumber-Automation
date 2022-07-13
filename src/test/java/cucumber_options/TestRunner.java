package cucumber_options;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/java/features",
        glue = "step_defination")
public class TestRunner extends AbstractTestNGCucumberTests {
}
