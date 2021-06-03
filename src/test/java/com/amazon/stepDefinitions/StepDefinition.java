package com.amazon.stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.amazon.base.BaseClass;
import com.amazon.base.Browser;
import com.amazon.pageobjects.HomePage;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class StepDefinition extends BaseClass {
	public Properties configProp;
	public Logger logger;
	public HomePage homePage;

	@Before
	public void configSetUp() throws IOException {
		FileInputStream fis = new FileInputStream("config.properties");
		configProp = new Properties();
		configProp.load(fis);

		logger = Logger.getLogger("*********Cucumber Project*********");
		PropertyConfigurator.configure("log4j.properties");

	}

	@Given("User launch {string} Browser")
	public void user_launch_browser(String browserName) throws IOException {

		logger.info("Launching Browser is : " + configProp.getProperty("browserName"));
		driver = Browser.setUp(configProp.getProperty("browserName"));
	}

	@Given("User open URL {string}")
	public void user_open_url(String url) {
		logger.info("Launching URL is : " + url);
		Browser.launchApplication(url);
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String string) {
		homePage = new HomePage(driver);
		String pageTitle = homePage.getPageTitle();
		logger.info(pageTitle);
		
		
	}
	
	@Then("User search the product {string}")
	public void user_search_the_product(String inputValue) {
		homePage.setValueInSearchBox(inputValue);
		logger.info("Value Entered in Search Box is : "+inputValue);
	}

	@Then("Close browser")
	public void close_browser() {
		logger.info("Closing Browser");
		Browser.tearDown();
	}

}
