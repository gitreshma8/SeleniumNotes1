package testngclass.pckg;

import org.testng.annotations.Test;

import testngmainclass.pckg.ExcelReadDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class ExcelReadLogin {
	
	WebDriver driver;
	
  @Test(dataProvider = "loginData")
  public void verifyLogin(String Username, String Password) {
	  
	  driver.get("http://demo.guru99.com/test/newtours"); 
	  WebElement usernamefld=driver.findElement(By.name("userName")); 
	  WebElement passwordfld=driver.findElement(By.name("password"));
	  WebElement submitbtn=driver.findElement(By.name("submit"));
	  
	  usernamefld.sendKeys(Username); //passing from above parameters via excel
	  passwordfld.sendKeys(Password); 
	  submitbtn.click(); 
	  
	  String msg=driver.findElement(By.xpath("//input[@name='password']//following::span")).getText();
	  Assert.assertTrue(msg.contains("userName and password correct"));//-ve testcase
	  
	  String actualtitle=driver.getTitle();	
	  String expectedtitle="Welcome: Mercury Tours"; 
	 
	  Assert.assertEquals(actualtitle, expectedtitle);
  }

  @DataProvider
  public Object[][]loginData() throws InvalidFormatException, IOException {
	  
	  Object[][] data=ExcelReadDemo.getDataFromExcel("C:\\AObsqura\\DataProvider\\LoginVerfication.xlsx", "logindetails");
	  
    return data;         
      
      }
  
  
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();	  
	  	  	  
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
