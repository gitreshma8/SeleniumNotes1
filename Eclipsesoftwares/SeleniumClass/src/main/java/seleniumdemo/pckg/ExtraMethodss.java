package seleniumdemo.pckg;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtraMethodss {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Program Softwares\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		WebElement username=driver.findElement(By.name("userName"));
		WebElement password=driver.findElement(By.name("password"));
		WebElement submit=driver.findElement(By.name("submit"));
		
		
		
		
		username.sendKeys("tutorial");
		password.sendKeys("tutorial");
		
		boolean b1=username.isDisplayed();
		System.out.println("To check username displayed :"+b1);
		
		boolean e1=username.isEnabled();
		
		System.out.println("To check username enabled :"+e1);
		
		String usertagname=username.getTagName();
		System.out.println("UserTagname is :"+usertagname);
		
		String userattribute=username.getAttribute("name");
		System.out.println("UserAttribute value is :"+userattribute);
		
		Dimension d=password.getSize();//import selenium
		System.out.println("Password field Height is :"+d.height);
		System.out.println("Password field Width is :"+d.width);
		
		String color=username.getCssValue("color");
		System.out.println("Username color is :"+color);
		
		String backgroundcolor=submit.getCssValue("background-color");
		System.out.println("submit button background-color is :"+backgroundcolor);
		
		Point p=password.getLocation();//to get location based on pixel values		
		System.out.println("Xlocation is :"+p.x);//horizontal dimension--left most screen to this field
		System.out.println("Ylocation is :"+p.y);//vertical dimension;can use same obj p for both x &y
		
		username.clear();
		
	}

}
