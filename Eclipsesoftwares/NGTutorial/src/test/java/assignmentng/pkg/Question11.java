package assignmentng.pkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Question11 {
	
	WebDriver driver;
  @Test
  public void verifyMultipleActions() throws InterruptedException {
	  
	  WebElement support=driver.findElement(By.xpath("//li[@class='dropdown']//a[starts-with(text(),'Support')]"));
	  WebElement learn= driver.findElement(By.xpath("//li[@class='dropdown']//a[(text()='Learning Center')]"));
  
	  Actions act=new Actions(driver);
	  act.moveToElement(support).moveToElement(learn).click().build().perform();
	  driver.navigate().back();
	  
	WebElement iframe=driver.findElement(By.className("demo-frame"));
	driver.switchTo().frame(iframe);
	 WebElement drag=driver.findElement(By.id("draggable")); 
	  
	 WebElement drop=driver.findElement(By.id("droppable")); 
	  
	  act.dragAndDrop(drag, drop).perform();
  
  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Program Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
	 
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://jqueryui.com/droppable/");
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();  
	  
  }

}
