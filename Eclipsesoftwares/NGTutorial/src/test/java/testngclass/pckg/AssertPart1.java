package testngclass.pckg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AssertPart1{
	
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
		
		Assert.assertEquals(actualtitle, expectedtitle);//comparing using .equal()
		
	  
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
		Assert.assertEquals(actualoption, expectdoption,"expected value is not selected");//using assetequals(), 3rd parameter msg will print,if this test failed
		
		
  }
  
  @Test(priority=3)
  public void verifyRadioButton() {
	  
	  List<WebElement> radiobutton =driver.findElements(By.name("tripType"));
	  radiobutton.get(1).click();
	  
	  boolean actualvalue=radiobutton.get(2).isSelected();
	  
	  Assert.assertTrue(actualvalue);//boolean case ,so assert true
//	  Assert.assertFalse(actualvalue);
//	  Assert.assertFalse(false);
//	  Assert.assertTrue(true);//either true or the boolean value which is also true value
	
	 	System.out.println("failed case,this statement wont execute");  
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
