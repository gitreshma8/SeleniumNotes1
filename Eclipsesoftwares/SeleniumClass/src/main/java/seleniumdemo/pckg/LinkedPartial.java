package seleniumdemo.pckg;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class LinkedPartial {

	public static void main(String[] args) {
	
		
System.setProperty("webdriver.chrome.driver","C:\\Program Softwares\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		
		
		WebElement username=driver.findElement(By.name("userName"));
		WebElement password=driver.findElement(By.name("password"));
		WebElement submit=driver.findElement(By.name("submit"));
		
		WebElement Flights1=driver.findElement(By.linkText("Flights"));//need full link name
		
		Flights1.click();//webelement command click
		
		WebElement headergateway=driver.findElement(By.partialLinkText("Gateway"));//a part of large link
		headergateway.click();
		

	}

}
