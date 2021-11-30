package selpractice.pckge;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMethodsCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.id("details-button")).click();
		
		driver.findElement(By.id("proceed-link")).click();
		
		driver.findElement(By.name("cusid")).sendKeys("23244");
		
		driver.findElement(By.name("submit")).click();
		
		Alert btn=driver.switchTo().alert();
		System.out.println(btn.getText());
		
		btn.accept();//or dismiss
		
		System.out.println(btn.getText());
		btn.accept();
		
		
		
		
	}

}
