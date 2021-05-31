package com.amazon.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features =".//Features",
				 glue={"com.amazon.stepDefinitions"},
				 dryRun=false,
				 monochrome=true,
				 tags="@smoke",
				 plugin={"pretty","html:target/cucumber", "json:target/cucumber.json"})
public class TestRunner {

}
