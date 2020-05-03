package com.cybertek.runner;

 import cucumber.api.junit.Cucumber;
 import io.cucumber.junit.CucumberOptions;
 import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/homepage.feature",
        glue = "com/cybertek/step_definition"

)
public class CukesRunner {
}
