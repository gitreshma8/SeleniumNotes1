package seleniumdemo.pckg;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class WaitTypess {

	public static void main(String[] args) {
	
		
System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); //Implicit wait..it will active from the given line of code
		
//	Explicit wait
		
//	WebDriverWait wait = new WebDriverWait(driver,60);
//		WebElement usernamefld=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Select Input"))); 
		
				
		//fluent wait
		Wait<WebDriver> waits = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				
				.ignoring(Exception.class);
		WebElement selectinput=waits.until(ExpectedConditions.elementToBeClickable(By.linkText("Select Input")));
		
		
//		waits.until(ExpectedConditions.elementToBeClickable(By.linkText("Select Input"))).click();//return type void
		
//		WebElement selectinput=driver.findElement(By.linkText("Select Input"));//need full link name		
		selectinput.click();
		
		
		
		WebElement singleinput=driver.findElement(By.id("single-input-field"));		
		Select singledrop=new Select(singleinput);
					
//		singledrop.selectByValue("-- Select --");
		
		
		
		singledrop.selectByIndex(1);
		singledrop.selectByIndex(2);
		singledrop.selectByIndex(3);
		
		

	}

}
