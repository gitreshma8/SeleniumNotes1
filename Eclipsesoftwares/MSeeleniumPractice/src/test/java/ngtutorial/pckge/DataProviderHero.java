package ngtutorial.pckge;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class DataProviderHero {
	
	WebDriver driver;
	
  @Test(dataProvider="data-provider",dataProviderClass=DataProviderInherit.class)//linked with dataprovider class
  public void verifyLogin(String uname,String pword) {
	  
	  driver.findElement(By.name("username")).sendKeys(uname);
	  driver.findElement(By.name("password")).sendKeys(pword);
	  driver.findElement(By.xpath("//i[contains(text(), Login)]")).click();
	  String msg=driver.findElement(By.xpath("//div[@id='flash']")).getText();
	  Assert.assertEquals(msg.contains("is invalid!"), true);
	  
  }
  @BeforeTest
  public void openBrowser() {
	  
	  System.out.println("Set up chrome");
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver(); 
	  driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.get("https://the-internet.herokuapp.com/login");
	  
  }

  @AfterTest
  public void closeBrowser() {
	  
	  System.out.println("Closethe Browser");
	  driver.close();
	  
	
	
	  
	  
  }

}
