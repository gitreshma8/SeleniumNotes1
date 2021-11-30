package assignmentng.pkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Question17_Scoll {
	
	WebDriver driver;
  @Test
  public void verifyScrollUp() throws InterruptedException {
	  driver.findElement(By.id("firstName")).sendKeys("Ram");
	  driver.findElement(By.id("lastName")).sendKeys("Pandit");
	  driver.findElement(By.id("userEmail")).sendKeys("d@dh.com");
	  driver.findElement(By.xpath("//label[text()='Male']")).click();
	  driver.findElement(By.id("userNumber")).sendKeys("9876545678");
 WebElement dob=driver.findElement(By.id("dateOfBirthInput"));
 dob.click();
 WebElement dobselect=driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--009']"));
 dobselect.click();

	  driver.findElement(By.id("subjectsInput")).sendKeys("serwerw");
	  driver.findElement(By.xpath("//label[text()='Reading']")).click();
	  
	  driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Eclipsesoftwares\\NGTutorial\\ExcelData\\Mercurylogin.xlsx");
	  driver.findElement(By.id("currentAddress")).sendKeys("123 abc lane tvm");
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,1000)");
	  WebElement state=driver.findElement(By.xpath("//div[@class=' css-tlfecz-indicatorContainer']//*[@class='css-19bqh2r']"));
//	  Select sel=new Select(state);
//	  sel.selectByIndex(0);
	  
	  state.click();
	  
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//div[text()='Uttar Pradesh']")).click();
	//div[text()='Uttar Pradesh']

	  
	  js.executeScript("window.scrollBy(0,1000)");
	  driver.findElement(By.xpath("//button[@id='submit']")).click();
	  
	  js.executeScript("window.scrollBy(0,1000)"); 

	  WebElement close=driver.findElement(By.id("closeLargeModal"));
	  js.executeScript("arguments[0].click();", close);
	  
	  
	  
	  WebElement header=driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']"));
	  js.executeScript("arguments[0].scrollIntoView();", header);
	  
	  String actualtitle=driver.getTitle();
	  
	 Assert.assertTrue(actualtitle.contains("Tools"));
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Program Softwares\\Selenium Drivers\\geckodriver-v0.29.1-win64\\\\geckodriver.exe"); 		
		 driver=new FirefoxDriver(); 		
		driver.manage().window().maximize(); 	
		 driver.get("https://demoqa.com/automation-practice-form");
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
//	  driver.close();
  }

}
