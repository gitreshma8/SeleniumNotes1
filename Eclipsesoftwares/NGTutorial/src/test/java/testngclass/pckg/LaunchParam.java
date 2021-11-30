package testngclass.pckg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class LaunchParam {
	
	WebDriver driver;
	
  @Test
  public void f() {
	    
	
	  
	  
  }
  
  @Parameters({"browser","browser1","browser2","browser3"})
  @BeforeTest
  public void beforeTest(String browser,String browser1,String browser2,String browser3) {
	  
	  //launching browser using parameterization
	  if(browser.equals("ie")) {
		  
		
		  System.setProperty("webdriver.ie.driver", "C:\\Program Softwares\\Selenium drivers\\IEDriverServer.exe");
		  driver=new InternetExplorerDriver();
	  }
	  
	  else if(browser1.equalsIgnoreCase("Edge")) {
		  
		  System.setProperty("webdriver.IE.driver", "C:\\Program Softwares\\Selenium drivers\\edgedriver_win64\\msedgedriver.exe");
		  driver=new EdgeDriver();
	  }
	  
	  else if(browser2.equalsIgnoreCase("Firefox")) {
		  
		  System.setProperty("webdriver.Firefox.driver", "C:\\Program Softwares\\Selenium drivers\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		  driver=new FirefoxDriver();
	  }
	    
	  else if(browser3.equalsIgnoreCase("Chrome")) {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  
	  }
	    
	  driver.manage().window().maximize();
	  
	  driver.get("http://demo.guru99.com/test/newtours/index.php");
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
