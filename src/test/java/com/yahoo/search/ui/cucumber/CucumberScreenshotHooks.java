package com.yahoo.search.ui.cucumber;

import com.yahoo.search.singleton.Singleton;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CucumberScreenshotHooks {
    @After(order = 1)
    public void takeScreenshotOnFailure(Scenario scenario) {

        if (scenario.isFailed()) {

            TakesScreenshot ts = (TakesScreenshot) Singleton.getDriver();

            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src, "image/png", "screenshot");
        }

    }
}
