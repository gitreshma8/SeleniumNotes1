package tableconcept.pkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TableConceptDemo {
	
	WebDriver driver;
	
	
  @Test
  public void tableScenario() { 
	  
	  
	  
	  List<WebElement> colmnlist=driver.findElements(By.xpath("//table[@class='dataTable']//thead//tr//th"));
	  int colsize=colmnlist.size();
	  
	  System.out.println(colsize);
	  
	  List<WebElement> rowlist=driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
	  int rowsize=rowlist.size();
	  
	  //take any of the td value to get the column/td value
//	  WebElement cellvalue=driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr[3]//td[2]"));
//	  
//	  String celldata=cellvalue.getText();
	  
	  
	  
	  
	  for(int i=0;i<rowsize;i++) {//we can use iterator also
		  
		  List<WebElement>celldetail=rowlist.get(i).findElements(By.tagName("td"));
		  
		  for(int j=0;j<colsize;j++) {
			  String cellval=celldetail.get(j).getText();
			  System.out.print(" "+cellval);
			  
		  }
		  
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
