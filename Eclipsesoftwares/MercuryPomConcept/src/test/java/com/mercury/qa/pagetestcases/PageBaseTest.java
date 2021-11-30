package com.mercury.qa.pagetestcases;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;




public class PageBaseTest {
	
	
 WebDriver driver;

 @Parameters({"browser"})
 @BeforeTest
 
 public void browserSetup(String browsername) {
	 
	 
	 if(browsername.equals("chrome")) {
	 
	 System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe"); 		
	   driver=new ChromeDriver(); 		
	 }
	 
	 else if(browsername.equals("Firefox")) {
		 
		 System.setProperty("webdriver.gecko.driver", "C:\\Program Softwares\\Selenium drivers\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		 driver=new FirefoxDriver();
	 }
	  
	   driver.manage().window().maximize(); 	
	   driver.get("http://demo.guru99.com/test/newtours/index.php");
 }
 
 
// 
// @BeforeTest
// public void browserSetup() {
//	  	
//	 
//	 System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe"); 		
//	   driver=new ChromeDriver();
//		driver.manage().window().maximize(); 	
//		driver.manage().timeouts().implicitlyWait( WaitUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
//		 driver.get("https://demoqa.com/automation-practice-form");
//		 
// }

 
 @AfterTest 
 
 public void closeBrowser() {
	 
	 driver.close();
 }
}
