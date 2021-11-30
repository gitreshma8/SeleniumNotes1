package testngclass.pckg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ScrollConcept {
	WebDriver driver;
	
  @Test
  public void verifyScroll() {
	  
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  
	//removed null since we are not passing anything//can use it anywherebefore or @test
//		js.executeScript("window.scrollBy(0,1000)");
	
//		WebElement elment=driver.findElement(By.name("userName"));
		//to move to below element 
	  
	  
//		WebElement elmentbtm=driver.findElement(By.xpath("//a[contains(text(),'Software Configuration Management Tools')]"));
//		js.executeScript("arguments[0].scrollIntoView();", elmentbtm);//passing web element object
//		
//		WebElement elmenttop=driver.findElement(By.xpath("//h1[@itemprop='headline']"));
//			js.executeScript("arguments[0].scrollIntoView();", elmenttop);
			//can use auto scrolling ..google it
	  
	  
	 
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe"); 		
		 driver=new ChromeDriver(); 		
		driver.manage().window().maximize(); 	
		driver.get("http://demo.guru99.com/seo/page-6.html");
		
		
		
		
  }

  @AfterTest
  public void afterTest() {
	  
//	  driver.close();
  }

}
