package testngclass.pckg;



import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class ParallelBrowserTesting {
	
	WebDriver driver;
	
	
  @Test
  public void f() {
	  
	  
  }
  
  @Parameters({"browser"})
  @BeforeTest
  public void beforeTest(String browsername) {
	  
	  if(browsername.equalsIgnoreCase("ie")) {
		 		  
		  System.setProperty("webdriver.ie.driver", "C:\\Program Softwares\\Selenium drivers\\IEDriverServer.exe");
		  driver=new InternetExplorerDriver();
	  }
	  
	  else if(browsername.equalsIgnoreCase("chrome")) {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
	 
		  driver=new ChromeDriver();
		  
		  
	  }
	  
	  driver.manage().window().maximize();
	  driver.get("http://demo.guru99.com/test/newtours/reservation.php");
	  System.out.println("Parallel Testing completed");
	  

  }
  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
