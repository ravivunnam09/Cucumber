package com.stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;

import com.base.BaseClass;
import com.pageObjects.HomePage;
import com.pageObjects.MobilesPage;
import com.pageObjects.ResultsPage;
import com.utils.Browser;

import cucumber.api.DataTable;
import cucumber.api.java.*;
import cucumber.api.java.en.*;

public class StepDefinition extends BaseClass {

	@Before
	public void configSetUp() throws IOException {
		FileInputStream fis = new FileInputStream("config.properties");
		configProp = new Properties();
		configProp.load(fis);
		logger = Logger.getLogger("");
		PropertyConfigurator.configure("log4j.properties");
		browser = new Browser();
	}

	@After
	public void tearDown(){
		browser.tearDown();
	}

	@Given("^User launch \"([^\"]*)\" Browser$")
	public void user_launch_browser(String browserName) throws IOException {
		driver = browser.setUp(configProp.getProperty("browserName"));
	}

	@Given("^User open URL \"([^\"]*)\"$")
	public void user_open_url(String url) {
		browser.launchApplication(url);
	}

	@Then("^verify the page title$")
	public void verify_the_page_title() throws Throwable {
		homePage = new HomePage(driver);
		String pageTitle = homePage.getPageTitle();
		logger.info(pageTitle);
	}


	@Then("^User search the product \"([^\"]*)\"$")
	public void user_search_the_product(String inputValue) {
		homePage = new HomePage(driver);
		homePage.setSearchBoxValue(inputValue);
	}

	@Then("Close browser")
	public void close_browser() {
		//browser.tearDown();
		System.out.println("temporarily suspended");
	}

	@Then("User navigate to HomePage")
	public void user_navigate_to_home_page() {
		homePage = new HomePage(driver);
		String pageTitile = homePage.getPageTitle();
		logger.info("Page Title is : "+pageTitile);
	}

	@When("User clicks on Moblies link")
	public void user_clicks_on_moblies_link() {
		homePage.clickOnMobileLink();
	}

	@Then("System navigates to Mobiles page")
	public void system_navigates_to_mobiles_page() {
		mobilesPage = new MobilesPage(driver);
		String  pageTitle = mobilesPage.getPageTitle();
		logger.info("Page Title is : "+pageTitle);
	}

	@Then("click on Made for Amazon")
	public void click_on_made_for_amazon() {
		mobilesPage.clickOnMadeForAmazon();
	}

	@Then("System navigates to list of Items page")
	public void system_navigates_to_list_of_items_page() {
		resultsPage = new ResultsPage(driver);
		String  pageTitle = resultsPage.getPageTitle();
		logger.info("Page Title is : "+pageTitle);
	}
	@Then("^verify the page title \"([^\"]*)\"$")
	public void verify_the_page_title(String expectedTitle) throws Throwable {
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle,actualTitle);
	}
	
	@Given("^User open URL$")
	public void user_open_URL(DataTable applicationURL) throws Throwable {
		for(Map<String, String> data : applicationURL.asMaps(String.class, String.class)){
			browser.launchApplication(data.get("applicationURL"));
		}
		
	}

	@Then("^User search the product$")
	public void user_search_the_product(DataTable products) throws Throwable {
		for(Map<String,String> inputValue : products.asMaps(String.class, String.class)){
		homePage.setSearchBoxValue(inputValue.get("products"));
		}
	}

}
