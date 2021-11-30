package ngtutorial.pckge;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class ScreenShotConcept {
	
	WebDriver driver;
	
  @Test
  public void failedScenariodemo() {
	  
	  driver.findElement(By.name("userNam")).sendKeys("tutorial");
	  driver.findElement(By.name("password")).sendKeys("tutorial");
	  driver.findElement(By.name("submit")).click();
	  
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe"); 		
		 driver=new ChromeDriver(); 		
		driver.manage().window().maximize(); 	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		
		
  }
  
  
  @AfterMethod
  public void afterMethod(ITestResult result) throws Exception {
	  
	  if(ITestResult.FAILURE==result.getStatus()) {
		  
		 
			  TakesScreenshot shot=(TakesScreenshot)driver;
			File sourcefile=shot.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(sourcefile, new File("C:\\Users\\Reshma.Ambili\\eclipse-workspace\\MSeeleniumPractice\\ScreenShots\\"+result.getName()+".png"));
			
	  }	 

  }
	  @AfterTest
	  
	  public void afterTest() {
	  driver.close(); 

}
}
