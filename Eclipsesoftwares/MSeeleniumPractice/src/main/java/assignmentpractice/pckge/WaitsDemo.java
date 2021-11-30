package assignmentpractice.pckge;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsDemo {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//declaration of fluent wait
		Wait<WebDriver> waits = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				
				.ignoring(Exception.class);
		
		driver.manage().window().maximize();		
		driver.get("https://www.google.com/");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//implicitwait
	
//		WebDriverWait mywait=new WebDriverWait(driver,10);//explicitwait
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
//		WebElement text1=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Selenium']")));
//		driver.findElement(By.xpath("//h3[text()='Selenium']")).click();//sometimes this elt maynot be visible immediately so use explicit wait
//		text1.click();
		
//		By elelocator=By.xpath("//h3[text()='Selenium']");
//		waitForElementPresent( driver,By elelocator,10);
//		
//		//generic method for explicit to call multiple elements in a single method instead of adding explicit to each and every element
//	public static WebElement waitForElementPresent(WebDriver driver,By locator,int timeout) {
//		WebDriverWait mywait=new WebDriverWait(driver,TimeUnit.SECONDS);
//		
//		mywait.until(ExpectedConditions.presenceOfElementLocated(locator));
//		
//		return.driver.findElement(locator);
//	}
		
		//usage of Fluent wait
		
		
	}

}
