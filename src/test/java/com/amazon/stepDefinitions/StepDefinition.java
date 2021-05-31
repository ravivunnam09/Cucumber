package com.amazon.stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.amazon.base.BaseClass;
import com.amazon.base.Browser;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class StepDefinition extends BaseClass {
	public Properties configProp;
	public Logger logger;

	//Testing
	@Before
	public void setUp() throws IOException {
		FileInputStream fis = new FileInputStream("config.properties");
		configProp = new Properties();
		configProp.load(fis);

		logger = Logger.getLogger("*********Cucumber Project*********");
		PropertyConfigurator.configure("log4j.properties");

	}

	@Given("User launch {string} Browser")
	public void user_launch_browser(String browserName) throws IOException {

		logger.info("Launching Browser is : " + browserName);
		Browser.setUp(configProp.getProperty("browserName"));
	}

	@Given("User open URL {string}")
	public void user_open_url(String url) {
		logger.info("Launching URL is : " + url);
		Browser.launchApplication(url);
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String string) {
		throw new io.cucumber.java.PendingException();
	}

	@Then("Close browser")
	public void close_browser() {
		logger.info("Closing Browser");
		Browser.tearDown();
	}

}
