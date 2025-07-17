package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepdefinitions", "hooks"},
        plugin = {"pretty", "html:build/reports/cucumber-html-report.html","json:build/reports/cucumber-report.json"},
        monochrome = true
)
public class TestRunner {

}
