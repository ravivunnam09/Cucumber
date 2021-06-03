package com.amazon.base;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.amazon.pageobjects.HomePage;
import com.amazon.pageobjects.MobilesPage;
import com.amazon.pageobjects.ResultsPage;

public class BaseClass {
	
	public WebDriver driver;
	public Browser browser;
	public static Logger logger;
	public static Properties configProp;
	public HomePage homePage;
	public MobilesPage mobilesPage;
	public ResultsPage resultsPage;

}
