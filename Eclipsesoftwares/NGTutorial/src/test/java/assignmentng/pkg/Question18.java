package assignmentng.pkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class Question18 {
	
	WebDriver driver;
	
  @Test
  public void crossBrowser() {
	  
  }
  

@Parameters({"browser"})
  @BeforeTest
  public void beforeTest(String browsername) {
	  
	  
	  if(browsername.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver(); 
	  }
	  
	  else if(browsername.equalsIgnoreCase("ie")) {
		  System.setProperty("webdriver.ie.driver", "C:\\Program Softwares\\Selenium drivers\\IEDriverServer.exe");
		  driver=new InternetExplorerDriver();	   
		  
	  }
	  
	 
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
