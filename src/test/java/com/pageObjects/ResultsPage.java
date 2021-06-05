package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.Action;

public class ResultsPage {
	private WebDriver driver;
	
	@FindBy(xpath = "//span[normalize-space()='1-24 of over 60,000 results']")
	WebElement results;
	public ResultsPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public String getPageTitle(){
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	public void getResults(){
		Action.getText(results);
	}

}
