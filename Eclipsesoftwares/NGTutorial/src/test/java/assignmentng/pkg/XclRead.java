package assignmentng.pkg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class XclRead{
	
	WebDriver driver;
	
	 
	
  @Test
  public void verifyTitle() throws Exception {
	  
	  File src=new File("C:\\Eclipsesoftwares\\NGTutorial\\src\\test\\resources\\verifyTitle.xlsx");
	  
	  FileInputStream fis=new FileInputStream(src);
	  XSSFWorkbook  wbook=new XSSFWorkbook(fis);
	  XSSFSheet sheet1= wbook.getSheetAt(0);//1st sheet from workbook using index
	  
	  String expectedtitle=sheet1.getRow(0).getCell(1).getStringCellValue();
	  String actualtitle=driver.getTitle();
  
	  Assert.assertEquals(actualtitle, expectedtitle,"Titles are not same!");
	  
	  System.out.println(expectedtitle);
	  System.out.println(actualtitle);	
	  
	    }
   
  
  @BeforeTest
  public void beforeTest() {
	  
	  
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	  
  }
  

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
