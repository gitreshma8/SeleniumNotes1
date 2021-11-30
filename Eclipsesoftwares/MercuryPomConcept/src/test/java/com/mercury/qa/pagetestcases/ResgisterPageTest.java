package com.mercury.qa.pagetestcases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.mercury.qa.pages.RegisterPage;
import com.mercuryqa.constants.Constants;
import com.utility.ExcelRead;

public class ResgisterPageTest extends PageBaseTest{
	
	SoftAssert sf;
	
	RegisterPage regpage;
	
  @Test(priority=1,dataProvider="registerprovider")
  
  
  public void userInfoRegisterPageTest(String fsname,String lsname,
		  String userreg,String passreg,String confirmreg) {
	  
	  JavascriptExecutor js= (JavascriptExecutor)driver;
	  
	  js.executeScript("window.scrollBy(0,1000)");
	  
	  regpage=new RegisterPage(driver);
	  regpage.registerContactInfo(fsname, lsname);
		regpage.registerLogin(userreg, passreg, confirmreg);
	  
	 String actualregistertitle=driver.getTitle();
	 sf=new SoftAssert();
	 sf.assertEquals(actualregistertitle, Constants.Registerpagetitle,"Register PageTitle Verification failed");
	 sf.assertAll();
  }
//  
//@Test(priority=2,dataProvider="registerprovider")
//  
//  public void contactInfoRegisterPage(String userreg,String passreg,String confirmreg) {
//	regpage=new RegisterPage(driver);
//	regpage.registerLogin(userreg, passreg, confirmreg);
//	
//}
  


//  @BeforeMethod
//  public void beforeMethod() {
//	  
//	  driver.get("http://demo.guru99.com/test/newtours/register.php");
//  }
  
 
  
  
  
  @AfterMethod
  public void afterMethod() {
	  
	  driver.get("http://demo.guru99.com/test/newtours/register.php");
  }

	  
	 @DataProvider(name="registerprovider")
	  public Object[][] regloginData() throws IOException, InvalidFormatException{
		  
		  Object[][] data=ExcelRead.getDataFromExcel("C:\\Eclipsesoftwares\\MercuryPomConcept\\ExcelData\\MercuryTestData.xlsx", "RegisterPageTestData");
		  
		return data;
	  }
	  
  }



