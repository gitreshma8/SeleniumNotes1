package tablehandle.pckg;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;

import java.util.Iterator;
import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class UserResult {
	
	WebDriver driver;
	
	
	 @Test(priority=1)
	  public void login() {
		 
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		 driver.findElement(By.id("btnLogin")).click();

	 }
	
	
	
  @Test(priority=2)
  public void verifyTableData() {
	  
	  List<WebElement> columns=driver.findElements(By.xpath("//table[@id='resultTable']//thead//th"));
	  int columnSize=columns.size();
	  
	  List<WebElement> rows=driver.findElements(By.xpath("//table[@id='resultTable']//tbody//tr"));
	  int rowSize=rows.size();
	  
//	  List<WebElement> rows=driver.findElements(By.xpath("//table[@id='resultTable']//tbody//tr"));
//	  int rowSize=rows.size();
	  
	  driver.findElement(By.xpath("//table[@id='resultTable']//tbody//tr//td[2]/a"));
	  System.out.println("column count"+columnSize);
	  System.out.println("rows count"+rowSize);
	  
	  for(int i=0;i<columnSize;i++){
		  
		  String header=columns.get(i).getText();
		  System.out.print(" "+header);
	  }
	  
	  System.out.println();
	  
	  
	  for(int i=0;i<3;i++) {
		  
		  List<WebElement>userCellData=rows.get(i).findElements(By.tagName("td"));
		  for(int j=0;j<columnSize;j++) {
			  
			  String userName=userCellData.get(j).getText();
			  System.out.print(" "+userName);
		
		  }
		  System.out.println();
		  
	  }


  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe"); 		
		 driver=new ChromeDriver(); 		
		driver.manage().window().maximize(); 	
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers?userId=41");
  }

  @AfterTest
  public void afterTest() {
	  
//	  driver.close();
  }
  
}
