package assignmentng.pkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Question10 {
	
	WebDriver driver;
	
  @Test
  public void homePageFields() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']"));
	  driver.findElement(By.xpath("//div[@class='main-header']")).getText();
	  driver.findElement(By.xpath("//h5[contains(text(),'Student Registration Form')]"));
	  driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Ram");
	  driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Pandit");
	  driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("d@dh.com");
	  driver.findElement(By.xpath("//label[text()='Male']")).click();
	  driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("9876456787");
	  WebElement dob=driver.findElement(By.id("dateOfBirthInput"));
	  dob.click();
	  WebElement dobselect=driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--009']"));
	  dobselect.click();
	  driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys("Biolgy","Maths");
	  driver.findElement(By.xpath("//label[text()='Reading']")).click();
	  driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("C:\\Eclipsesoftwares\\NGTutorial\\ExcelData\\Mercurylogin.xlsx");
	  driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("123 abc lane tvm");
	  
//	  WebElement state=driver.findElement(By.xpath("//div[text()='Select State']//following::div[@class='css-2613qy-menu']"));
//	  WebElement state=driver.findElement(By.xpath("//div[@class=' css-tlfecz-indicatorContainer']"));
//	 Select statedrp=new Select(state);
//	 statedrp.selectByIndex(1);
//	 WebElement city=driver.findElement(By.xpath("//div[text()='Select City']"));
//	 Select sdrp=new Select(city);
//	 sdrp.selectByIndex(1);
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,1000)");
	  driver.findElement(By.xpath("//button[@id='submit']")).click();
	  
	  js.executeScript("window.scrollBy(0,1000)");
	 
	  WebElement close=driver.findElement(By.xpath("//button[@id='closeLargeModal']"));	 
	  js.executeScript("arguments[0].click();", close);
	  
	  WebElement header=driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']"));
	  js.executeScript("arguments[0].scrollIntoView();", header);
	  
	  String actualtitle=driver.getTitle();
	  
		 Assert.assertTrue(actualtitle.contains("Tools"));
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://demoqa.com/automation-practice-form");
	  
  }

  @AfterTest
  public void afterTest() {
	  
//	  driver.close();
	
  }

}
