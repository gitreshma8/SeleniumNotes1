package assignmentng.pkg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Question4 {
	
	WebDriver driver;	
	
	 SoftAssert sf;
	
	 Object driver1;
	
  @Test(priority=1)
  public void verifyTitle() {
	  
	  String actualtitle=driver.getTitle();
	  String expectedtitle="Obsqura Testing";
	  
	  //by hardAssert
	  Assert.assertEquals(actualtitle, expectedtitle,"Tiles are not same!");	  
	  
  }
  
  @Test(priority=2)
  public void verifyCurrentUrl1() {
	  
	  String actualurl=driver.getCurrentUrl();
	  String expectedurl="https://selenium.obsqurazone.com/simple-form-demo.php";
	  
	  //SoftAssert
	  sf=new SoftAssert();
	  sf.assertEquals(actualurl, expectedurl,"Urls are not same!");
	  sf.assertAll();
	 
  }
  
  @Test(priority=3)
  public void verifyNullValue() {
	  
	 	 Assert.assertNotNull(sf);	 	
//		Assert.assertNotNull(driver1, "Not initialised");
	 
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	  
  }
  

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }
}
