package com.mercury.pagetestcases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.mercury.qa.pages.LoginPage;
import com.utility.ExcelRead;



public class LoginPageTest extends PageBaseTest{
	
	
  @Test(dataProvider="userlogin")
  public void verifyLogin(String user1,String pass1) {
	  
	  LoginPage page=new LoginPage(driver);
	  
	  page.doLogin(user1, pass1);
	  
	  
	  String actualtitle=driver.getTitle();
		String expectedtitle="Login: Mercury Tours";
		SoftAssert sf=new SoftAssert();
		sf.assertEquals(actualtitle, expectedtitle);
		
		sf.assertAll();
	  
  }
  
  @AfterMethod
  
  public void afterMethod() {
	  
	  driver.get("http://demo.guru99.com/test/newtours/index.php");
  }
  
  @DataProvider(name="userlogin")
  public Object[][] signonData() throws IOException, InvalidFormatException{
	  
	  Object[][] data=ExcelRead.getDataFromExcel("C:\\Eclipsesoftwares\\NGTutorial\\ExcelData\\Mercurylogin.xlsx", "logindata");
	  
	return data;
  }
}
