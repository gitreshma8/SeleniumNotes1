package selpractice.pckge;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		WebElement moveaccount =driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		WebElement youraccntt =driver.findElement(By.xpath("//span[text()='Your Account']"));
		Actions act=new Actions(driver);
		
		act.moveToElement(moveaccount).moveToElement(youraccntt).click().build().perform();
			
	}

}
