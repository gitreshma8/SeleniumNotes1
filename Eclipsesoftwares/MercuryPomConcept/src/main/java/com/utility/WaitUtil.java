package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mercuryqa.constants.Constants;


public class WaitUtil {
	
	WebDriver driver;
	
	WebDriverWait wait;

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	
	public WaitUtil(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	
	public void waitForPageTitle(String title) {
		
		 wait=new WebDriverWait(driver, Constants.timeout);
		wait.until(ExpectedConditions.titleIs(title));
			}

	public void waitForElementClick(WebElement  element) {
		wait=new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(element));
			}
	
	public void waitForElementVisibility(WebElement element) {
		wait=new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By) element));	

	}
}