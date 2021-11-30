package com.mercury.qa.pagetestcases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver.Window;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mercury.qa.pages.PracticeFormPage;
import com.utility.ExcelRead;

public class PracticeFormTest extends PageBaseTest{
	
	PracticeFormPage form;
	

  @Test(dataProvider="formdata")	
  public void verifyPraticeFormTest(String first_name,String last_name,String mailfield,String mobile_num,
		  String subjectname,String file_path,String current_address) {
	
	  form =new PracticeFormPage(driver);
	  
	  form.fillPracticeForm(first_name, last_name, mailfield, mobile_num, subjectname,
			 file_path, current_address);
	  
	  String actualtitle=driver.getTitle();
	  
		 Assert.assertTrue(actualtitle.contains("Tools"));
	  
	  
	  
  }
  
  
  @DataProvider()
  
  public Object[][] formdata() throws InvalidFormatException, IOException{
	  
	  Object[][]data=ExcelRead.getDataFromExcel("C:\\Eclipsesoftwares\\MercuryPomConcept\\ExcelData\\MercuryTestData.xlsx", "ToolsQAFormTestData");
	return data;
	  
	  
  }
}
