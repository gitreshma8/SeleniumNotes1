package com.mercury.qa.pagetestcases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.mercury.qa.pages.LoginPage;
import com.mercuryqa.constants.Constants;
import com.utility.ExcelRead;



public class LoginPageTest extends PageBaseTest{
	
	
  @Test(dataProvider="userlogin",groups ={"sanity"})
  public void verifyLogin(String user1,String pass1) {
	  
	  LoginPage page=new LoginPage(driver);
	  
	  page.doLogin(user1, pass1);
	  
	  
	  String actualtitle=driver.getTitle();
		String expectedtitle=Constants.logintitle;
		SoftAssert sf=new SoftAssert();
		sf.assertEquals(actualtitle, expectedtitle);
		
		
		sf.assertAll();
	  
  }
  
  
  
  @BeforeMethod
	  
	  public void openBrower() {
		  
		  driver.get("http://demo.guru99.com/test/newtours/index.php");
	  }
 
  
  @AfterMethod
  
  public void afterMehod(ITestResult result) throws IOException{
	  
	  
 driver.get("http://demo.guru99.com/test/newtours/index.php");
	  
	  
	  if(result.getStatus()==ITestResult.FAILURE) {
		  
		  TakesScreenshot shot=(TakesScreenshot)driver;
		  File sourcefile=shot.getScreenshotAs(OutputType.FILE);
		  
		  File destfile=new File("C:\\Eclipsesoftwares\\MercuryPomConcept\\TakesScreenshots\\"+"failedtest4"+".png");
			FileUtils.copyFile(sourcefile, destfile);
//		  String filename=new SimpleDateFormat("yyyy_MM_dd_hh_mm'.png'").format(new Date());
//		  FileUtils.copyDirectory(sourcefile, new File("C:\\Eclipsesoftwares\\MercuryPomConcept\\TakesScreenshots\\"+result.getName()+filename));
	  }
	  

  }
  
  @DataProvider(name="userlogin")
  public Object[][] loginData() throws IOException, InvalidFormatException{
	  
	  Object[][] data=ExcelRead.getDataFromExcel("C:\\Eclipsesoftwares\\MercuryPomConcept\\ExcelData\\MercuryTestData.xlsx", "HomePageLogin");
	  
	return data;
  }
}
