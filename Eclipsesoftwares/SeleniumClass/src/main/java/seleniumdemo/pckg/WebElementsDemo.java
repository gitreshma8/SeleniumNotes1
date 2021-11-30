package seleniumdemo.pckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsDemo {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Program Softwares\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		WebElement username=driver.findElement(By.name("userName"));
		WebElement password=driver.findElement(By.name("password"));
		WebElement submit=driver.findElement(By.name("submit"));
		
		
		username.sendKeys("tutorial");
						
		password.sendKeys("tutorial");//.sendkeys for passing values/inputs in text area
		
		username.clear();
		driver.wait();
		
//		username.clear();
		submit.click();//.click for button
		
		driver.navigate().back();
		
//		driver.close();
	}

}
