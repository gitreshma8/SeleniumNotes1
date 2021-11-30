package assignmentng.pkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Question15 {
	
	WebDriver driver;
	
  @Test
  public void handleAlerts() {
	
	  driver.findElement(By.name("cusid")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@value='Submit']")).click();
	  
	 Alert al=driver.switchTo().alert();
	 al.accept(); 
	 
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
	
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://demo.guru99.com/test/delete_customer.php");
	  
  }

  @AfterTest
  public void afterTest() {
	 
//	  driver.close();
	  
  }

}
