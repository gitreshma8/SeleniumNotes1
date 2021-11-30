package testngclass.pckg;

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

public class TabOpen {
	
	WebDriver driver;
	
  @Test
  public void verifyWindowOpen() throws AWTException, InterruptedException {
	  
	  Robot robo=new Robot();
	  robo.keyPress(KeyEvent.VK_CONTROL);
	  robo.keyPress(KeyEvent.VK_T);
	  
	  robo.keyRelease(KeyEvent.VK_CONTROL);
	  robo.keyRelease(KeyEvent.VK_T);
	  
	  Thread.sleep(2000);
	  
	  String parentwind=driver.getWindowHandle();
	  System.out.println("Parent window is :"+parentwind);
	  Set<String> childwin=driver.getWindowHandles();
	  System.out.println("Child window is :"+childwin);
	  
	  Iterator<String> itr= childwin.iterator();//for multiple tab
	  
	  while(itr.hasNext()) {
		  
		  String currentpoint=itr.next();
		  
		  if(!currentpoint.equals(parentwind)) {
			  
			  driver.switchTo().window(currentpoint);
			  Thread.sleep(2000);
			  
			  driver.get("http://demo.guru99.com/test/newtours/");
		  }		  
		 
	  }
	  driver.switchTo().window(parentwind);//if we need ,we can switch to parent window and provide url to load in this window
	  driver.get("https://www.ebay.com/");//active window closed
	  
	  Thread.sleep(1000);
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		
	  
	   	driver=new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("http://demo.guru99.com/test/newtours/");//url will be giving in above tab/window @test
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
	driver.close();
	  
  }

}
