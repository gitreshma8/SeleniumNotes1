package selpractice.pckge;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementsCommnds {

	public static void main(String[] args) throws InterruptedException {
	
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe"); 
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("http://demo.guru99.com/test/newtours/");
		driver.get("https://bankwithpeoples.scdev.mortgagewebcenter.com/Account/Login?ReturnUrl=%2fApplyNow#/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label//b[text()='Start']")).click();
		driver.findElement(By.xpath("//button [@class='mui-button-primary mui-button-next ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-secondary']//span[@class='ui-button-text']")).click();

		driver.findElement(By.xpath("//div[@class='mui-question mui-question-textbox ']//input[@id='Q12359']")).sendKeys("d@d.com");
		driver.findElement(By.xpath("//div[@class='mui-question mui-question-textbox ']//input[@id='Q12360']")).sendKeys("d@d.com");
		driver.findElement(By.xpath("//div[@class='mui-question mui-question-date ']//input[@id='Q12358']")).sendKeys("09 09 1988");
		List<WebElement> shopping= driver.findElements(By.xpath("//li//input[@type='radio' and @name='Q2']//following::label//b"));
		shopping.get(0).click();
		
		
		js.executeScript("window.scrollBy(0,500)");
		
		
		List<WebElement> indi =driver.findElements(By.xpath("//legend[@id='LegendQ5']//following::div//input[@name='Q5']//following::label[contains(@for,'Q5.')]"));
				indi.get(0).click();
		
		List<WebElement> homesel= driver.findElements(By.xpath("//legend[@id='LegendQ13']//following::div//li//input[@name='Q13']//following::label"));
		
		homesel.get(2).click();
		
		WebElement element=driver.findElement(By.xpath("//select[@id='Q3']"));
		Select sel=new Select(element);
		sel.selectByIndex(1);
		
		driver.findElement(By.xpath("//button [@class='mui-button-primary mui-button-next ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-secondary']//span[@class='ui-button-text']")).click();
		
		
		WebElement state=driver.findElement(By.xpath("//select[@id='Q6']"));
		Select sel1=new Select(state);
		sel1.selectByIndex(1);
		//		WebElement userid=driver.findElement(By.name("userName"));
//		WebElement password=driver.findElement(By.name("password"));
//		WebElement submit=driver.findElement(By.name("submit"));
//		
//		
//		userid.sendKeys("tutorial");
//		password.sendKeys("tutorial");
//		submit.click();
//		
	}

}
