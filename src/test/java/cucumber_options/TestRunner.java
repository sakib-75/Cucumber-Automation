package cucumber_options;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features/login.feature",
        glue = "step_defination",
        plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "timeline:test-output-thread/", "rerun:target/failedrerun.txt"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
