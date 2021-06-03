package com.amazon.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.amazon.base.BaseClass;

public class Action extends BaseClass {
	static Select select;
	
	//TextBox method
	public static void textBox(WebElement element, String inputValue){
		Assert.assertEquals(true, element.isDisplayed());
		element.click();
		Assert.assertEquals(true, element.isEnabled());
		element.clear();
		element.sendKeys(inputValue);
		logger.info("Entered value is "+inputValue);
		
	}
	
	//Click method
	public static void clickOn(WebElement element){
		element.click();
	}
	
	//Dropdown method
	public static void selectDropdownValue(WebElement element, String inputValue){
		select = new Select(element);
		select.selectByValue(inputValue);
	}
	
	public static void selectVisitibleText(){

	}
	
	public static void selectValueByIndex(){

	}

}
