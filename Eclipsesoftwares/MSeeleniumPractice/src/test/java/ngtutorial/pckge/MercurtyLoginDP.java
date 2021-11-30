package ngtutorial.pckge;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class MercurtyLoginDP {
	
	WebDriver driver;
	
  @Test(dataProvider="datamercury-provider",dataProviderClass=DataProviderInherit.class)
  public void verifyLogin(String usernme,String pwd) {
	  
	  driver.findElement(By.name("userName")).sendKeys(usernme);
	  driver.findElement(By.name("password")).sendKeys(pwd);
	  driver.findElement(By.name("submit")).click();
//	  String msg=driver.findElement(By.xpath("//input[@name='password']//following::span")).getText();
//	  Assert.assertEquals(msg.contains("userName and password correct"), true);
	 
  }
  
  @BeforeTest
  public void openBrowser() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	  driver.get("http://demo.guru99.com/test/newtours/index.php");
	  
	  
  }

  
 
  
  @AfterTest
  public void closeBrowser() {
	  
	  driver.close();
	  
  }

}
