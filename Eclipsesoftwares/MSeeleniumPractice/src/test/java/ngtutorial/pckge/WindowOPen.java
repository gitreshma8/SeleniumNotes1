package ngtutorial.pckge;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class WindowOPen {
	
	WebDriver driver;
  @Test
  public void f() {
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
