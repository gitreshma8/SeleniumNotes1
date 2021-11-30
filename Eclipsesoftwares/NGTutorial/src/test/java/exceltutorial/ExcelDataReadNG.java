package exceltutorial;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import testngmainclass.pckg.ExcelReadDemo;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class ExcelDataReadNG {
	
	WebDriver driver;
//	SoftAssert sf;
	
  @Test(dataProvider="Sigon1")
  public void mercuryLogin(String uname,String pwd) {
	  
	  driver.get("http://demo.guru99.com/test/newtours/index.php");
	  
	  WebElement signlink=driver.findElement(By.linkText("SIGN-ON"));
	  signlink.click();
	  
//	  String actual=driver.getTitle();//verifying title after navigation to Sign-On page
//	  String expected="Sign-on: Mercury Tours";
//	  sf.assertEquals(actual, expected);
	  
	  driver.findElement(By.name("userName")).sendKeys(uname);
	  driver.findElement(By.name("password")).sendKeys(pwd);
	  driver.findElement(By.name("submit")).click();
//	  String msg=driver.findElement(By.xpath("//h3[(text()='Login Successfully')]")).getText();
	  
//	  Assert.assertTrue(msg.contains("Login Successfully"));
//	  driver.findElement(By.linkText("SIGN-OFF")).click();
//	  sf.assertAll();
	  
  }
  
  
  @BeforeTest
  public void setupChrome() {
	  
	 System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  
  }
  
  @DataProvider(name="Sigon1")
  public Object[][] signonData() throws IOException, InvalidFormatException{
	  
	  Object[][] data=ExcelReadDemo.getDataFromExcel("C:\\Eclipsesoftwares\\NGTutorial\\ExcelData\\Mercurylogin.xlsx", "logindata");
	  
	return data;
  }

  @AfterTest
  public void closeBrowser() {
	  
	  driver.close(); 
	  
  }

}
