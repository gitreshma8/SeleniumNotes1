package assignment.pckg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckElement {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		
		
		//The findElement method throws a NoSuchElementException exception when the element is not available on the page. 
		//Whereas, the findElements method returns an empty list when the element is not available or doesn't exist on the page
		
//		driver.findElement(By.linkText("Radio Buttons Dem"));
//		WebElement male=driver.findElement(By.id("inlineRadio"));//NoSuchElementException exception
//		male.click();
		
		List<WebElement> age=driver.findElements(By.name("student-gende"));//findelements wont throw exception..returns empty list
		

	}

}
