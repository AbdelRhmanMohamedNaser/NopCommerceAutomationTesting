package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\main\\resources\\features",
        glue = "StepsDefination",
        tags ="@regression ",
        plugin = {"pretty","html:target/report/report.html"}
)

public class TestRunners {
}
