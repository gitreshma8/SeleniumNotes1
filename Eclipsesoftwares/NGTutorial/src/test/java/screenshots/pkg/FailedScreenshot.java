package screenshots.pkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class FailedScreenshot {
	
	WebDriver driver;
  @Test
  public void failedDemo() {
	  
	  WebElement uploadElement = driver.findElement(By.id("uploadfil_0"));//type should be file
	  driver.findElement(By.id("terms")).click();
		uploadElement.sendKeys("C:\\Eclipsesoftwares\\NGTutorial\\ExcelData\\Mercurylogin.xlsx");
		driver.findElement(By.name("send")).click();
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe"); 		
		 driver=new ChromeDriver(); 		
		driver.manage().window().maximize(); 		
		driver.get("http://demo.guru99.com/test/upload");
		
  }

  @AfterMethod
  public void afterTest(ITestResult result) throws IOException {	  
	  
	
  if(result.getStatus()==ITestResult.FAILURE) {
	  
		  
			  TakesScreenshot shot=(TakesScreenshot)driver;
			File sourcefile=shot.getScreenshotAs(OutputType.FILE);

//			FileHandler.copy(sourcefile, new File(result.getName()+".png"));
//			FileUtils.copyFile(sourcefile, new File(result.getName()+".png"));
//			/Generate a unique filename for each save, by appending a timestamp or a GUID.
			
//			 String filename =  new SimpleDateFormat("yyyyMMddhhmmss'.png'").format(new Date());
			 String filename=new SimpleDateFormat("yyyy_MM_dd_hh_mm'.png'").format(new Date());
   FileUtils.copyFile(sourcefile, new File("C:\\Eclipsesoftwares\\NGTutorial\\Screenshots\\"+result.getName()+filename));
			
			
  }
	  
	   }
  
  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
