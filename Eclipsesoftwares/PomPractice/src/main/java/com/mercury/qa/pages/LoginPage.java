package com.mercury.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.ElementUtil;

public class LoginPage {
	
	WebDriver driver;
	
	ElementUtil elmutil;
	
	@FindBy(name="userName")
	WebElement uname;
	
	
	@FindBy(name="password")
	WebElement pwrd;
	
	@FindBy(name="submit")
	WebElement submitbtn;
	
	
	
	public LoginPage(WebDriver driver) {
		
		elmutil=new ElementUtil(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	public void doLogin(String user,String pass) {
		
		elmutil.sendKeys(uname, user);
		elmutil.sendKeys(pwrd, pass);
		elmutil.click(submitbtn);
	}
	

}
