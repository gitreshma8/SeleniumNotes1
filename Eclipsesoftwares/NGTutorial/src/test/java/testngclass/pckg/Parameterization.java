package testngclass.pckg;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;


public class Parameterization {
	
	WebDriver driver;
	String userName,password;
	
@Parameters({"userName","password"})//1st xml parameters pass here & it has value from xml,any string :not relate to DOM//import testng
@Test
  public void verifyParameterLogin(String userName,String password) {////passing to this method ;getting values from above parameters
	  

		WebElement user=driver.findElement(By.name("userName"));
		WebElement pass=driver.findElement(By.name("password"));
		WebElement submit=driver.findElement(By.name("submit"));
		
		
		user.sendKeys("username");		//2nd , parameters pass to sendkeys method			
		pass.sendKeys("password");
		submit.click();
	  
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("http://demo.guru99.com/test/newtours/index.php");
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	  
  }

}
