package testngclass.pckg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class XpathTypes {
	
	WebDriver driver;
	
  @Test
  public void xpathDemo() {
//		driver.findElement(By.xpath("//*[contains(text(),'Check Box One')]")).click();
	  
	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("tutorial");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("tutorial");
	  driver.findElement(By.xpath("//input[@name='submit']")).click();
	 System.out.println(driver.findElement(By.xpath("//h3[text()='Login Successfully']")).getText());
	  
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
