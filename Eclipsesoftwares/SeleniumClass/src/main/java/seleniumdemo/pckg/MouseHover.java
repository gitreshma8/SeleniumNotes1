package seleniumdemo.pckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		WebElement supportlink=driver.findElement(By.linkText("Support"));
		WebElement Lerning=driver.findElement(By.linkText("Learning Center"));
		
		Actions act=new Actions(driver);
		act.moveToElement(supportlink).moveToElement(Lerning).click().build().perform();//combining 3 actions using build methd
		
	}

}
