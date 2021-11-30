package selpractice.pckge;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListofWebELements {

	public static void main(String[] args) {
	
		System.setProperty("Webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/newtours");
		
		WebElement leftflight=driver.findElement(By.linkText("Flights"));
		leftflight.click();
		
		List<WebElement> radiobtn=driver.findElements(By.name("tripType"));
		
		radiobtn.get(0).click();
		
		boolean round=radiobtn.get(0).isSelected();
		radiobtn.get(1).click();
		
		boolean oneway=radiobtn.get(1).isSelected();
		
		
	}

}
