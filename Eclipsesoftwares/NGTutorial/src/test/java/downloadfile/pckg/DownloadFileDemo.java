package downloadfile.pckg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DownloadFileDemo {
	
	WebDriver driver;
	
  @Test
  public void verifyDownloadFile() throws IOException {
	  
	  WebElement downloadbtn=driver.findElement(By.id("messenger-download"));
	  String src=downloadbtn.getAttribute("href");
	  
	  //Wget is a small and easy-to-use command-line program used to automate downloads.
	  // setting both wget and file to be downloaded in  location
	  
	  //Setting up Wget  Step 1: In your C Drive, create a new folder and name it as “Wget”.

	 // Download wget.exe from here and Place it in the Wget folder you created from the step above.
	  String wget_command = "cmd /c C:\\AObsqura\\Wget\\wget.exe -P C:\\AObsqura\\DownloadFiles --no-check-certificate " + src;

      Runtime.getRuntime().exec(wget_command);

  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe"); 		
		 driver=new ChromeDriver(); 		
		driver.manage().window().maximize(); 	
		driver.get("http://demo.guru99.com/test/yahoo.html");
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	  
  }

}
