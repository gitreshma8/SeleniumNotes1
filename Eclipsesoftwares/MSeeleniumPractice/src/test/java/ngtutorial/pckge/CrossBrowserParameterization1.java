package ngtutorial.pckge;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class CrossBrowserParameterization1 {
	
	WebDriver driver;
	
	
  @Test
  public void verifyLogin() {
	  
	  driver.findElement(By.name("userName")).sendKeys("tutorial");
	  driver.findElement(By.name("password")).sendKeys("tutorial");
	  driver.findElement(By.name("submit")).click();
  }
  
  
  @Parameters({"browser"})
  @BeforeTest
  public void beforeTest(String browsername) {
	  
	  if(browsername.equalsIgnoreCase("chrome")) {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
			 
		  driver=new ChromeDriver();
	  }
		  
		  else if(browsername.equalsIgnoreCase("IE")) {//since its equalignorecase itwill ignorecasesensitive issues
			  
			  System.setProperty("webdriver.ie.driver", "C:\\Program Softwares\\Selenium drivers\\IEDriverServer.exe");
			  driver=new InternetExplorerDriver();
		  }
	
	  
	  
	 
	  driver.manage().window().maximize();
	  driver.get("http://demo.guru99.com/test/newtours/index.php");
	  
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  
	  
	  driver.close();
  }

}
