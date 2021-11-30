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
import org.testng.annotations.AfterTest;

public class TableHandler {
	
	WebDriver driver;
	
	
  @Test
  public void verifyTableData() {
	  
	  List<WebElement> headcols=driver.findElements(By.xpath("//table[@class='dataTable']//thead//tr//th"));
	  int colssize=headcols.size();
	
	  System.out.println("Number of colmns :"+colssize);
	  
	  List<WebElement> actualrows=driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
	  int rowscount=actualrows.size();
	  
	  System.out.println("Number of rows :"+rowscount);
	  
	  
	  
	// Printing table header of a web table assuming first row as header using for eac
//	  List<WebElement> headerdata=driver.findElements(By.xpath("//table[@class='dataTable']//thead//tr//th"));
//	  
//	  		for(WebElement header:headerdata ) {
//				System.out.print("    "+header.getText()+"");
//				}
	  		
	  		//Printing table header of a web table using for loop
	  for(int i=0;i<colssize;i++) {
		  
		  String headerval=headcols.get(i).getText();
		  System.out.print(" "+headerval);
	  }
					
  System.out.println();
	for(int i=0;i<rowscount;i++) {
		
		List<WebElement>colcelldata=actualrows.get(i).findElements(By.tagName("td"));
		
		for(int j=0;j<colssize;j++) {
			
			String eachcelldata=colcelldata.get(j).getText();
			System.out.print("  "+eachcelldata+"  ");
			
		}
		System.out.println();
		System.out.println();
	}
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe"); 		
		 driver=new ChromeDriver(); 		
		driver.manage().window().maximize(); 	
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
