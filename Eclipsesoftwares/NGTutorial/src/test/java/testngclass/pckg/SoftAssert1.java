package testngclass.pckg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert1 {
	
	WebDriver driver;//declaring as global
	
  @Test(priority=1)
    
  public void verifyLogin() {
	  

		WebElement username=driver.findElement(By.name("userName"));
		WebElement password=driver.findElement(By.name("password"));
		WebElement submit=driver.findElement(By.name("submit"));
		
		
		username.sendKeys("tutorial");						
		password.sendKeys("tutorial");
		submit.click();
		
		String actualtitle=driver.getTitle();
		String expectedtitle="Login: Mercury Tours";
		SoftAssert sf=new SoftAssert();
		sf.assertEquals(actualtitle, expectedtitle);
		sf.assertAll();
		
	  
  }
  
  
  @Test(priority=2,enabled=true)//setting order for execution,ow will go with alphabetical order of methods
  
  //if we set this test false;it wont execute
  public void verifyDropdown() {//next test for dropdown method
	  
	  
	  
	  WebElement Flights1=driver.findElement(By.linkText("Flights"));//need full link name
		
		Flights1.click();
		
		WebElement arrivedrop=driver.findElement(By.name("toPort"));
		
		Select toPort=new Select(arrivedrop);
		toPort.selectByIndex(3);
		WebElement option=toPort.getFirstSelectedOption();
		
		String actualoption=option.getText();
		String expectdoption="New York";
		SoftAssert sf=new SoftAssert();//can use same obj (local variable)
		
		sf.assertEquals(actualoption, expectdoption,"expected value is not selected");//using assetequals()
		
		sf.assertAll();//always
  }
  
  @Test(priority=3)
  public void verifyRadioButton() {
	  
	  List<WebElement> radiobutton =driver.findElements(By.name("tripType"));
	  radiobutton.get(0).click();
	  
	  List<WebElement> radiobutton2= driver.findElements(By.name("servClass"));
	  radiobutton2.get(1).click();
	  
//	  System.out.println(radiobutton2.get(1).getText());
	  boolean actualvalue=radiobutton.get(0).isSelected();
	  boolean actualvalue2=radiobutton2.get(1).isSelected();
	  
	  SoftAssert sf=new SoftAssert();
	  
	  sf.assertTrue(actualvalue);//boolean case so assert true
//	  sf.assertTrue(actualvalue2);
	  sf.assertFalse(false);
	  
	  
	  sf.assertAll();
	  
	  
	 	  
  }

  
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		
	  
	   driver=new ChromeDriver();//already declared driver as global variable of WebDriver's IInterface ,so no need to add WebDriver here
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
	
		
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	  
  }

}
