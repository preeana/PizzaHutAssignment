package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions

    (
    features={"C:/Users/vpree/eclipse-workspace/PizzaHut/src/test/resources/pizzahut.feature"},
    glue={"stepDefs","Hooks"},
    dryRun=false,
    monochrome=false,
    tags= "@Smoke",
    plugin= {"pretty","json:target/CucumberTestReport.json","html:target/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
    )

public class TestRun{
    
}

