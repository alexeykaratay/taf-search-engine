package com.yahoo.search.ui.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-report",
                "json:target/cucumber-reports/cucumberTest.json",
                "junit:target/cucumber-reports/CucumberTests.xml"},
        monochrome = true,
        tags = "SearchTest",
        glue = "com/yahoo/search/ui/cucumber",
        features = "./src/test/java/com/yahoo/search/feature"
)
public class CucumberRunnerTest  {
}
