package assignmentng.pkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Question12Upload {
	
	WebDriver driver;
  @Test(priority=1,enabled=false)
  public void uploadFile() {
	  
	  WebElement uploadelt=driver.findElement(By.id("uploadFile"));
	  uploadelt.sendKeys("C:\\Eclipsesoftwares\\NGTutorial\\ExcelData\\Mercurylogin.xlsx");
	  
  }
  
  
  @Test(priority=2)
  public void downloadFile() throws IOException {
	  
	  WebElement downloadelt=driver.findElement(By.id("downloadButton"));
	  String src=downloadelt.getAttribute("href");
	  
	  String wget_command = "cmd /c C:\\AObsqura\\Wget\\wget.exe -P C:\\AObsqura\\DownloadFiles --no-check-certificate " + src;

      Runtime.getRuntime().exec(wget_command);
	  
//	  try {
//	        Process exec = Runtime.getRuntime().exec(wget_command);
//	        int exitVal = exec.waitFor();
//	        System.out.println("Exit value: " + exitVal);
//	        } catch (InterruptedException | IOException ex) {
//	        System.out.println(ex.toString());
//	        }
//
//		}
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe"); 		
		 driver=new ChromeDriver(); 		
		driver.manage().window().maximize(); 	
		driver.get("https://demoqa.com/upload-download");
  }

  @AfterTest
  public void afterTest() {
	  
//	  driver.close();
	  
  }

}
