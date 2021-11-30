package assignmentng.pkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Question14_TabOpen {
	
	WebDriver driver;
	
  @Test
  public void tableOpenDemo() throws AWTException {
	  
	  Robot robo=new Robot();
	  robo.keyPress(KeyEvent.VK_CONTROL);
	  robo.keyPress(KeyEvent.VK_T);
	  
	  robo.keyRelease(KeyEvent.VK_CONTROL);
	  robo.keyRelease(KeyEvent.VK_T);
	  
	  
	  String parentwin=driver.getWindowHandle();
	 Set<String> childwin= driver.getWindowHandles();
	 Iterator<String> itr= childwin.iterator();
	 while(itr.hasNext()) {
		 
		 String currentpoint=itr.next();
		 
		 if(!currentpoint.equals(parentwin)) {
			 driver.switchTo().window(currentpoint);
			
			 driver.get("https://www.seleniumeasy.com/test/");
		 }
		 		
	 }
	 
  }
	  
  
  @BeforeTest
  public void beforeTest() {
	  

	  System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		
	  
	   	driver=new ChromeDriver();
		driver.manage().window().maximize();
		 
		 driver.get("http://ww7.demoaut.com/");
  }

  @AfterTest
  public void afterTest() {
	  
	  
		
		driver.close();
		
  }

}
