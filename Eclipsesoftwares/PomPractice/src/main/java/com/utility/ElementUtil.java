package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {

	WebDriver driver;
	
	
	public ElementUtil(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void sendKeys(WebElement element,String value) {
		
		element.clear();
		element.sendKeys(value);
	}
	
	
public void click(WebElement element) {
		
	element.click();
	}
}
