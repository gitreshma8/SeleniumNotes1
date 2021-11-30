package selpractice.pckge;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ExtraCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		String page_title=driver.getTitle();		
		System.out.println("Page Title is :"+page_title);
		
		String url=driver.getCurrentUrl();
		System.out.println("Page url is :"+url);
		
//		String psource=driver.getPageSource();
//		System.out.println("Page Source is :"+psource);
		
		
		WebElement userid=driver.findElement(By.name("userName"));		
		WebElement pwd=driver.findElement(By.name("password"));		
		WebElement submitbutton=driver.findElement(By.name("submit"));
		
		userid.sendKeys("tutorial");
		pwd.sendKeys("tutorial");
//		submitbutton.click();
		userid.clear();
		
		
		
		String usertagname=userid.getTagName();
		System.out.println("TageName is  :"+usertagname);
		
		String tagvalue=userid.getAttribute("name");
		System.out.println("Attribute value is :"+tagvalue);
		
			Dimension d=userid.getSize();
			System.out.println("Height is :"+d.height);
			System.out.println("Width is :"+d.width);
			
			Point p=pwd.getLocation();
			System.out.println("Xlocation is :"+p.x);
			System.out.println("Xlocation is :"+p.y);
			
			boolean b1=submitbutton.isDisplayed();
			System.out.println(b1);
			
			boolean b2=userid.isEnabled();
			System.out.println(b2);
			
			WebElement leftFlights=driver.findElement(By.linkText("Flights"));
			leftFlights.click();
			
			WebElement leftmenu=driver.findElement(By.partialLinkText("Dest"));
			leftmenu.click();
			
		
			
	}

}
