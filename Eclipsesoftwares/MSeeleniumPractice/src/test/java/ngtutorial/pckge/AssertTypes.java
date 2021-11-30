package ngtutorial.pckge;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AssertTypes {
	
	WebDriver driver;
	SoftAssert sf;
	
	
  @Test (enabled=false)
  public void verifyTitle(){
	  
//	  String actualtitle=driver.getTitle();
//	  String expectedtitle="Electronics, Cars, Fashio, Collectibles & More | eBay";
//	  Assert.assertEquals(actualtitle, expectedtitle,"failed to verify title");
	  
//	  Assert.assertEquals(driver.getTitle(), "Electronics, Cars, Fashion, Collectibles & More | eBay", "failed to verify title");
//	  System.out.println("Title ae same");
	  
  }
//  @Test(priority=1)
//  public void hardASsert1() {
//	  
//	  sf=new SoftAssert();
//	  
//	  String actualtitle=driver.getTitle();
//	  String expectedtitle="Electronics, Cars, Fashio, Collectibles & More | eBay";
//	  Assert.assertEquals(actualtitle, expectedtitle,"failed to verify title");
//	 
//	 
//	  sf.assertAll();
//	  
//	  
//  }
  
  @Test 
  public void verifyHardAssert(){
	  
	  String actualtitle=driver.getTitle();
	  String expectedtitle="Electronics, Cars, Fashion, Collectibles & More | eBay";
	  Assert.assertEquals(actualtitle, expectedtitle, "failed!!!");
  }
  @Test(priority=3,enabled=false)
  public void softASsert1() {
	  
	  String actualtitle=driver.getTitle();
	  String expectedtitle="Electronics, Cars, Fashio, Collectibles & More | eBay";
	  
	  sf=new SoftAssert();
	  sf.assertEquals(actualtitle, expectedtitle,"Title are not same");
	  System.out.println("Titles are same");
	  
	  String actualurl=driver.getCurrentUrl();
	  String expectedurl="https://www.eba.com/";
	  
	  sf.assertEquals(actualurl, expectedurl,"Url failed");
	  System.out.println("Used assert all to collect exceptions");

	  
	 sf.assertAll();
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.ebay.com/");
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }
  

}
