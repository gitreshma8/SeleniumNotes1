package assignmentng.pkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Question9User2 {

	WebDriver driver;
	
	@Parameters({ "url","username", "password"})
  @Test
  public void verifyUser2Login(String url,String username,String password) {
		
		 driver.get(url);
		WebElement user=driver.findElement(By.name("userName"));
		WebElement pass=driver.findElement(By.name("password"));
		WebElement submit=driver.findElement(By.name("submit"));
		
		user.sendKeys(username);
		pass.sendKeys(password);
		submit.click();
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  
  }

}
