package assignmentng.pkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Question16 {
	
	WebDriver driver;
  @Test
  public void verifyDragDrop() {
	  
	  
	  WebElement iframe=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(iframe);
		 WebElement drag=driver.findElement(By.id("draggable")); 
		  
		 WebElement drop=driver.findElement(By.id("droppable")); 
		 
		 Actions act=new Actions(driver);
		  
		  act.dragAndDrop(drag, drop).perform();
		  
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
	  
	  driver.close();
  }

}
