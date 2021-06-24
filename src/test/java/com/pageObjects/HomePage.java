package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.Action;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement search_TextBox;
	
	@FindBy(xpath="//div[@id='nav-xshop']//a[contains(@class,'')][normalize-space()='Mobiles']")
	WebElement mobileLink;
	
	@FindBy(xpath="//span[contains(@class,'hm-icon-label')]") 
	WebElement allMenuButton;
	
	@FindBy(xpath="//a[contains(text(),'Mobiles')]")
	WebElement mobilesLink;
	
	
	public String getPageTitle(){
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	public void setSearchBoxValue(String inputValue){
		Action.textBox(search_TextBox, inputValue);
	}
	
	public void clickOnMobileLink(){
		Action.clickOn(mobileLink);
	}
	
	public void clickOnAllMenu(){
		Action.clickOn(allMenuButton);
	}
	

}
