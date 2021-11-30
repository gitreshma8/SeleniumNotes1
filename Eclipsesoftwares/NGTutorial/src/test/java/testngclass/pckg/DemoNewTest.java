package testngclass.pckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoNewTest {
	
	WebDriver driver;

  @Test
  public void f() throws InterruptedException {
	  
	  
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		 driver.findElement(By.id("btnLogin")).click();
		 
		 driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		 driver.findElement(By.xpath("//ul[@id='sidenav']//li[4]//a")).click();
		
		 driver.findElement(By.xpath("//tr[@class='odd']//td[2]//a")).click();
		 driver.findElement(By.id("dependent_name")).sendKeys("newname");
		 
		 driver.findElement(By.id("btnSaveDependent")).click();
		Thread.sleep(5000);
	WebElement save=driver.findElement(By.xpath("//div[@id='successDataModal']//child::div[2]"));
		 System.out.println(save.getText());
		 System.out.println("passed");
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe"); 		
		 driver=new ChromeDriver(); 		
		driver.manage().window().maximize(); 	
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers?userId=41");
  }
  
  }
