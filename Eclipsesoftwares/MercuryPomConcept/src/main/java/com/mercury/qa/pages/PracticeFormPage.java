package com.mercury.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import com.utility.ElementUtil;
import com.utility.WaitUtil;

public class PracticeFormPage {
	
	
	WebDriver driver;
	ElementUtil elemutil;
	WaitUtil wtutil;
	
	@FindBy(id="firstName")	
	WebElement firstname;
	
	@FindBy(id="lastName")	
	WebElement lastname;
	
	@FindBy(id="userEmail") 
	WebElement email;
	
	@FindBy(xpath ="//label[text()='Male']" )
	WebElement gender1;
		
	@FindBy(id="userNumber")
	WebElement mobilenum;
	
	@FindBy(id="dateOfBirthInput") 
	WebElement dob;
	
	@FindBy(xpath ="//div[@class='react-datepicker__day react-datepicker__day--009']" )
	WebElement dobselect;
	
	@FindBy(id="subjectsInput") 
	WebElement subjects;
	
	@FindBy(xpath = ("//button[@id='submit']")) 
	WebElement submitbtn;
	
	@FindBy(xpath = ("//label[text()='Reading']")) 
	WebElement hobbiesread;
	
	@FindBy(id="uploadPicture")	
	WebElement choosefile;
	
	@FindBy(id="currentAddress") 
	WebElement curraddress;
	
	@FindBy(xpath = "//div[@class=' css-tlfecz-indicatorContainer']//*[@class='css-19bqh2r']")
	WebElement state;
	
	@FindBy(id="closeLargeModal")
	WebElement close;
	
	
	//Initializing Page Objects:
	public PracticeFormPage(WebDriver driver) {
		
		this.driver=driver;
		elemutil=new ElementUtil(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions:
	public void fillPracticeForm(String fname,String lname,String mail,String mobile,String subj,String filepath,String address) {
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		
		elemutil.sendKeys(firstname, fname);		
		elemutil.sendKeys(lastname, lname);
		
		elemutil.sendKeys(email, mail);
			
		elemutil.click(gender1);
		
		elemutil.sendKeys(mobilenum, mobile);
//		elemutil.click(dob);
		
			
		
		elemutil.sendKeys(subjects, subj);
				
//		elemutil.click(choosefile);
		elemutil.sendKeys(choosefile, filepath);
		
		elemutil.sendKeys(curraddress, address);
		 js.executeScript("window.scrollBy(0,1000)");
		elemutil.click(submitbtn);
		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("arguments[0].click();", close);
		
		
	}

}
