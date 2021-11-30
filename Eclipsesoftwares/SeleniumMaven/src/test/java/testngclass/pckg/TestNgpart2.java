package testngclass.pckg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class TestNgpart2 {
	
	WebDriver driver;//declaring as global
	
  @Test(priority=1)
    
  public void verifyLogin() {
	  

		WebElement username=driver.findElement(By.name("userName"));
		WebElement password=driver.findElement(By.name("password"));
		WebElement submit=driver.findElement(By.name("submit"));
		
		
		username.sendKeys("tutorial");						
		password.sendKeys("tutorial");
		submit.click();
	  
  }
  
  
  @Test(priority=2,enabled=true)//setting order for execution,ow will go with alphabetical order of methods
  
  //if we set this test false;it wont execute
  public void verifyDropdown() {//next test for dropdown method
	  
	  
	  
	  WebElement Flights1=driver.findElement(By.linkText("Flights"));//need full link name
		
		Flights1.click();
		
		WebElement arrivedrop=driver.findElement(By.name("toPort"));
		
		Select toPort=new Select(arrivedrop);
		toPort.selectByIndex(3);
  
  }
  
  @Test(priority=3)
  public void verifyRadioButton() {
	  
	  List<WebElement> radiobutton =driver.findElements(By.name("tripType"));
	  radiobutton.get(1).click();
	 	  
  }
  
  @Test(priority=4)
  public void verifyCheckbox() {
	  
	  driver.findElement(By.linkText("Checkbox Demo")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Check Box One')]")).click();
		
		System.out.println("checked Check Box One");
	 	  
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
