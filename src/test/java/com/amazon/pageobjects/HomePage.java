package com.amazon.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.utilities.Action;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']") 	WebElement search_TextBox;
	
	
	public String getPageTitle(){
		String pageTitle = driver.getTitle();
		return pageTitle;
		
	}
	public void setValueInSearchBox(String inputValue){
		Action.textBox(search_TextBox, inputValue);
	}
	

}
