package seleniumdemo.pckg;



import java.util.List;

//import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListWebElements1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/newtours/");

		WebElement Flights1=driver.findElement(By.linkText("Flight"));//need full link name
		
		Flights1.click();
		
		List<WebElement> radiobutton =driver.findElements(By.name("tripType"));//import util list....both radio buttons returns in List of webelement
		
		radiobutton.get(0).click();//here user clicked only 0th radio button based on index/position.write one more line if we need next radio to click
		radiobutton.get(1).click();
		boolean round=radiobutton.get(0).isSelected();//called with same radiobutton obj for 0th index button
		boolean trip=radiobutton.get(1).isSelected();//called with same radiobutton obj for 1st index button
		
		System.out.println("To check rountrip radio selected :"+round);
		System.out.println("To check oneway radio selected :"+trip);
		
		
		
		

	}

}
