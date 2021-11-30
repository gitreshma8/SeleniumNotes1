package com.mercury.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.ElementUtil;
import com.utility.WaitUtil;

public class LoginPage {
	
	WebDriver driver;
	
	ElementUtil elmutil;
	
	WaitUtil wutil;
	
		
	//Page Factory - OR:	
	@FindBy(name="userName")
	WebElement uname;
	
	
	@FindBy(name="password")
	WebElement pwrd;
	
	@FindBy(name="submit")
	WebElement submitbtn;
	
	
	//initializing Page Objects:
	public LoginPage(WebDriver driver) {
		
		wutil=new WaitUtil(driver);
		elmutil=new ElementUtil(driver);
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	
	
	
	public void doLogin(String user,String pass) {
		
//		wutil.waitForElementVisibility(pwrd);
	
		wutil.waitForElementClick(submitbtn);
		
		elmutil.sendKeys(uname, user);
		elmutil.sendKeys(pwrd, pass);
		elmutil.click(submitbtn);
		
	}
	

}
