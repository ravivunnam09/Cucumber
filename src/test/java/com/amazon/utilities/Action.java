package com.amazon.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Action {
	static Select select;
	
	//TextBox method
	public static void textBox(WebElement element, String inputValue){
		Assert.assertEquals(true, element.isDisplayed());
		element.click();
		Assert.assertEquals(true, element.isEnabled());
		element.sendKeys(inputValue);
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
