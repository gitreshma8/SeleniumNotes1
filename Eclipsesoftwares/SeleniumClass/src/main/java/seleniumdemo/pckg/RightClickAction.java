package seleniumdemo.pckg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement button =driver.findElement(By.xpath("//span[text()='right click me']"));
		
		WebElement option=driver.findElement(By.xpath("//span[text()='Edit']"));
		
		Actions act=new Actions(driver);
		act.contextClick(button).perform();
		option.click();
		

		Alert alert1=driver.switchTo().alert();
		System.out.println("Alert message on right click action :"+alert1.getText());
		
		alert1.accept();
	}

}
