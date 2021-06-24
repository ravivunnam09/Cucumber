package com.testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				features ={".//Features"}, 	
				glue={"com.stepDefinitions"},
				dryRun=false,
				monochrome=true,
				tags={"@smoke"},//, ~@regression, ~@sanity{"@smoke","~@regression","~@sanity"},
				plugin={"pretty","html:target/cucumber-reports", "json:target/cucumber.json"}
				
				)
public class TestRunner {

}
