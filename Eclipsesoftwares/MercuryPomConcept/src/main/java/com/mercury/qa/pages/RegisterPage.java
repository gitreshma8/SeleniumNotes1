package com.mercury.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.ElementUtil;
import com.utility.WaitUtil;

public class RegisterPage {
	
	WebDriver driver;
	
	ElementUtil elemutil;
	
	WaitUtil wutil;
	
	
	@FindBy(name="firstName")
	WebElement firstname;
	
	@FindBy(name="lastName")
	WebElement lastname;
	
	
	@FindBy(name="email")
	WebElement reg_username;
	
	@FindBy(name="password")
	WebElement reg_password;
	
	@FindBy(name="confirmPassword")
	WebElement reg_ConfirmPassword;
	
	@FindBy(name="submit")
	WebElement reg_submitbtn;
	
	public RegisterPage(WebDriver driver) {
		
		
		wutil=new WaitUtil(driver);
		elemutil=new ElementUtil(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	public void registerLogin(String user,String pass,String confirmpassword) {
//		wutil.waitForElementClick(reg_submitbtn);
		
		elemutil.sendKeys(reg_username, user);
		elemutil.sendKeys(reg_password, pass);
		elemutil.sendKeys(reg_ConfirmPassword, confirmpassword);
		elemutil.click(reg_submitbtn);
	}
	
	
	public void registerContactInfo(String fname,String lname) {
		
		elemutil.sendKeys(firstname, fname);
		elemutil.sendKeys(lastname, lname);
	}

}
