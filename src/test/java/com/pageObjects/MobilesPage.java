package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.Action;

public class MobilesPage {
	
	private WebDriver driver;
	
	public MobilesPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(@class,'a-size-base a-color-base')][normalize-space()='Made for Amazon']")
	WebElement madeForAmazon;
	
	
	public String getPageTitle(){
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	public void clickOnMadeForAmazon(){
		Action.clickOn(madeForAmazon);
	}
}
