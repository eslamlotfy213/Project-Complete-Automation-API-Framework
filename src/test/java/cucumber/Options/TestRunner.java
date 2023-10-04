package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/features",
        plugin = { "pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "json:target/jsonReports/cucumber-report.json"}
        , glue= {"stepDefinations"}
)
public class TestRunner {
//tags= {"@DeletePlace"}  compile test verify
}
