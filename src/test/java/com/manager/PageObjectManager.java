package com.manager;

import org.openqa.selenium.WebDriver;

import com.pageObjects.HomePage;
import com.pageObjects.MobilesPage;
import com.pageObjects.ResultsPage;

public class PageObjectManager {

	private WebDriver driver;
	private HomePage homePage;
	private MobilesPage mobilesPage;
	private ResultsPage resultsPage;

	public PageObjectManager(WebDriver driver){
		this.driver = driver;
	}

	public HomePage getHomePage(){
		return (homePage == null) ? homePage =  new HomePage(driver): homePage;

	}
	
	public MobilesPage getMobilesPage(){
		return (mobilesPage == null ) ? mobilesPage = new MobilesPage(driver):mobilesPage;
		
	}
	public ResultsPage getResultsPage(){
		return (resultsPage == null ) ? resultsPage = new ResultsPage(driver):resultsPage;
		
	}
}
